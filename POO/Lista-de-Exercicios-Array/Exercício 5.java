Lista de Exerc�cios Vetores.
Exerc�cio 5.

Inicio
	real elemento, arrayElementos[40];
	inteiro pares;
	
	para (i = 0, i < 40, i++0){
		leia elemeto;
		arrayElementos[i] = elemento;
	}
	
	para (i = 0, i < 40, i++){
		se (arrayElementos[i] mod 2 == 0){
			escreva arrayElementos[i];
			pares += 1;
		}
	}
	
	escreva pares;
Fim