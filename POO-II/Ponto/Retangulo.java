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
}
