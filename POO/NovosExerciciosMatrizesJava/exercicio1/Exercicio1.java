package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int n = 0, m = 0;
		int linha = 0, coluna = 0;
		double maiorValor = 0;
		
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
				if (matrizElementos[i][j] > maiorValor){
					maiorValor = matrizElementos[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("O maior valor é: " + maiorValor);
		System.out.println("Ele está na linha número: " + linha);
		System.out.println("E na coluna número: " + coluna);
		
		entrada.close();
	}
}
