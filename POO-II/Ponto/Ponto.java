package Ponto;

import static java.lang.Math.*;

public class Ponto
{
	private int x,y;
	
	Ponto()
	{
		//x = 3; y = 4;
		this(3,4);
	}
	
	Ponto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	void deslocarX(int v) {
		x = x + v;
	}
	
	void deslocarY(int v) {
		y = y + v;
	}
	
	double norma() {
		//return sqrt(x*x + y*y);
		//return sqrt(pow(x, 2) + pow(y, 2));
		return norma(new Ponto(0, 0));
	}
	
	double norma(Ponto q){
		int dx = this.x - q.x,
		    dy = this.y - q.y;
		
		return sqrt(dx*dx + dy*dy);
		
	}
	
	void mostrar()
	{
		System.out.println("(" + x + "," + y + ")");
	}
}
