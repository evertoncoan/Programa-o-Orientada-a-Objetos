public class Controle {
	
	public static void main(String[] args){
		Candidato cand = new Candidato();
		InteracaoUsuario iu = new InteracaoUsuario();
		
		String numCandString = iu.solicitaString("Inisira o número de candidatos: ");
		int numCandInt = Integer.parseInt(numCandString);
		
		GerenciadorCandidatos gc = new GerenciadorCandidatos(numCandInt);
		
		gc.insereCandidatos();
		
		
		
		/*if(gc.getTamanho() > 0 )
		{
			String mensagens = gc.idadeMedia() + "\n"
					 + gc.maiorIdade()         + "\n"
				     + gc.maiorIdadeHomens()   + "\n"
				     + gc.mesmoNome()          + "\n"
				     + gc.getArrayCandidatos(0);
			
			iu.informaUsuario( mensagens );
		}
		else
		{
			iu.informaUsuario("Não existem pessoas suficientes cadastradas!" );			
		}*/
	}
}
