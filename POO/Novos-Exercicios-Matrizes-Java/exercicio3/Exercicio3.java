package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int n = 0, m = 0, maiores = 0;
		
		System.out.println("Insira o número de linhas da matriz: ");
		n = entrada.nextInt();
		
		System.out.println("Insira o número de colunas da matriz: ");
		m = entrada.nextInt();
		
		double[][] matrizElementos = new double[n][m];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.println("Insira um número: ");
				matrizElementos[i][j] = entrada.nextDouble();
			}
		}
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				if (matrizElementos[i][j] > 10)
					maiores = maiores + 1;
			}
		}
		
		System.out.println("Existem " + maiores + " valores maiores que 10.");
		
		entrada.close();
	}
}