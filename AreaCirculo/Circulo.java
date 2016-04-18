import java.lang.Math;

/**
 * Representa um objeto circulo utilizando somente o seu raio.
 * 
 * @author Everton
 */
public class Circulo 
{
	/**
	 * Raio do circulo.
	 */
	private double raio;
	
	/**
	 * Construtor que inicializa o raio deste circulo.
	 * 
	 * @param raio       o raio do circulo.
	 */
	public Circulo(double raio)
	{
		this.ajustarRaio( raio );
	}
	
	/**
	 * Calcula a área do circulo que esse objeto representa.
	 * 
	 * @return       a área do circulo
	 */
	public double calcularArea()
	{
		return Math.PI * Math.pow( this.raio, 2 );
	}

	/**
	 * Retorna o raio do circulo.
	 * 
	 * @return     o raio do circulo que este objeto representa
	 */
	public double obterRaio()
	{
		return this.raio;
	}
	
	public void ajustarRaio( double raio )
	{
		if( raio >= 0 )
		{
			this.raio = raio;
		}
	}
}
