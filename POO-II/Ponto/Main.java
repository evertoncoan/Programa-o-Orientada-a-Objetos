
public class Main
{
	public static void main(String[] args)
	{
		Ponto p;
		//p = new Ponto();
		p = new Ponto (3,4);
		
		p.mostrar();
		
		p.deslocarX(3);
		
		p.mostrar();
		
		System.out.println("norma(p) = " + p.norma());
		
		Retangulo r = new Retangulo(p, new Ponto(9,2));
		r.deslocarX(3);
		p.mostrar();
		
		System.out.println("area(r) = " + r.largura() + " * " + r.altura() + " = " + r.area());
	}
}