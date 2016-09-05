package Deitel;

import java.util.Scanner;

public class Produto 
{
	private static Scanner entrada;

	public static void main(String[] args) 
	{
		entrada = new Scanner( System.in );
		
		int x;
		int y;
		int z;
		int resultado;
		
		System.out.print("Insira o primeiro número: ");
		x = entrada.nextInt();
		
		System.out.print("Insira o segundo número: ");
		y = entrada.nextInt();
		
		System.out.print("Insira o terceiro número: ");
		z = entrada.nextInt();
		
		resultado = x * y * z;
		
		System.out.printf("O produto é: %d\n", resultado );
	}

}
