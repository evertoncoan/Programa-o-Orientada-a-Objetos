Lista de Exercícios Vetores.
Exercício 6.

Inicio
	real elemento, arrayElementos[40];
	
	para (int i = 0, i < 40, i++){
		leia elemento;
		se (elemento < 0)
			elemento = 0;
		arrayElementos[i] = elemento;
	}
	
	para (int i = 0, i < 40, i++){
		escreva arrayElementos[i];
	}
Fim