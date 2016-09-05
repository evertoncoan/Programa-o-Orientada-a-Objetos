package Everton;

/**
 * O programa do Everton Gostosão que soma e multiplica números.
 * 
 * @author Everton
 */
public class Everton 
{
	/**
	 * As variáveis que serão somadas
	 */
	int primeiroNumero = 84*96;
	int segundoNumero = 786*96;
	
	public static void main( String[] args ) // Método principal
	{
		System.out.println("Everton Gostosão"); // Imprime antes do resultado
		
		Everton objetoDoEverton = new Everton(); // Criando o objeto
		
		objetoDoEverton.soma(); // Chamando o método do objeto
	}	// Fim do método main
	
	/**
	 * Soma dois número e imprime na tela
	 */
	void soma() // Tipo de retorno
	{
		int somaDosNumeros = primeiroNumero + segundoNumero;
		System.out.println( "A soma é " + somaDosNumeros );
	}	// Fim do método soma

}	// Fim da classe Everton


