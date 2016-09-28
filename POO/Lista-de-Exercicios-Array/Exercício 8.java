Lista de Exercícios Vetores.
Exercício 8.

Inicio
	real elemento, arrayElementos[40];
	
	leia elemento;
	arrayElementos[0] = elemento;
	
	para (inteiro i = 1, i < 40, i++){
		leia elemento;
		arrayElementos[i] = elemento + arrayElementos[i-1];
	}
	
	para (inteiro i = 0, i < 40, i++){
		escreva arrayElementos[i];
	}
Fim