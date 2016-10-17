Lista de Exercícios Vetores.
Exercício 7.

Inicio
	real elemento1, array1[20];
	real elemento2, array2[20];
	real array3[40];
	inteiro k = 0, n = 1;
	
	para (int i = 0, i < 20, i++){
		leia elemento1;
		array1[i] = elemento1;
		array3[k] = elemento1;
		k = k + 2;
	}
	
	para (int i = 0, i < 20, i++){
		leia elemento2;
		array2[i] = elemento2;
		array3[n] = elemento2;
		n = n + 2;
	}
	
	para (int i = 0, i < 40, i++){
		escreva array3[i];
	}
Fim