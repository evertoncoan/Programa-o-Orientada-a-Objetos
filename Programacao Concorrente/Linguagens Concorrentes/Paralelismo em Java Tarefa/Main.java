import java.util.Scanner;

public class Main extends Thread
{
	public static String filtro;
	
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o diretório a ser pesquisado.");
		String diretorio = entrada.nextLine();
		
		System.out.println("Insira o filtro de pesquisa.");
		filtro = entrada.nextLine();
		
		MyThread thread = new MyThread(diretorio);
		
		thread.start();
	}
	
	public void createThreads(String pasta)
	{
		MyThread thread = new MyThread(pasta);
		
		//System.out.println("\nThread criada.\n");
		
		thread.start();
	}
}
