public class Controle {
	
	public static void main(String[] args){
		InteracaoUsuario iu = new InteracaoUsuario();
		
		//int numCand = iu.solicitaInteiro("Inisira o número de candidatos: ");
		
		//GerenciadorCandidatos gc = new GerenciadorCandidatos(numCand);
		
		//gc.insereCandidatos();
		iu.solicitaMenu("O que deseja fazer:\n(Ecolha 1, 2, 3, 4, 5 ou 6)");
		/*if(gc.getTamanho() > 0 )
		{
			int menu = 0;
			menu = 
			if ()
		}
		else
		{
			iu.informaUsuario("Não existem pessoas suficientes cadastradas!" );			
		}*/
		
		/*if(gc.getTamanho() > 0 )
		{
			String mensagens = gc.idadeMedia() + "\n"
					 + gc.maiorIdade()         + "\n"
				     + gc.maiorIdadeHomens()   + "\n"
				     + gc.mesmoNome();
			
			iu.informaUsuario( mensagens );
		}
		else
		{
			iu.informaUsuario("Não existem pessoas suficientes cadastradas!" );			
		}*/
	}
}
