package ExerciciosDeClasses.Circulo;

public class Controle {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		
		//Objeto c1
		System.out.println("Valor do atributo raio: " + c1.getRaio());
		System.out.println("Valor da área: " + c1.calculaArea());
		
		c1.setRaio(3);
		System.out.println("Valor do atributo raio: " + c1.getRaio());
		System.out.println("Valor da área: " + c1.calculaArea());
		
		//Objeto c2
		System.out.println("\nC2\nValor do atributo raio: " + c2.getRaio());
		System.out.println("Valor da área: " + c2.calculaArea());
		
		c2.setRaio(5);
		System.out.println("Valor do atributo raio: " + c2.getRaio());
		System.out.println("Valor da área: " + c2.calculaArea());
	}
}
