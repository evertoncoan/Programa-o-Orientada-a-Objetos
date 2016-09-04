package Deitel;

import java.util.Scanner;

public class Comparando 
{
	public static void main(String[] args)
	{
	
	Scanner entrada = new Scanner(System.in );
	
	int x;
	int y;
	
	System.out.print("Insira o primeiro inteiro: ");
	x = entrada.nextInt();
	
	System.out.print("Insira o segundo inteiro: ");
	y = entrada.nextInt();
	
	if (x > y)
		System.out.printf("%d is larger.\n", x);
	
	if (x < y)
		System.out.printf("%d is larger.\n", y);
	
	if (x == y)
		System.out.println("These number are equal.");
	}
}
