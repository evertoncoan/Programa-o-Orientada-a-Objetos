package Carros;

class ListadorIntervalo implements Listador {
	private int x, y;
	
	ListadorIntervalo(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void carro(String marca, String modelo,
			String cor, int ano, int preco)
	{
		if(ano >= x && ano <= y)
		{
			System.out.println(marca +"/"+ modelo +"/"+ ano +" = "+ preco);
		}
	}
}
