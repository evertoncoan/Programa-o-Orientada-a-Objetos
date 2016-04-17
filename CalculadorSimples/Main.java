
public class Main {
	public static void main(String[] args) 
	{
		int p1=5;
		int p2=3;
		int tp1=10;
		int tp2=8;
		CalculadorSimples calculador = new CalculadorSimples();
		double media = calculador.calcularMedia(p1, p2, tp1, tp2);
		System.out.println("A média é: " + media);
	}
}
