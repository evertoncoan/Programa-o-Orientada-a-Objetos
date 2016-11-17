import java.util.Random;

public class S_Temperatura extends Sensor{
	private String modelo;
	
	public S_Temperatura(){
		super();
		modelo = null;
	}
	
	public S_Temperatura(int pIdentificador, String pMarca, String modelo){
		super(pIdentificador, pMarca);
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void reinicia(){
		//TODO
	}
	
	public boolean estaLigado(){
		//TODO
		return false;
	}
	
	public float leValor(){
		Random gerador = new Random();
		float temperatura = 0;
		int intervalo = 0;
		
		while (intervalo != 3)
		{
			temperatura = gerador.nextFloat() * 40;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Temperatura: " + temperatura);
			if (temperatura < 15.5 || temperatura > 30.8)
				intervalo ++;
			else
				intervalo = 0;
		}
		
		System.out.println("\nForam registradas mais de três temperaturas "
				         + "consecutivas fora do intervalo de 15.5 a 30.8.");
		
		return 0;
	}
	
	public String toString(){
		return "Marca: "           + this.getMarca() +
			   "\nIdentificador: " + this.getIdentificador() +
			   "\nModelo: "        + this.getModelo();
	}
	
	public boolean equals(Object o){
		S_Temperatura s = (S_Temperatura)o;
		
		if (   this.getMarca().equals(s.getMarca())
			&& this.getIdentificador() == s.getIdentificador()
			&& this.getModelo().equals(s.getModelo()) )
		{
			return true;
		}
		else
			return false;
	}
}
