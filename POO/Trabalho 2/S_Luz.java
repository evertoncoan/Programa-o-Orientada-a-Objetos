import java.util.Random;

public class S_Luz extends Sensor{
	public S_Luz(){
		super();
	}
	
	public S_Luz(int identificador, String marca){
		super(identificador, marca);
	}
	
	public void reinicia(){
		//fazer
	}
	
	public boolean estaLigado(){
		//fazer
		return false;
	}
	
	public int leValor(){
		Random gerador = new Random();
		int luz = 0;
		
		luz = gerador.nextInt(1000);
		
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
