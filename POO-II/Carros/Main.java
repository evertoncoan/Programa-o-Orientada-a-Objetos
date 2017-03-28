//package Carros;

class Main
{
	public static void main(String[] args)
	{
		Revendedora lojine;
		lojine = new Revendedora();
		lojine.listarTodos();
		//lojine.adicionar();
		
		lojine.addCarro( new Carro("asdg","asd","asdf",2001,1) );
		lojine.addCarro( new Carro("asdg","asd","asdf",2002,2) );
		lojine.addCarro( new Carro("asdg","asd","asdf",2003,3) );
		lojine.addCarro( new Carro("asdg","asd","asdf",2004,4) );
		
		
		
	}
}