package idade;

import javax.swing.JOptionPane;

public class Idade 
{
	public static void main (String[] args)
	{
	
	int ano;
	int nascimento;
	int idade;
	String texto;
	
	texto = JOptionPane.showInputDialog("Informe o ano atual: ");
	ano = Integer.parseInt(texto);
	
	texto = JOptionPane.showInputDialog("Informe o ano de nascimento: ");
	nascimento = Integer.parseInt(texto);
	
	idade = ano - nascimento;
	
	System.out.println("A idade é: " + idade + " anos." );
	}
}
