package AritmeticaMaiorMenor;

import java.util.Scanner;

public class AritmeticaMaiorMenor
{
	public static void main( String[] args )
	{
		Scanner entrada = new Scanner( System.in );
		
		int x, // Primeiro inteiro
		    y, // Segundo inteiro
		    z, // Terceiro inteiro
		    soma,
		    media,
		    produto,
		    menor = 0,
		    maior = 0;
		
		System.out.print("Insira o primeiro inteiro: ");
		x = entrada.nextInt();
		
		System.out.print("Insira o segundo inteiro: ");
		y = entrada.nextInt();
		
		System.out.print("Insira o terceiro inteiro: ");
		z = entrada.nextInt();
		
		soma =    x + y + z;
		media =   (x + y + z) / 3;
		produto = x * y *z;
		
		if (x >= y && x >= z) // maior
			maior = x;
		
		if (y >= x && y >= z)
			maior = y;
		
		if (z >= x && z >= y)
			maior = z;
		
		if (x <= y && x <= z) // menor
			menor = x;
		
		if (y <= x && y <= z)
			menor = y;
		
		if (z <= x && z <= y)
			menor = z;
		
		System.out.printf( "A soma é: %d\nA média é: %d\nO produto é: %d\nO menor é: %d\nO maior é: %d\n", soma, media, produto, menor, maior );
	}
}