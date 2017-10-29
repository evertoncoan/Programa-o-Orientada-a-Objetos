import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5000); 
            ObjectOutputStream output = new ObjectOutputStream(
                socket.getOutputStream()); 
            output.flush();
            ObjectInputStream input = new ObjectInputStream(
                socket.getInputStream() );
            String mensagem = "Olá Servidor";
            output.writeObject(mensagem); 
            output.flush();
            String resposta = (String) input.readObject();
            System.out.println("Mensagem recebida do servidor: " + resposta);
            socket.close();
        } catch (IOException | ClassNotFoundException e) { 
            e.printStackTrace(); 
        }
    }
}