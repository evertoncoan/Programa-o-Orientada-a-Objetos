Lista de Exercícios Vetores.
Exercício 5.

Inicio
	real elemento, arrayElementos[40];
	inteiro pares;
	
	para (inteiro i = 0, i < 40, i++0){
		leia elemeto;
		arrayElementos[i] = elemento;
	}
	
	para (inteiro i = 0, i < 40, i++){
		se (arrayElementos[i] mod 2 == 0){
			escreva arrayElementos[i];
			pares += 1;
		}
	}
	
	escreva pares;
Fim
