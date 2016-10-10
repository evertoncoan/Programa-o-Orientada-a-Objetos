Lista de Exercícios Matrizes.
Exercício 2.

Inicio
	inteiro n = 0, m = 0;
	boolean bool = true;
	
	leia n;
	leia m;
	
	real matrizElementos[n][m];
	
	para (inteiro i = 0; i < n; i++){
		para (inteiro j = 0; j < m; j++){
			leia matrizElementos[i][j];
		}
	}
	
	para (inteiro i = 0; i < n; i++){
		para (inteiro j = 0; j < m; j++){
			inteiro k = 0;
			se (matrizElementos[i][j] == 0)
				k = k + 1;
		}
		se (k != n - 1)
			bool = false;
	}
	
	para (inteiro i = 0; i < m; i++){
		para (inteiro j = 0; j < n; j++){
			inteiro k = 0;
			se (matrizElementos[i][j] == 0)
				k = k + 1;
		}
		se (k != m - 1)
			bool = false;
	}
	
	se (bool = true)
		escreva "A matriz é uma permutação."
	senão
		escreva "A matriz não é uma permutação."
Fim