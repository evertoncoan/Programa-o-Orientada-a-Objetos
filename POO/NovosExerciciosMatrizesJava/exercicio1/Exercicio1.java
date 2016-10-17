package NovosExerciciosMatrizesJava.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int n = 0, m = 0;
		int linha = 0, coluna = 0;
		double maiorValor = 0;
		
		System.out.println("Insira o n�mero de linhas da matriz: ");
		n = entrada.nextInt();
		
		System.out.println("Insira o n�mero de colunas da matriz: ");
		m = entrada.nextInt();
		
		double[][] matrizElementos = new double[n][m];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.println("Insira um n�mero: ");
				matrizElementos[i][j] = entrada.nextDouble();
			}
		}
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				if (matrizElementos[i][j] > maiorValor){
					maiorValor = matrizElementos[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("O maior valor �: " + maiorValor);
		System.out.println("Ele est� na linha n�mero: " + linha);
		System.out.println("E na coluna n�mero: " + coluna);
		
		entrada.close();
	}
}
