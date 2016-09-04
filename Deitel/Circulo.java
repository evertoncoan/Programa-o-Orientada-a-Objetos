package Deitel;

import java.util.Scanner;

public class Circulo 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		float raio;
		
		System.out.print("Insira o raio: ");
		raio = entrada.nextFloat();
		
		System.out.println("O diametro é: " + 2 * raio);
		
		System.out.println("A circunferência é: " + 2 * Math.PI * raio);
		
		System.out.println("A área é: " + Math.PI * raio * raio);
	}

}
