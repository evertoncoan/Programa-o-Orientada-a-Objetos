package Aula3;

import javax.swing.JOptionPane;

public class ParImpar
{
	public static void main(String[] args)
	{
		String inteiroTexto = JOptionPane.showInputDialog("Informe um inteiro: ");
		int inteiro = Integer.parseInt(inteiroTexto);
		
		if (inteiro % 2 == 0)
			System.out.println("� par.");
		else
			System.out.println("� impar.");
	}	
}
