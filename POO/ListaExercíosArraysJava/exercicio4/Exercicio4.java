package exercicio4;

import java.util.Scanner;

public class Exercicio4
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		double elemento, x = 0;
		double[] arrayElementos = new double[20];
		boolean bool = false;
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println("Informe um número: ");
			elemento = entrada.nextDouble();
			arrayElementos[i] = elemento;
		}
		
		System.out.println("Insira x: ");
		x = entrada.nextDouble();
		
		for (int i = 0; i < 20; i++)
		{
			if (arrayElementos[i] == x)
			{
				System.out.println(i);
				bool = true;
			}
		}
		
		if (bool == false)
			System.out.println("Valor não encontrado.");
		
		entrada.close();
	}
}
