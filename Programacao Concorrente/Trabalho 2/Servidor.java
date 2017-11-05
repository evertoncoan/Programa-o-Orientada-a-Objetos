import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Servidor
{
	private static List<String> codigos;
    private static List<ObjectOutputStream> clientes;
    private static int max;
    private static int intervaloA;
    private static int hash;

    public static void main(String[] args) throws IOException
    {
    	codigos = Files.readAllLines(Paths.get("hashes.txt"));
        clientes = new ArrayList<>();
        max = 9999999;
        intervaloA = -200000;
        hash = 0;

        ServerSocket server = new ServerSocket(5000, 10);
        while (true)
        {
            System.out.println("Aguardando cliente conectar.");
            Socket s = server.accept();
            System.out.println("Nova conexao realizada");

            serveClient(s);
        }
    }

    private static void serveClient(Socket socket) throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
        //System.out.println("oi 1");//--------------------------------------------------------------
        synchronized (clientes)
        {
        	clientes.add(out);
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
                    intervaloA += 200000;
                    out.writeObject(intervaloA);
                    //System.out.println("oi 4");//----------------------------------------------------
                    out.flush();

                    String numero = (String) input.readObject();

                    if (numero.equals("-1"))
                    {
                        //System.out.println("Nao encontrado");//---------------------------------------
                        out.writeObject(false);
                        out.flush();
                        run();
                    } else if(numero.equals("-2"))
                    {
                        run();
                    } else
                    {
                    	System.out.println(numero + " produz o hash " + codigos.get(hash));
                        hash++;
                        intervaloA = -200000;
                        destribuidor(out);
                        out.writeObject(false);
                        out.flush();
                        run();
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

    private static void destribuidor(ObjectOutputStream out)
    {
        synchronized (clientes)
        {
            for (ObjectOutputStream stream : clientes)
            {
                if (stream != out)
                {
                	try
                    {
                        stream.writeObject(true);
                    }
                    catch (IOException e)
                    {
                        System.out.println("Não foi possível se comunicar com o cliente");
                    }
                }
            }
        }
    }
}

// git add .;git commit -m "mensagem";git push origin master
