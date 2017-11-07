import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Servidor
{
	private static List<String> codigos;
    private static List<ObjectOutputStream> clientes;
    private static int intervaloA;
    private static int hash;
    private static Lock lock;
    private static PrintWriter salvar;

    public static void main(String[] args) throws IOException
    {
    	codigos = Files.readAllLines(Paths.get("hashes.txt"));
        clientes = new ArrayList<>();
        intervaloA = -200000;
        hash = 0;
        lock = new ReentrantLock();
        salvar = new PrintWriter("Numeros.txt");

        ServerSocket server = new ServerSocket(5000, 10);
        while (hash < 7)
        {
            System.out.println("Aguardando cliente conectar.");
            Socket s = server.accept();
            Socket aviso = server.accept();
            System.out.println("Nova conexao realizada");

            serveClient(s, aviso);
        }
    }

    private static void serveClient(Socket socket, Socket aviso) throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
        //System.out.println("oi 1");//--------------------------------------------------------------

        ObjectOutputStream enviar = new ObjectOutputStream(aviso.getOutputStream());
        enviar.flush();

        synchronized (clientes)
        {
        	clientes.add(enviar);
        }

        //out.writeObject(false);
        //out.flush();

        Thread socketThread = new Thread()
        {
            public void run()
            {
            	try
            	{

                    //System.out.println(codigos.get(hash));//--------------------------------------------
                    out.writeObject(codigos.get(hash));
                    out.flush();

                    //System.out.println("oi 3");//----------------------------------------------------
                    lock.lock();
                    intervaloA += 200000;
                    lock.unlock();

                    out.writeObject(intervaloA);
                    //System.out.println("oi 4");//----------------------------------------------------
                    out.flush();

                    String numero = (String) input.readObject();

                    if (numero.equals("-1"))
                    {
                        //System.out.println("Nao encontrado");//---------------------------------------
                        if (hash == 7) {
                        	out.writeObject("terminou");
                            out.flush();
                        	return;
                        }
                        else {
                        	run();
                        }
                    } else
                    {
                    	System.out.println(numero + " produz o hash " + codigos.get(hash));

                        lock.lock();
                        hash++;
                        intervaloA = -200000;
                        lock.unlock();

                        destribuidor(enviar);

                        salvar.println(numero);

                        if (hash == 7) {
                        	out.writeObject("terminou");
                            out.flush();

                        	System.out.println("Salvo\n");
                            salvar.close();
                            System.exit(0);
                        	return;
                        }
                        else {
                        	run();
                        }
                    }

            	} catch (IOException | ClassNotFoundException e) {
            		e.printStackTrace();
            	}
                try { input.close(); } catch (IOException e) {
                    e.printStackTrace(); }
                try { out.close(); } catch (IOException e) {
                    e.printStackTrace(); }
                try { socket.close(); } catch (IOException e) {
                    e.printStackTrace(); }
            }
        };
        socketThread.start();
    }

    private static void destribuidor(ObjectOutputStream enviar)
    {
        synchronized (clientes)
        {
            for (ObjectOutputStream stream : clientes)
            {
                if (stream != enviar)
                {
                	try
                    {
                        stream.writeObject(true);
                        stream.flush();
                    }
                    catch (IOException e)
                    {
                        System.out.println("Nao foi possível se comunicar com o cliente");
                    }
                }
            }
        }
    }
}

// git add .;git commit -m "mensagem";git push origin master
