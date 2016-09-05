package Deitel;

import java.util.Scanner;

public class MaiorMenorInteiros 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int n1,
		    n2,
		    n3,
		    n4,
		    n5,
		    maior = 0,
		    menor = 0;
		
		System.out.print("Insira o primeiro inteiro: ");
		n1 = entrada.nextInt();
		
		System.out.print("Insira o segundo inteiro: ");
		n2 = entrada.nextInt();
		
		System.out.print("Insira o terceiro inteiro: ");
		n3 = entrada.nextInt();
		
		System.out.print("Insira o quarto inteiro: ");
		n4 = entrada.nextInt();
		
		System.out.print("Insira o quinto inteiro: ");
		n5 = entrada.nextInt();
		
		if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5) // maior
			maior = n1;
		
		if (n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 >= n5)
			maior = n2;
		
		if (n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 >= n5)
			maior = n3;
		
		if (n4 >= n1 && n4 >= n2 && n4 >= n3 && n4 >= n5)
			maior = n4;
		
		if (n5 >= n1 && n5 >= n2 && n5 >= n3 && n5 >= n4)
			maior = n5;
		
		if (n1 <= n2 && n1 <= n3 && n1 <= n4 && n1 <= n5) // menor
			menor = n1;
		
		if (n2 <= n1 && n2 <= n3 && n2 <= n4 && n2 <= n5)
			menor = n2;
		
		if (n3 <= n1 && n3 <= n2 && n3 <= n4 && n3 <= n5)
			menor = n3;
		
		if (n4 <= n1 && n4 <= n2 && n4 <= n3 && n4 <= n5)
			menor = n4;
		
		if (n5 <= n1 && n5 <= n2 && n5 <= n3 && n5 <= n4)
			menor = n5;
		
		System.out.printf("O maior é: %d\nO menor é: %d\n", maior, menor);
	}
}
