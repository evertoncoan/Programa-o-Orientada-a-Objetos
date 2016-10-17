package Aula6.radioativo;

import javax.swing.JOptionPane;

public class radioativo 
{
	public static void main(String[] args)
	{
		double massa = 0, tempo = 0;
		
		String texto = JOptionPane.showInputDialog("Informe a massa inicial: ");
		massa = Double.parseDouble(texto);
		
		while (massa >= 0.05)
		{
			massa = massa / 2;
			tempo = tempo + 50;
		}
		
		if (tempo >= 60)
		{
			tempo = tempo / 60;
			System.out.println("O tempo necess�rio �: " + tempo + " minutos.");
		}
			else
				System.out.println("O tempo necess�rio �: " + tempo + " segundos");
	}
}
