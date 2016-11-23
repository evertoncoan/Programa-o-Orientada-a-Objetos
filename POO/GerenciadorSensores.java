/*
Para o método + boolean estaLigado(); verificar se o valor da temperatura está
igual a 0, se estiver retornar false, senão retornar true.
Para o método + reinicia(); deixar a temperatura em 0 e mostra-la.
*/

public class GerenciadorSensores
{
	InteracaoUsuario iu = new InteracaoUsuario();
	S_Temperatura st = new S_Temperatura();
	S_Luz sl = new S_Luz();
	
	public int verificaTemperatura(){
		int intervalo = 0;
		
		while (intervalo != 3)
		{
			float temperatura = st.leValor();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Temperatura: " + temperatura);
			if (temperatura < 15.5 || temperatura > 30.8)
				intervalo ++;
			else
				intervalo = 0;
		}
		
		/*System.out.println("\nForam registradas mais de três temperaturas "
				         + "consecutivas fora do intervalo de 15.5 a 30.8.");*/
		
		int escolha = 0;
		
		do
		{
			String escolhaTexto = iu.solicitaString("Foram registradas mais de três temperaturas "
					  							  + "consecutivas fora do intervalo de 15.5 a 30.8.");
			
			escolha = Integer.parseInt(escolhaTexto);
		}while (escolha != 1 && escolha != 0);
		
		return escolha;
	}
	
	public void verificaLuz(){
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
		
		System.out.println("\nLED aceso.");
	}
}
