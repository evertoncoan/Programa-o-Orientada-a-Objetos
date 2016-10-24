package ExerciciosDeClasses.Hotel;

public class Hotel {
	public double iptu;
	public double valorDiaria;
	public int numeroQuartosLivres;
	
	public Hotel(){
		iptu = 0;
		valorDiaria = 0;
		numeroQuartosLivres = 0;
	}
	
	public Hotel(double pIptu, double pValorDiaria, int pNumeroQuartosLivres){
		iptu = pIptu;
		valorDiaria = pValorDiaria;
		numeroQuartosLivres = pNumeroQuartosLivres;
	}
	
	public void setIptu(double pIptu){
		iptu = pIptu;
	}
	
	public double getIptu(){
		return iptu;
	}
	
	public void setValorDiario(double pValorDiaria){
		valorDiaria = pValorDiaria;
	}
	
	public double getValorDiario(){
		return valorDiaria;
	}
	
	public void setNumeroQuartosLivres(int pNumeroQuarutosLivres){
		numeroQuartosLivres = pNumeroQuarutosLivres;
	}
	
	public int getNumeroQuartosLivres(){
		return numeroQuartosLivres;
	}
	
	public String reservaQuarto(){
		if (numeroQuartosLivres > 0){
			numeroQuartosLivres = numeroQuartosLivres - 1;
			return "Quarto reservado com sucesso.";
			}
		else
			return "Não é possivel realizar a reserva porque não "
					+ "há quarto disponível.";
	}
	
	public double calculaDiarias(int numeroDiarias){
		double valor = valorDiaria * numeroDiarias;
		if (numeroDiarias > 5){
			valor = valor * 0.9;
			return valor;
		}
		else
			return valor;
	}
	
	public double calculaIptu(){
		return (250 + 130 / 250) + 56;
	}
}
