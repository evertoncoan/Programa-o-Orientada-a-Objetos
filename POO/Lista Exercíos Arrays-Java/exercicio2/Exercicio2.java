package exercicio2;

import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int elemento, quantNumImpar = 0;
		int[] arrayElementos = new int[10];
		
		while (quantNumImpar < 10)
		{
			System.out.println("Informe o número: ");
			elemento = entrada.nextInt();
			
			if (elemento % 2 != 0)
			{
				arrayElementos[quantNumImpar] = elemento;
				quantNumImpar++;
			}
		}
		
		System.out.println("Os numeros impares são: ");
		
		for (int i = 0; i< 10; i++)
		{
			System.out.println(arrayElementos[i]);
		}
		entrada.close();
	}
}
