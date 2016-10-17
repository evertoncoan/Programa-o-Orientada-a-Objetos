package Aula3;

import javax.swing.JOptionPane;

public class Idade 
{
	public static void main(String[] args)
	{
		String idadeTexto = JOptionPane.showInputDialog("Informe a idade: ");
		int idade = Integer.parseInt(idadeTexto);
		
		if (idade <= 12)
			System.out.println("Crian�a");
		
		else 
			if (idade < 18)
				System.out.println("Adolescente");
			
			else
				System.out.println("Adulto");
	}
}
