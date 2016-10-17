package Aula6.idade;

import javax.swing.JOptionPane;

public class idade 
{
	public static void main(String[] args)
	{
		int contador = 0, numeroPessoas, idade;
		
		String texto = JOptionPane.showInputDialog("Informe o n�mero de Pessoas: ");
		numeroPessoas = Integer.parseInt(texto);
		
		while (contador < numeroPessoas)
		{	
			String texto1 = JOptionPane.showInputDialog("Informe a idade: ");
			idade = Integer.parseInt(texto1);
			
			if (idade <= 12){
				System.out.println("Crian�a.");
			}
				else
				if (idade < 18){
					System.out.println("Adolescente.");
				}
					else
					System.out.println("Adulto");
			contador = contador + 1;
		}
	}
}
