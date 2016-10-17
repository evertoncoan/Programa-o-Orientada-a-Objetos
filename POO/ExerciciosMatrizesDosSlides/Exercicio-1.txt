Exercícios Matrizes dos slides.
Exercício 1.

Inicio
	real elemento, arrayElemetos[20][10];
	real maiorSoma = 0;
	inteiro linha = 0;
	
	para (inteiro i = 0, i < 20, i++){
		para ( inteiro j = 0 j < 10, j++){
			leia elemento;
			arrayElementos[i][j] = elemento;
		}
	}
	
	para (inteiro i = 0, i < 20, i++){
		real soma = 0;
		para ( inteiro j = 0, j < 10, j++){
			soma = arrayElementos[i][j] + soma;	
		}
		escreva soma;
		if (soma > maiorSoma){
			maiorSoma = soma;
			linha = i;
		}
	}
	
	escreva linha;
Fim