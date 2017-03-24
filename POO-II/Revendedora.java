
class Revendedora
{
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
}
