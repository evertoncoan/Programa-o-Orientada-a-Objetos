package Aula3;

import javax.swing.JOptionPane;

public class Salario 
{
	public static void main(String[] args)
	{
		double valorGanho = 0;
		
		String vendasTexto = JOptionPane.showInputDialog("Informe o valor total de vendas: ");
		double vendas = Double.parseDouble(vendasTexto);
		
		if (vendas >= 20000)
			valorGanho = vendas * 0.10;
		
		if (vendas < 20000)
			valorGanho = vendas * 0.075;
		
		System.out.println("O valor Ganho � de: " + valorGanho);
	}
}
