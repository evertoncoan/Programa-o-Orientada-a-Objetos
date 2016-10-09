Lista de Exercícios Vetores.
Exercício 11.

Inicio
	real elemento, arrayElementos[50], array0[50];
	
	para (inteiro i = 0, i < 50, i++){
		leia elemento;
		se (elemento == 0){
			array0[i] = elemento;
			senão
				arrayElementos[i] = elemento;
		}
	}
	
	para (inteiro i = 0, i < 50, i++){
		se (array0[i] == 0)
			arrayElementos[49-i] = 0;
	}
	
	para (inteiro i = 0, i < 50, i++){
		escreva arrayElementos[i];
	}
Fim