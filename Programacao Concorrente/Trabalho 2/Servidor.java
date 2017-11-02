

public class Servidor
{
    public static void main(String[] args)
    {
        ServerSocket server = new ServerSocket(5000, 10);
        while (true)
        {
            Socket s = server.accept();
            System.out.println("Nova conexão realizada");
            
            serveClient(s);
        }
    }
    
    private void serveClient(Socket socket) throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
        
        Thread socketThread = new Thread()
        {
            public void run()
            {
                
            }
        }
    }
}

// git add .;git commit -m "menssagem";git push origin master