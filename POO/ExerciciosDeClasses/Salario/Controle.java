package ExerciciosDeClasses.Salario;

import java.util.Scanner;

public class Controle {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		Modelo s1 = new Modelo();
		
		System.out.println("Insira o número de horas trabalhadas: ");
		s1.setHoras(entrada.nextDouble());
		
		System.out.println("O salário do funcionário é de R$ " + s1.calculaSalario());
		
		entrada.close();
	}

}
