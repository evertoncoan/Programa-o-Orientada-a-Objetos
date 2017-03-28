
//package Carros;

class Revendedora
{
	//Interacao entrada = new Interacao();
	
	private Carro[] acervo = new Carro[1000];
		int n = 2;
		Revendedora() {
		acervo[1] = new Carro("Fiat", "Uno", "Prata", 2008, 12000);
		acervo[2] = new Carro("Ford", "Eco", "Prata", 2010, 25000);
		n = 2;
		};
	
	void addCarro(Carro x)
	{
		acervo[n] = x;
		n = n + 1;
	}
	
	void removeCarro(Carro x)
	{
		removeCarro(indexOf(x));
	}
	
	private void removeCarro(int k)
	{
		if (k < 0) return;
		n = n - 1;
		acervo[k] = acervo[n];
		//return;
	}
	
	private int indexOf(Carro x)
	{
		for (int i = 0; i < n; i++)
		{
			if(acervo[i] == x) return i;
		}
		return -1;
	}
	
	void listarTodos()
	{
		for (int i = 0; i < n; i++)
		{
			acervo[i].imprimir();
		}
	}
	
	//imprimir carros tq carro.ano >= x
	void listarNovos(int x)
	{
		for (int i = 0; i < n; i++)
		{
			acervo[i].imprimir(x);
		}
	}
	
	/*void adicionar()
	{
		String marca = entrada.SolicitaString("Marca:");
		String modelo = entrada.SolicitaString("Modelo:");
		String cor = entrada.SolicitaString("Cor:");
		
		int ano = entrada.SolicitaInteiro("Ano:");
		int preco = entrada.SolicitaInteiro("Preço:");
	}*/
}