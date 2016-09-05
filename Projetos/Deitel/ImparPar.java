package Deitel;

import java.util.Scanner;

public class ImparPar 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Insira um inteiro: ");
		numero = entrada.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("Esse número é par.");
		
		if (numero % 2 != 0)
			System.out.println("Esse número é impar.");
	}
}
