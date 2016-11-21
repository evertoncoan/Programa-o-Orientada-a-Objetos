public class GerenciadorSensores
{
	S_Temperatura st = new S_Temperatura();
	S_Luz sl = new S_Luz();
	
	public void verificaTemperatura(){
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
		
		System.out.println("\nForam registradas mais de três temperaturas "
				         + "consecutivas fora do intervalo de 15.5 a 30.8.");
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
