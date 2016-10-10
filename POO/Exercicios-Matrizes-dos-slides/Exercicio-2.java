Exercícios Matrizes dos slides.
Exercício 2.

Inicio
	inteiro n = 0, m = 0;
	
	leia n;
	leia m;

	real arrayElementos1[n][m];
	real arrayElementos2[n][m];
	real arraySoma[n][m];
	
	para (inteiro i = 0; i < n; i++){
		para (inteiro j = 0; j < m; j++){
			leia arrayElementos1[i][j];
		}
	}
	
	para (inteiro i = 0; i < n; i++){
		para (inteiro j = 0; j < m; j++){
			leia arrayElementos2[i][j];
		}
	}
	
	para (inteiro i = 0; i < n; i++){
		para (inteiro j = 0; j < m; j++){
			arraySoma[i][j] = arrayElementos1[i][j] + arrayElementos2[i][j];
			escreva arraySoma[i][j];
		}
	}
Fim