﻿Lista de Exercícios Vetores.
Exercício 2.

Inicio
	inteiro arrayElementos[10];
	inteiro elemento, quantidadeNumerosImpares = 0;

	enquanto (quantidadeNumerosImpares < 10){
		leia elemento;
		se (elemento mod 2 != 0){
			arrayElementos[quantidadeNumerosImpares] = elemento;
			quantidadeNumerosImpares++;
		}
	}

	para (inteiro i = 0, i < 10, i++){
		escreva arrayElementos[i];
	}
Fim
