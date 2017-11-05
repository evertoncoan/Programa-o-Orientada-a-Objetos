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
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cliente
{
    private static boolean parar;
    private static boolean pronto;
    private static Lock lock;
    private static Condition prosseguir;

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException
    {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5000);

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

        parar = false;
        pronto = false;
        lock = new ReentrantLock();
        prosseguir = lock.newCondition();

        Thread readThred = startReadThread(input, out);// Single Thread

        //lock =
        System.out.println("While");//---------------------------------------------------------------

        while (!pronto)
        {
            System.out.println("Começo While");//----------------------------------------------------
            lock.lock();
            prosseguir.await();
            System.out.println("input Cliente");//----------------------------------------------------
            parar = (boolean) input.readObject();
            lock.unlock();

            System.out.println("lock 4");//----------------------------------------------------
            lock.lock();
            try{
                prosseguir.signal();
            } finally {
                lock.unlock();
            }

			if (parar)
            {
                System.out.println("lock");//----------------------------------------------------
                lock.lock();
                System.out.println("await");//----------------------------------------------------
                prosseguir.await();
                System.out.println("boolean");//----------------------------------------------------
                parar = false;
                lock.unlock();
            }



        }

        try { input.close(); } catch (IOException e) { e.printStackTrace(); }
        try { out.close(); } catch (IOException e) { e.printStackTrace(); }
        try { socket.close(); } catch (IOException e) { e.printStackTrace(); }
    }

    private static Thread startReadThread(ObjectInputStream input, ObjectOutputStream out)
    {
        Thread readThread = new Thread()
        {
            public void run()
            {
                try
                {
                    //System.out.println("oi 2");//----------------------------------------------------
                    String hash = (String) input.readObject();
                    //System.out.println("oi 5");//----------------------------------------------------
                    int intervaloA = (int) input.readObject();

                    System.out.println("Intervalo recebido do servidor de "
                    + intervaloA + " ate " + (intervaloA + 199999) + ", hash " + hash);

                    lock.lock();
                    try{
                        prosseguir.signal();
                    } finally {
                        lock.unlock();
                    }


                    String numero = codigo(intervaloA, hash);

                    out.writeObject(numero);
                    out.flush();

                    System.out.println("lock 2");//----------------------------------------------------
                    lock.lock();
                    prosseguir.await();
                    lock.unlock();
                    System.out.println("lock 3");//----------------------------------------------------
                    run();//aqui---------------------------------------------------------------------

                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };

        readThread.start();
        return readThread;
    }

    public static String codigo(int intervaloA, String hash) throws NoSuchAlgorithmException
    {
        //System.out.println("codigo");--------------------------------------------------------------------
        long tempo = System.currentTimeMillis();

        for (int i = 0; i <= 1999; i++)
		{
			for (int u = 0; u <= 99; u++)
			{
				String numero = String.format("%07d", intervaloA);

				//System.out.println(numero);// -----------------------------------------------------------------

				String md5 = md5(numero);

				if (md5.equals(hash))
				{
					System.out.println("O codigo " + hash + " e produzido pelo numero " + numero);

					tempo = System.currentTimeMillis() - tempo;

					System.out.println("O programa levou " + tempo + "ms para encontrar esse numero.");

					return numero;
				}
				intervaloA++;
			}
			if (parar)
            {
				System.out.println("Signal");// -------------------------------------------------------------
				lock.lock();
                try
				{
					prosseguir.signal();
				} finally
				{
					lock.unlock();
				}
				return "-2";
			}
		}
        return "-1";
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
