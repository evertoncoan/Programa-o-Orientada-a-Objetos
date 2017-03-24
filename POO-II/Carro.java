
class Carro
{
	String marca, modelo, cor;
	int ano, preco;
	
	Carro(String marca, String modelo, String cor, int ano, int preco)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.preco = preco;
	}
	
	void imprimir()
	{
		System.out.println(marca + "/" + modelo + "/" + ano + " = " + preco);
		
	}
}
//fazer adicionar