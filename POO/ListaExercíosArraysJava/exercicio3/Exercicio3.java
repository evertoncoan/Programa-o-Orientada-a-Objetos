package ListaExercíosArraysJava.exercicio3;

import java.util.Scanner;

public class Exercicio3
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int elemento, aux;
		int[] vetorElementos = new int[16];
		
		for (int i = 0; i < 16; i++)
		{
			System.out.println("Insira um número inteiro: ");
			elemento = entrada.nextInt();
			vetorElementos[i] = elemento;
		}
		
		for (int i = 0; i < 8; i ++)
		{
			aux = vetorElementos[i+8];
			vetorElementos[i+8] = vetorElementos[i];
			vetorElementos[i] = aux;
		}
		for (int i = 0; i < 16; i ++)
		{
			System.out.println("O vetor obtido é: " + vetorElementos[i]);
		}
		entrada.close();
	}
}
