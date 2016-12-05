import java.util.Random;

public class S_Luz extends Sensor{
	private int luz;
	
	public S_Luz(){
		super();
		this.luz = 0;
	}
	
	public S_Luz(int identificador, String marca){
		super(identificador, marca);
	}
	
	public void reinicia(){
		this.luz = 0;
	}
	
	public boolean estaLigado(){
		if (this.luz == 0)
			return false;
		else
			return true;
	}
	
	public int leValor(){
		Random gerador = new Random();
		
		this.luz = gerador.nextInt(1000);
		
		return luz;
	}
	
	public String toString(){
		return "Marca: "           + this.getMarca() +
			   "\nIdentificador: " + this.getIdentificador();
	}
	
	public boolean equals(Object o){
		S_Luz s = (S_Luz)o;
		
		if (   this.getMarca().equals(s.getMarca())
			&& this.getIdentificador() == s.getIdentificador() )
		{
			return true;
		}
		else
			return false;
	}
}
