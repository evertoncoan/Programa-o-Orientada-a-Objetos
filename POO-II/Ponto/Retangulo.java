package Ponto;

public class Retangulo {
	private Ponto a,b;
	
	Retangulo(Ponto a, Ponto b) {
		this.a = a;
		this.b = b;
	}
	
	void deslocarX(int v) {
		a.deslocarX(v);
		b.deslocarX(v);
	}
	
	void deslocarY(int v) {
		a.deslocarY(v);
		b.deslocarY(v);
	}
	//largura, altura, area, perimetro
	
	int largura()
	{
		return a.normaX(b);
	}
	
	int altura()
	{
		return a.normaY(b);
	}
	
	int area()
	{
		return largura() * altura();
	}
	
	int perimetro()
	{
		return 2 * (largura() + altura());
	}
}
