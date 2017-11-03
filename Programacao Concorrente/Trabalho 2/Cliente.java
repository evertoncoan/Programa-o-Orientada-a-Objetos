import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Cliente
{
    static boolean parar;

    public static void main(String[] args) throws UnknownHostException, IOException
    {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5000);

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

        Thread readThred = startReadThread(input);

        while (!parar)
        {

        }

        try { input.close(); } catch (IOException e) { e.printStackTrace(); }
        try { out.close(); } catch (IOException e) { e.printStackTrace(); }
        try { socket.close(); } catch (IOException e) { e.printStackTrace(); }
        try { readThred.join(); } catch (InterruptedException e)
        { e.printStackTrace(); }
    }

    private static Thread startReadThread(ObjectInputStream input)
    {
        Thread readThread = new Thread()
        {
            public void run()
            {
                try
                {
                    while (true)
                    {
                        System.out.println("oi 2");//----------------------------------------------------
                        String hash = (String) input.readObject();
                        System.out.println("oi 5");//----------------------------------------------------
                        int intervaloA = (int) input.readObject();
                        int intervaloB = (int) input.readObject();

                        System.out.println("Intervalo recebido do servidor de "
                        + intervaloA + " até " + intervaloB);

                        codigo(intervaloA, intervaloB, hash);
                    }
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };

        readThread.start();
        return readThread;
    }

    public static void codigo(int intervaloA, int intervaloB, String hash) throws NoSuchAlgorithmException
    {
        long tempo = System.currentTimeMillis();

        for (int i = intervaloA; i <= intervaloB; i++)
        {
            String numero = String.format("%07d", i);

            String md5 = md5(numero);

            if (md5.equals(hash))
            {
                System.out.println("O código " + hash
                + " é produzido pelo número " + numero);

                tempo = System.currentTimeMillis() - tempo;

                System.out.println("O programa levou " + tempo
                + "ms para encontrar esse número.");
            }
        }
    }

    public static String md5(String entrada) throws NoSuchAlgorithmException
    {
        MessageDigest sha1 = MessageDigest.getInstance("MD5");
        byte[] saida = sha1.digest(entrada.getBytes());
        StringBuilder saidaStr = new StringBuilder();
        for (byte b : saida)
            saidaStr.append(String.format("%02x", b));
        return saidaStr.toString();
    }
}
