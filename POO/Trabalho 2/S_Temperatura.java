import java.util.Random;

public class S_Temperatura extends Sensor{
	private String modelo;
	private float temperatura;
	
	public S_Temperatura(){
		super();
		modelo = null;
		temperatura = 0;
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
		this.temperatura = 0;
	}
	
	public boolean estaLigado(){
		if (this.temperatura == 0)
			return false;
		else
			return true;
	}
	
	public float leValor(){
		Random gerador = new Random();
		
		this.temperatura = gerador.nextFloat() * 40;
		
		return this.temperatura;
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
