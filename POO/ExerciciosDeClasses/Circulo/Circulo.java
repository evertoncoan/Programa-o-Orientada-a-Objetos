package ExerciciosDeClasses.Circulo;

public class Circulo {
	private double raio;
	
	public Circulo(){
		raio = 0;
	}
	
	public double getRaio(){
		return raio;
	}
	
	public void setRaio(double pRaio){
		raio = pRaio;
	}
	
	public double calculaArea(){
		//double area;
		return 3.1415 * raio * raio;
		//return area;
	}
}
