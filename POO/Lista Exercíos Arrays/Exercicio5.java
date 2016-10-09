package exercicio5;

import java.util.Scanner;

public class Exercicio5
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		double elemento;
		int pares = 0;
		double[] arrayElementos = new double[40];
		
		for (int i = 0; i < 40; i++)
		{
			System.out.println("Insira um número: ");
			elemento = entrada.nextDouble();
			arrayElementos[i] = elemento;
		}
		
		for (int i = 0; i < 40; i++)
		{
			if (arrayElementos[i] % 2 == 0)
			{
				System.out.println(arrayElementos[i]);
				pares += 1;
			}
		}
		
		System.out.println(pares);
		
		entrada.close();
	}
}
