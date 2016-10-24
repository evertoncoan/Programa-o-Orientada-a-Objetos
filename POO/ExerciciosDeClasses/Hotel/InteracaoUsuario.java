package ExerciciosDeClasses.Hotel;

import java.util.Scanner;

public class InteracaoUsuario {
	Scanner entrada = new Scanner(System.in);
	
	Hotel h1 = new Hotel();
	
	public void informaH1(){
		System.out.println(h1.reservaQuarto());
		System.out.println("O valor das diárias é: R$ " + h1.calculaDiarias(7));
		System.out.println("O valor do IPTU é: R$ " + h1.calculaIptu() + "\n");
	}
	
	Hotel h2 = new Hotel(0, 220, 10);
	
	public void informaH2(){
		System.out.println("Quantos dias deseja ficar?");
		int dias = entrada.nextInt();
		System.out.println(h2.reservaQuarto());
		System.out.println("O valor das diárias é: R$ " + h2.calculaDiarias(dias));
		System.out.println("O valor do IPTU é: R$ " + h2.calculaIptu());
	}
}
