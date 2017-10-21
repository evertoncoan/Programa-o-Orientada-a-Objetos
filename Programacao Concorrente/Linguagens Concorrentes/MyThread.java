import java.io.File;

public class MyThread extends Thread
{
	private Main main;
	private String diretorio;
	
	public MyThread(String diretorio) {
		this.diretorio = diretorio + "\\";
		main = new Main();
	}
	
	public void run()
	{
		File arquivo = new File(diretorio);
		
		if (!arquivo.isDirectory())
		{
			System.out.println("Diretório inválido");
			return;
		}
		
		String[] arquivos = arquivo.list();
		
		for( String file : arquivos)
		{
			if (file.contains(Main.filtro))
				System.out.println( diretorio + file );
			
			File i = new File(diretorio + file);
			
			if (i.isDirectory())
			{
				//System.out.println("\nDiretório\n");
				main.createThreads(diretorio + file);
			}
		}
	}
}
