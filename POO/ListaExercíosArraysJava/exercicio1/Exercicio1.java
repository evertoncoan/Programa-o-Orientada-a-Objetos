package ListaExercíosArraysJava.exercicio1;

import java.util.Scanner;

public class Exercicio1
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int elemento, x, y, soma;
		int[] arrayElementos = new int[12];
		
		for (int i = 0; i < 12; i++)
		{
			System.out.println("Informe o " + (i+1) + "º número: ");
			elemento = entrada.nextInt();
			arrayElementos[i] = elemento;
		}
		
		System.out.println("Informe o valor de x: ");
		x = entrada.nextInt();
		System.out.println("Informe o valor de y: ");
		y = entrada.nextInt();
		
		if (x >= 0 && x < 12 && y >= 0 && y < 12)
		{
			soma = arrayElementos[x] + arrayElementos[y];
			System.out.println("A soma é: " + soma);
		}
			else
				System.out.println("Os valores inseridos não "
						+ "correspondem a nenhuma posição do array.");
	entrada.close();
	}
}