package Aula3;

import javax.swing.JOptionPane;

public class Sinal 
{
	public static void main(String[] args)
	{
		String xTexto = JOptionPane.showInputDialog("Informe um n�mero: ");
		double x = Double.parseDouble(xTexto);
		
		if (x > 0)
			System.out.println("Positivo.");
		
		if (x <0)
			System.out.println("Negativo.");
		
		if (x == 0)
			System.out.println("Zero.");
	}
}
