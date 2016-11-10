//import java.util.Arrays;

public class GerenciadorCandidatos 
{
	InteracaoUsuario iu = new InteracaoUsuario();
	
	private Candidato[] arrayCandidatos;
	private int tamanho;
	private int tamanhoOriginal;
	private boolean existeHomen;
	
	/**
	 * Constrói um gerenciador de candidatos que suporta somente numCand.
	 * 
	 * @param numCand um inteiro
	 */
	public GerenciadorCandidatos(int numCand){
		arrayCandidatos      = new Candidato[numCand];
		this.tamanho         = arrayCandidatos.length;
		this.existeHomen     = false;
		this.tamanhoOriginal = this.tamanho;
	}
	
	public Candidato getCandidato(int i){
		return arrayCandidatos[i];
	}
	
	public void setCandidato(int i, Candidato arrayCandidatos){
		this.arrayCandidatos[i] = arrayCandidatos;
	}

	public int getTamanho(){
		return tamanho;
	}

	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}
	
	/**
	 * Insere objetos do tipo Candidato no Gerenciador de Candidatos.
	 */
	public void insereCandidatos()
	{
		int contador = 0;
		
		for (int i = 0; contador < this.tamanhoOriginal; i++, contador++)
		{
			String nome   = this.solicitarNome();
			
			if (!"Ademir Flores".equals(nome))
			{
				int idade     = this.solicitarIdade();
				String genero = this.solicitarGenero();
				if ("M".equals(genero))
					this.existeHomen = true;
			
				arrayCandidatos[i] = new Candidato(idade, nome, genero);
			}
			else
			{
				i--;
				this.tamanho--;
			}
		}
	}
	
	/**
	 * Solicita o nome dos candidatos.
	 * 
	 * @return ma String contendo o nome.
	 */
	private String solicitarNome() {
		return iu.solicitaString("Insira o nome do candidato:");
	}
	
	/**
	 * Solicita a idade dos candidatos.
	 * 
	 * @return um inteiro contendo a idade.
	 */
	private int solicitarIdade() {
		return iu.solicitaInteiro("Insira a idade do candidato:", false);
	}
	
	/**
	 * Solicita o gênero dos candidatos.
	 * 
	 * @return uma String contendo o gênero.
	 */
	private String solicitarGenero() {
		return iu.solicitaGenero("Insira o gênero do candidato:\nDigite M ou F.");
	}
	
	/**
	 * a. Calcula e retorna (informa) a idade média dos candidatos;
	 * 
	 * @return uma String contendo a idade média dos candidatos.
	 */
	public String idadeMedia()
	{
		double total = 0;
		for (int i = 0; i < this.tamanho; i++)
		{
			total = total + arrayCandidatos[i].getIdade();
		}
		total        = total / this.tamanho;
		String media = Double.toString(total);
		return "A idade média entre todos os candidatos é de " + media + " anos.";
	}
	
	/**
	 * b. Define a maior idade entre todos os candidatos;
	 * 
	 * @return uma String contendo a maior idade dentre todos os candidatos.
	 */
	public String maiorIdade()
	{
		int maior = 0;
		for (int i = 0; i < this.tamanho; i++)
		{
			if (arrayCandidatos[i].getIdade() > maior)
				maior = arrayCandidatos[i].getIdade();
		}
		return "A maior idade entre todos os candidatos é de " + maior + " anos.";
	}
	
	/**
	 * c. Define a maior idade entre todos os homens;
	 * 
	 * @return uma String contendo a maior idade dentre todos os homens.
	 */
	public String maiorIdadeHomens()
	{
		int maior = 0;
		if (this.existeHomen)
		{
			for (int i = 0; i < this.tamanho; i++)
			{
				if (arrayCandidatos[i].getIdade() > maior && "M".equals(arrayCandidatos[i].getGenero()))
				maior = arrayCandidatos[i].getIdade();
			}
			return "A maior idade entre todos os candidatos homens é de " + maior + " anos.";
		}
		else
			return "Não existem candidatos homens.";
	}
	
	/**
	 * e. Calcula e retorna (informa) a quantidade de candidatos com um mesmo nome (por	
	 * exemplo, “Marina de Souza”).
	 * 
	 * @return uma String contendo a quantidade de candidatos com o mesmo nome.
	 */
	public String mesmoNome()
	{
		int     mesmoNome       = 0;
		boolean existeMesmoNome = false;
		
		String  nome      = iu.solicitaString("Insira um nome que deseja pesquisar entre os candidatos: ");
		String  resultado = "";
		
		for (int i = 0; i < this.tamanho; i++){
			if (nome.equals(arrayCandidatos[i].getNome()))
			{
				existeMesmoNome = true;
				mesmoNome = mesmoNome + 1;
				resultado = resultado + arrayCandidatos[i] + "\n\n";
			}
		}
			if (existeMesmoNome){
				// http://www.rexegg.com/regex-quickstart.html
				//resultado = resultado.replaceAll("\n$", ".");
				if (mesmoNome > 1)
					return "Existem " + mesmoNome + " candidatos com o esse nome."
						 + " Seus dados são:\n\n" + resultado;
				else
					return "Existe " + mesmoNome + " candidato esse nome. Seus dados são:\n\n" + resultado;
			}
			else
				return "Não existem candidatos esse nome.";
	}	
}