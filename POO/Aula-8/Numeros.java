package numeros;

import javax.swing.JOptionPane;

public class Numeros 
{	
	public static void main(String[] args)
	{
		int maior = 0, media = 0, quantidade, numero, soma= 0;
		
		String texto = JOptionPane.showInputDialog("Informe a quantidade de números: ");
		quantidade = Integer.parseInt(texto);
		
		for (int k = 0; k < quantidade; k = k + 1)
		{
			String texto1 = JOptionPane.showInputDialog("Informe um número: ");
			numero = Integer.parseInt(texto1);
			
			if (numero > maior)
			{
				maior = numero;
			}
			
			soma = soma + numero;
		}
			
			media = soma / quantidade;
			
			System.out.println("O maior numero é: " + maior);
			System.out.println("A soma é: " + soma);
			System.out.println("A média é: " + media);
	}
}
