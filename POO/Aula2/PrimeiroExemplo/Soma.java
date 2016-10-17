package Aula2.PrimeiroExemplo;

import javax.swing.JOptionPane;

public class Soma 
{

	public static void main(String[] args) 
	{
		int valorA, valorB, soma;
		String texto;
		
		/*valorA = 10;
		valorB = 15;*/
		
		texto = JOptionPane.showInputDialog("Informe um valor inteiro: ");
		valorA = Integer.parseInt(texto);
		
		texto = JOptionPane.showInputDialog("Informe um valor inteiro: ");
		valorB = Integer.parseInt(texto);
		
		soma = valorA + valorB;
		
		System.out.println(valorA);
		System.out.println(valorB);
		System.out.println(soma);
	}

}
