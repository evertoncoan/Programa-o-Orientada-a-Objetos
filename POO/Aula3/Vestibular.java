package Aula3;

import javax.swing.JOptionPane;

public class Vestibular 
{
	public static void main(String[] args)
	{
		double media;
		
		String nome = JOptionPane.showInputDialog("Insira o nome do Candidato: ");
		
		String portTexto = JOptionPane.showInputDialog("Informe o a nota na prova de Portugu�s: ");
		double port = Double.parseDouble(portTexto);
		
		String matTexto = JOptionPane.showInputDialog("Informe o a nota na prova de Matem�tica: ");
		double mat = Double.parseDouble(matTexto);
		
		String geraisTexto = JOptionPane.showInputDialog("Informe o a nota na prova de Conhecimentos Gerais: ");
		double gerais = Double.parseDouble(geraisTexto);
		
		media = (port + mat + gerais) / 3;
		
		System.out.printf(nome + ", " + port + " em Portugu�s" + ", " + mat +" em Matem�tica" + " e " + gerais
				+ " em Conhecimentos Gerais" + "\nM�dia " + media);
		
		if ((media >= 5) && (port >= 4 ) && (mat >= 4) && (gerais >= 4))
			System.out.printf("\nAprovado.");
		
		else
			System.out.printf("\nReprovado");
			
	}
}
