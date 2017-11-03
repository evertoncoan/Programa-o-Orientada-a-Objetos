import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Servidor
{
	private static List<String> codigos;
    private static int max;
    private static int intervaloA;
    private static int intervaloB;

    public static void main(String[] args) throws IOException
    {
    	codigos = Files.readAllLines(Paths.get("hashes.txt"));
        max = 9999999;
        intervaloA = 0;
        intervaloB = 199999;

        ServerSocket server = new ServerSocket(5000, 10);
        while (true)
        {
            Socket s = server.accept();
            System.out.println("Nova conexão realizada");

            serveClient(s);
        }
    }

    private static void serveClient(Socket socket) throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
        System.out.println("oi 1");//--------------------------------------------------------------

        Thread socketThread = new Thread()
        {
            public void run()
            {
            	try
            	{
                System.out.println(codigos.get(0));//--------------------------------------------
                out.writeObject(codigos.get(0));
                out.flush();
                System.out.println("oi 3");//----------------------------------------------------
                out.writeObject(intervaloA);
                System.out.println("oi 4");//----------------------------------------------------
                out.flush();
                out.writeObject(intervaloB);
                out.flush();
            	} catch (IOException e) {
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
}

// git add .;git commit -m "mensagem";git push origin master
