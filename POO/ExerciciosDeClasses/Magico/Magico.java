public class Magico {
	private double numMag;
	private double numero;
	
	public Magico() {
		numMag = 0;
		numero = 0;
	}
	
	public void setNumMag(double pNumMag){
		numMag = pNumMag;
	}
	
	public double getNumMag(){
		return numMag;
	}
	
	public void setNumero(double pNumero){
		numero = pNumero;
	}
	
	public double getNumero(){
		return numero;
	}
	
	public boolean advinha(){
		if (numMag == numero)
			return true;
		else return false;
	}
}
