import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main extends Thread
{
    public static void main(String[] args)
    {
        ServerSocket servSock;
        Socket cSock;
        
        try
        {
            servSock = new ServerSocket(5000, 3);
            cSock = servSock.accept();
            
            Servidor thread = new Servidor(servSock, cSock);
            thread.start();
        }
        catch (Exception e) { 
            e.printStackTrace(); 
        }
    }
}