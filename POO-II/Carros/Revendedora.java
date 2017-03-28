package Carros;

class Revendedora
{
	Interacao entrada = new Interacao();
	
	private Carro[] acervo = new Carro[]
			{
			new Carro("Fiat", "Uno", "Prata", 2008, 12000),
			new Carro("Ford", "Eco", "Prata", 2010, 25000)
			};
	
	int n = 2;
	
	void listarTodos()
	{
		for (int i = 0; i < n; i++)
		{
			acervo[i].imprimir();
		}
	}
	
	void adicionar()
	{
		String marca = entrada.SolicitaString("Marca:");
		String modelo = entrada.SolicitaString("Modelo:");
		String cor = entrada.SolicitaString("Cor:");
		
		int ano = entrada.SolicitaInteiro("Ano:");
		int preco = entrada.SolicitaInteiro("Preço:");
	}
}
