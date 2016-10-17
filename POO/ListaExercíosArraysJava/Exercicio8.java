package exercicio8;

import java.util.Scanner;

public class Exercicio8
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		double elemento;
		double[] arrayElementos = new double[40];
		
		System.out.println("Insira um número: ");
		elemento = entrada.nextDouble();
		arrayElementos[0] = elemento;
		
		for (int i = 1; i < 40; i ++)
		{
			System.out.println("Insira um número: ");
			elemento = entrada.nextDouble();
			arrayElementos[i] = elemento + arrayElementos[i-1];
		}
		
		for (int i = 0; i < 40; i++)
		{
			System.out.println(arrayElementos[i]);
		}
		entrada.close();
	}
}
