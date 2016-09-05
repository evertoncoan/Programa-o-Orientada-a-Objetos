package Deitel;

import java.util.Scanner;

public class Multiplo 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int n1,
		    n2;
		
		System.out.print("Insira o primeiro inteiro: ");
		n1 = entrada.nextInt();
		
		System.out.print("Insira o segundo inteiro: ");
		n2 = entrada.nextInt();
		
		if (n1 % n2 == 0)
			System.out.printf("%d é multiplo de %d", n1, n2);
		
		if (n1 % n2 != 0)
			System.out.printf("%d não é multiplo de %d", n1, n2);
	}

}
