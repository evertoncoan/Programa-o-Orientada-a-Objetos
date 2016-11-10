public class Controle {
	
	public static void main(String[] args){
		InteracaoUsuario iu = new InteracaoUsuario();
		
		int numCand = iu.solicitaInteiro("Inisira o número de candidatos: ", false );
		
		GerenciadorCandidatos gc = new GerenciadorCandidatos(numCand);
		
		gc.insereCandidatos();
		
		if(gc.getTamanho() > 0 )
		{
			int menuOption = 1;
			
			while (menuOption != -1)
			{
				menuOption = iu.solicitaInteiro("O que deseja fazer:"
						+ "\n1. Calcular a idade média dos candidatos."
						+ "\n2. Definir a maior idade entre todos os candidatos."
						+ "\n3. Definir a maior idade entre todos os candidatos homens."
						+ "\n4. Pesquisar um nome entre os candidatos."
						+ "\n5. Mostrar todos os candidatos cadastrados."
						+ "\n(Digite 1, 2, 3, 4 ou 5)"
						+ "\n(Clique em cancelar para sair)", true); 
				
				switch( menuOption )
				{
					case 1:
					{
						iu.informaUsuario(gc.idadeMedia());
						break;
					}
					case 2:
					{
						iu.informaUsuario(gc.maiorIdade());
						break;
					}
					case 3:
					{
						iu.informaUsuario(gc.maiorIdadeHomens());
						break;
					}
					case 4:
					{
						iu.informaUsuario(gc.mesmoNome());
						break;
					}
					case 5:
					{
						Candidato c;
						String t = "";
						
						for (int i = 0; i < gc.getTamanho(); i++)
						{
							c = gc.getCandidato(i);
							t = t + "Gênero: " + c.getGenero() + "\n" + "Idade: " 
							      + c.getIdade() + "\n" + "Nome: " + c.getNome() + "\n\n";
						}
						iu.informaUsuario("Os candidatos cadastrados são:\n\n" + t);
						break;
					}
				}
			}
		}
		else
		{
			iu.informaUsuario("Não existem pessoas suficientes cadastradas!" );			
		}
	}
}
