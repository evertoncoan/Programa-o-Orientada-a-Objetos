public class Controle {
	public static void main(String[] args){
		InteracaoUsuario iu = new InteracaoUsuario();
		
		Hotel h1 = new Hotel();
		
		//System.out.println(h1.reservaQuarto());
		
		//System.out.println("O valor das diárias é: R$ " + h1.calculaDiarias(7));
		
		//System.out.println("O valor do IPTU é: R$ " + h1.calculaIptu());
		
		Hotel h2 = new Hotel (12000, 220, 10);
		
		//System.out.println(h2.reservaQuarto());
		
		//System.out.println("O valor das diárias é: R$ " + h2.calculaDiarias(7));
		
		//System.out.println("O valor do IPTU é: R$ " + h2.calculaIptu());
		
		iu.informaUsuario();
	}
}
