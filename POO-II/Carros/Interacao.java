package Carros;

import java.util.Scanner;

class Interacao
{
	Scanner sc = new Scanner(System.in);
	
	String SolicitaString(String c)
	{
		System.out.println(c);
		String atributo = sc.next();
		
		return atributo;
	}
	
	int SolicitaInteiro(String c)
	{
		System.out.println(c);
		int atributo = sc.nextInt();
		
		return atributo;
	}
}
