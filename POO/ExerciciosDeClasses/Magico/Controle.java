package ExerciciosDeClasses.Magico;

import java.util.Scanner;

public class Controle {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		Magico m1 = new Magico();
		
		m1.setNumMag(56);
		
		System.out.println("Insira um número: ");
		m1.setNumero(entrada.nextDouble());
		
		if (m1.advinha() == true)
			System.out.println("Parabéns!!! Você acertou.");
		else
			System.out.println("Você errou. Tente novamente.");
		
		entrada.close();
	}
}
