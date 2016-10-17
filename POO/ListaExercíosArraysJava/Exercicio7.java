package ListaExercíosArraysJava;

import java.util.Scanner;

public class Exercicio7
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		double elemento1, elemento2;
		double[] array1 = new double[20];
		double[] array2 = new double[20];
		double[] array3 = new double[40];
		int k = 0, n = 1;
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println("Insira um n�mero "
					+ "para o primeiro vetor: ");
			elemento1 = entrada.nextDouble();
			array1[i] = elemento1;
			array3[k] = elemento1;
			k = k + 2;
		}
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println("Insira um n�mero "
					+ "para o segundo vetor: ");
			elemento2 = entrada.nextDouble();
			array2[i] = elemento2;
			array3[n] = elemento2;
			n = n + 2;
		}
		
		for (int i = 0; i < 40; i++)
		{
			System.out.println(array3[i]);
		}
		entrada.close();
	}
}
