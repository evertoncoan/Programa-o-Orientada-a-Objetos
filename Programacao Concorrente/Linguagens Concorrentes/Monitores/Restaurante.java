
public class Restaurante extends Thread
{
    public static void main(String[] args)
    {
        Restaurante thread = new Restaurante();
        thread.start();
    }
    
    public void run()
    {
        System.out.println("Frango Frito.\nBatata Frita.\nArroz Frito.");
    }
}





// javac Restaurante.java;java Restaurante


// GitHub
// git add Restaurante.java
// git commit -m "mensagem"
// git push origin master
// git add Restaurante.java;git commit -m "mensagem";git push origin master

// git pull -r


// Java
// sudo add-apt-repository ppa:webupd8team/java
// sudo apt-get update
// sudo apt-get install oracle-java8-installer