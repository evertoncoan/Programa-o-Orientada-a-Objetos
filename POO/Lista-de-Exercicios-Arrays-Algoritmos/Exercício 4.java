Lista de Exercícios Vetores.
Exercício 4.

Inicio
	real elemento arrayElementos[20];
	real X;
	boolean bool = false;
	
	para (inteiro i = 0, i < 20, i++){
		leia elemento;
		arrayElementos[i] = elemento;
	}
	
	leia X;
	
	para (inteiro i = 0, i < 20, i++){
		se (arrayElementos[i] == X){
			escreva i;
			bool = true;
		}
	}
	
	se (bool == false)
		escreva "Valor não encontrado";
Fim