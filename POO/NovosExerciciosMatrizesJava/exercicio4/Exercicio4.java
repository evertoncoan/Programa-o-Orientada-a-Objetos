package NovosExerciciosMatrizesJava.exercicio4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int n = 0, m = 0;
		double x = 0;
		boolean bool = false;
		
		System.out.println("Insira o número de linhas da matriz: ");
		n = entrada.nextInt();
		
		System.out.println("Insira o número de colunas da matriz: ");
		m = entrada.nextInt();
		
		System.out.println("Insira valor de x: ");
		x = entrada.nextInt();
		
		double[][] matrizElementos = new double[n][m];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.println("Insira um número: ");
				matrizElementos[i][j] = entrada.nextDouble();
			}
		}
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				if (matrizElementos[i][j] == x){
				System.out.println("Encontrado na linha " + i + " e na coluna " + j);
				bool = true;
				}
			}
		}
		if (bool = false){
			System.out.println("Valor não encontrado.");
		}
		
		entrada.close();
	}
}
