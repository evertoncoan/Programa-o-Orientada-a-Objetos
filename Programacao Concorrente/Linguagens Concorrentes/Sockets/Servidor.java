import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread
{
    ServerSocket servSock;
    Socket cSock;
    
    public Servidor(ServerSocket servSock, Socket cSock)
    {
        this.servSock = servSock;
        this.cSock = cSock;
    }
    
    public void run()
    {
        System.out.println("Frango Frito.");
        
        try
        {
            ObjectOutputStream output = new ObjectOutputStream(
            cSock.getOutputStream());
            output.flush();
            ObjectInputStream input = new ObjectInputStream(
                cSock.getInputStream() );
            String mensagem = (String) input.readObject();
            System.out.println("Mensagem recebida do cliente: " + mensagem);
            String resposta = "Olá Cliente";
            output.writeObject(resposta);
            output.flush();
            cSock.close();
            servSock.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}