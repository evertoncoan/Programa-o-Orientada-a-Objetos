public class Sensor {
	private int identificador;
	private String marca;
	
	public Sensor(){
		marca         = null;
		identificador = 0;
	}
	
	public Sensor(int pIdentificador, String pMarca){
		marca         = pMarca;
		identificador = pIdentificador;
	}
	
	public int getIdentificador(){
		return identificador;
	}
	
	public void setIdentificador(int pIdentificador){
		identificador = pIdentificador;
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca(String pMarca){
		marca = pMarca;
	}
	
	public void reinicia(){
		//fazer
	}
	
	public boolean estaLigado(){
		//fazer
		return false;
	}
	
	public String toString(){
		return "Marca: "           + this.getMarca() +
			   "\nIdentificador: " + this.getIdentificador();
	}
	
	public boolean equals(Object o){
		Sensor s = (Sensor)o;
		
		if (   this.getMarca().equals(s.getMarca())
			&& this.getIdentificador() == s.getIdentificador() )
		{
			return true;
		}
		else
			return false;
	}
}
