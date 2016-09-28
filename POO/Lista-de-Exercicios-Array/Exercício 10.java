Lista de Exercícios Vetores.
Exercício 10.

Inicio
	real elemento1, arrayElementos1[9];
	real elemento2, arrayElementos2[9];
	real elemento3, arrayElementos3[9];
	real arrayFinal[9];
	
	para (inteiro i = 0, i < 9, i++){
		leia elemento1;
		arrayElementos1[i] = elemento1;
		leia elemento2;
		arrayElementos2[i] = elemento2;
		leia elemento3;
		arrayElementos3[i] = elemento3;
		se (i < 3){
			arrayFinal[i] = elemento1;
			senão
				se (i < 6)
					arrayFinal[i] = elemento2;
					senão
						se (i < 9)
							arrayFinal[i] = elemento3;
		}
	}
	
	para (inteiro i = 0, i < 9, i++){
		escreva arrayFinal[i];
	}
Fim