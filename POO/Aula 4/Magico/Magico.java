package Magico;

import javax.swing.JOptionPane;

public class Magico {

	public static void main(String[] args) 
	{
		int x = 35, y = 0;
		String y_texto = null;
		
		y_texto = JOptionPane.showInputDialog("Informe um número de 0 até 100: ");
				y = Integer.parseInt(y_texto);
				
		if (x == y)
			System.out.println("Você acertou.");
		else
			System.out.println("Você errou.");
	}

}
