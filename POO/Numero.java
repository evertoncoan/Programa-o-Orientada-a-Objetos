package numero;

import javax.swing.JOptionPane;

public class Numero 
{
	public static void main(String[] args)
	{
		int numero, x = 0;
		
		do {
			String texto = JOptionPane.showInputDialog("Informe um n�mero: ");
			numero = Integer.parseInt(texto);
			
			if ( numero < 0 || numero > 10)
				System.out.println("N�mero incorreto. Tente novamente.");
			else 
			{
				x = 1;
				System.out.println("N�mero correto");
			}
		} while (x  0);
	}
}
