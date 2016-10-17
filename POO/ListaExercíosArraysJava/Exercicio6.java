package ListaExercíosArraysJava;

import java.util.Scanner;

public class Exercicio6
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		double elemento;
		double[] arrayElementos = new double[40];
		
		for (int i = 0; i < 40; i++)
		{
			System.out.println("Insira um número: ");
			elemento = entrada.nextDouble();
			if ( elemento < 0)
				elemento = 0;
			arrayElementos[i] = elemento;
		}
		
		for (int i = 0; i < 40; i++)
		{
			System.out.println(arrayElementos[i]);
		}
		entrada.close();
	}
}