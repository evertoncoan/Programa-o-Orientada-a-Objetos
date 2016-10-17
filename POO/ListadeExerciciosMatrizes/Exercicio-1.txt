Lista de Exercícios Matrizes.
Exercício 1.

Inicio
	inteiro m = 0, n = 0;
	boolean bool = false;
	
	leia m;
	leia n;
	
	real matrizElementos[m][n];
	
	para (inteiro i = 0; i < m; i++){
		para ( inteiro j = 0; j < n; j++){
			leia matrizElementos[i][j];
		}
	}
	
	para (inteiro i = 0; i < m; i++){
		para ( inteiro j = 0; j < n; j++){
			para (inteiro k = j + 1; k < n; k++){
				se (matrizElementos[i][j] == matrizElementos[i][k])
					bool = true;
			}
		}
	}

	se (bool = true)
		escreva "Existem elementos repetidos.";
	senão
		escreva "Não existem elementos repetidos."
Fim
