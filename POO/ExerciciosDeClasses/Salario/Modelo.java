package ExerciciosDeClasses.Salario;

public class Modelo {
	private double horas;
		
	public Modelo(){
		horas = 0;
	}
		
	public void setHoras(double pHoras){
		horas = pHoras;
	}
		
	public double getHoras(){
		return horas;
	}
		
	public double calculaSalario(){
		return 30 * horas;
	}
}
