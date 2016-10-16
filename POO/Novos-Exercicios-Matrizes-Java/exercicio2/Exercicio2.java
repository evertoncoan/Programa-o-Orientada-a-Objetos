package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int n = 0, m = 0;
		
		System.out.println("Insira o número de linhas da matriz: ");
		n = entrada.nextInt();
		
		System.out.println("Insira o número de colunas da matriz: ");
		m = entrada.nextInt();
		
		int[][] matrizElementos = new int[n][m];
				
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				if (i == j)
					matrizElementos[i][j] = 1;
				else
					matrizElementos[i][j] = 0;
			}
		}
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.print(matrizElementos[i][j]);
			}
			System.out.print("\n");
		}
		entrada.close();
	}
}