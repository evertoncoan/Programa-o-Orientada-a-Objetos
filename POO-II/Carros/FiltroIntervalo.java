package Carros;

public class FiltroIntervalo implements Filtro
{
	private int x,y;
	FiltroIntervalo(int x, int y) { //[x,y]
	     this.x = x;
	     this.y = y;
	  }
	 
	public boolean passou(int ano) {
		return ano >= x && ano <= y;
	}
}
