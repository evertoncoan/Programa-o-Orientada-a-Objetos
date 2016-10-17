package Aula3;

import javax.swing.JOptionPane;

public class Vendas 
{
	public static void main(String[] args)
	{
		double valorFinal = 0;
		
		String valorTexto = JOptionPane.showInputDialog("Informe o valor da compra: ");
		double valor = Double.parseDouble(valorTexto);
		
		if (valor >= 5000)
		{
			valorFinal = valor * 0.80;
			System.out.println("Desconto de 20%.");
		}
		
		if (valor < 5000)
		{
			valorFinal = valor * 0.85;
			System.out.println("Desconto de 15%.");
		}
		
		System.out.println("O valor final da compra � de: " + valorFinal);
	}
}
