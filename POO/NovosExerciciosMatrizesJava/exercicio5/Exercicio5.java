package NovosExerciciosMatrizesJava.exercicio5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int linha = 0, coluna = 0;
		
		System.out.println("Insira o número de linhas da matriz: ");
		linha = entrada.nextInt();
		
		System.out.println("Insira o número de colunas da matriz: ");
		coluna = entrada.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		for (int i = 0; i < linha; i++){
			for (int j = 0; j < coluna; j++){
				System.out.println("Insira um número: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("\nMatriz original:");
		
		for (int i = 0; i < linha; i++){
			for (int j = 0; j < coluna; j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz em que a primeira coluna foi trocada "
				+ "pela ultima culuna:");
		
		int[] primeiraLinha = new int[coluna];
		
		for (int i = 0; i < coluna; i++){
			primeiraLinha[i] = matriz[0][coluna - 1 - i];
		}
		
		for (int i = 0; i < coluna; i++){
			matriz[0][i] = matriz[linha - 1 - i][coluna - 1];
		}
		
		for (int i = 0; i < coluna; i++){
			matriz[i][coluna - 1] = primeiraLinha[i];
		}
		
		for (int i = 0; i < linha; i++){
			for (int j = 0; j < coluna; j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		entrada.close();
	}
}
