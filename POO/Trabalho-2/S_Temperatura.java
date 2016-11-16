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
		//fazer
	}
	
	public boolean estaLigado(){
		//fazer
		return false;
	}
	
	public float leValor(){
		//fazer
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
