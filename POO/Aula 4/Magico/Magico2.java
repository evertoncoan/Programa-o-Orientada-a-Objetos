package Magico;

import javax.swing.JOptionPane;

public class Magico2 {

	public static void main(String[] args) 
	{
		int x = 35, y = 0;
		String y_texto = null;
		
		y_texto = JOptionPane.showInputDialog("Informe um número de 0 até 100: ");
				y = Integer.parseInt(y_texto);
				
		if (x == y)
			System.out.println("Você acertou.");
		else
			if (y < x)
				System.out.println("Seu número é menor.");
			else
				System.out.println("Seu número é maior.");
	}

}
