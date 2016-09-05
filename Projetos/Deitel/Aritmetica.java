package Deitel;

import java.util.Scanner;

public class Aritmetica 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in );
		
		int x;
		int y;
		int soma;
		int produto;
		int diferença = 0;
		int quociente;
		
		System.out.print("Insira o primeiro inteiro: ");
		x = entrada.nextInt();
		
		System.out.print("Insira o segundo inteiro: ");
		y = entrada.nextInt();
		
		soma      = x + y;
		produto   = x * y;
		quociente = x / y;
		
		if (x >= y)
		{
			diferença = x - y;
		}
		
		if (x < y)
		{
			diferença = y - x;
		}
		
		System.out.printf("A soma é: %d\n", soma);
		System.out.printf("O produto é: %d\n", produto);
		System.out.printf("A diferença é: %d\n", diferença);
		System.out.printf("O quociente é: %d\n", quociente);
	
	}
}
