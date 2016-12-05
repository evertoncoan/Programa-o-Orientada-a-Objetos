public class GerenciadorSensores
{
	InteracaoUsuario iu;
	S_Temperatura st;
	S_Luz sl;
	
	Thread processoDeAtualizar;
	private boolean pararThread;
	
	public GerenciadorSensores(InteracaoUsuario iu, S_Temperatura st, S_Luz sl){
		this.iu = iu;
		this.st = st;
		this.sl = sl;
		this.pararThread = true;
	}
	
	public void verificaTemperatura()
	{
		if (pararThread)
		{
	      this.processoDeAtualizar = new Thread( new Atualizador() );
	      processoDeAtualizar.start();
		}
		else
			iu.informaUsuario("O Sensor ja está ligado.");
	}
	
	public void verificaLuz(){
		String escolhaLuz = "";
		int aux = 0;
		
		do
		{
			int luz = sl.leValor();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Luz: " + luz);
			
			aux = luz;
			
		}while (aux < 500);
		
		do
		{
			escolhaLuz = iu.solicitaString(sl.toString() + "\n\nLED aceso.\n\nValor " + aux + " registrado."
										 + "\n\nDigite 1 para continuar executando."
										 + "\nDigite 0 para parar a execução.");
			
			if( escolhaLuz == null )
			{
				break;
			}
			
		}while (!"1".equals(escolhaLuz) && !"0".equals(escolhaLuz));
		
		if ("1".equals(escolhaLuz))
			this.verificaLuz();
	}
	
	public void desligarSensorDeTemperatura() 
	{
		this.pararThread = true;
	}
	
	public final class Atualizador implements Runnable
	{
		/**
	    * Implementa uma thread que imprime a temperatura em intervalos de 1000 milisegundos.
	    *
	    * @see java.lang.Runnable#run()
	    */
	   @Override
	   public void run()
	   {
			String temperaturas = "";
			String escolhaTemp = "";
			int intervalo = 0;
			
			int tamanhoDoIntervalo = 3;
			pararThread = false;
			
			while (intervalo != tamanhoDoIntervalo && !pararThread)
			{
				float temperatura = st.leValor();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Temperatura: " + temperatura + "ºC");
				
				if (temperatura < 15.5 || temperatura > 30.8)
				{
					intervalo ++;
					temperaturas = temperaturas + temperatura + "ºC" + "\n";
				}
				else
				{
					intervalo = 0;
					temperaturas = "";
				}
			}
			
			pararThread = true;
			
			if ( tamanhoDoIntervalo == intervalo )
			{
				do
				{
					escolhaTemp = iu.solicitaString(st.toString() + "\n\nForam registradas mais de três temperaturas consecutivas"
							  				  	  + "\nfora do intervalo de 15.5ºC a 30.8ºC. São elas:\n\n" + temperaturas
							  				      + "\nDigite 1 para continuar executando."
							  				      + "\nDigite 0 para parar a execução.");
					
					if( escolhaTemp == null )
					{
						break;
					}
					
				}while (!"1".equals(escolhaTemp) && !"0".equals(escolhaTemp));
				
				if ("1".equals(escolhaTemp))
					verificaTemperatura();
			}
	   }
	}
}
