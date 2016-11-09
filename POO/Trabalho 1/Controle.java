public class Controle {
	
	public static void main(String[] args){
		InteracaoUsuario iu = new InteracaoUsuario();
		
		int numCand = iu.solicitaInteiro("Inisira o número de candidatos: ");
		
		GerenciadorCandidatos gc = new GerenciadorCandidatos(numCand);
		
		gc.insereCandidatos();
		
		if(gc.getTamanho() > 0 )
		{
			int menu = iu.solicitaMenu("O que deseja fazer:\n(Ecolha 1, 2, 3, 4, 5 ou 6)"); 
			if (menu == 1)
				iu.informaUsuario(gc.idadeMedia());
			if (menu == 2)
				iu.informaUsuario(gc.maiorIdade());
		}
		else
		{
			iu.informaUsuario("Não existem pessoas suficientes cadastradas!" );			
		}
		
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
