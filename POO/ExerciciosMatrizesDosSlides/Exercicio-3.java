Exercícios Matrizes dos slides.
Exercício 3.

Inicio
	inteiro n = 0;
	
	leia n;
	
	real arrayElementos1[n][n];
	real soma = 0;
	real produto = 1;
	
	inteiro secundario = n - 1;
	
	para (inteiro i = 0; i < n; i++){
		para (inteiro j = 0; j < n; j++){
			leia arrayElementos1[i][j];
		}
	}
	
	para (inteiro i = 0; i < n; i++){
		soma = arrayElementos1[i][i] + soma;
	}
	
	para (inteiro i = 0; i < n; i++){
		produto = arrayElementos1[i][secundario] * produto;
		secundario = secundario - 1;
	}
	
	escreva soma;
	escreva produto;
Fim