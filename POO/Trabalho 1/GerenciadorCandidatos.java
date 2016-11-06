import java.util.Arrays;

public class GerenciadorCandidatos {
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
	
	public Candidato getArrayCandidatos(int i) {
		return arrayCandidatos[i];
	}
	
	public void setArrayCandidatos(int i, Candidato arrayCandidatos) {
		this.arrayCandidatos[i] = arrayCandidatos;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
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
		return iu.solicitaString("Nome:");
	}
	
	/**
	 * Solicita a idade dos candidatos.
	 * 
	 * @return um inteiro contendo a idade.
	 */
	private int solicitarIdade()
	{
		boolean notNumber = false;
		int idade = 0;
		while (notNumber == false)
		{
			String texto = iu.solicitaString("Idade:");
			try
			{
				idade = Integer.parseInt(texto);
				notNumber = true;
			}
			catch(Exception e)
			{
				 iu.informaUsuario("Não é número. Insira um número");
			}
		}
		return idade;
	}
	
	/**
	 * Solicita o gênero dos candidatos.
	 * 
	 * @return uma String contendo o gênero.
	 */
	private String solicitarGenero() {
		return iu.solicitaGenero("Genero:\nInsira M ou F.");
	}
	
	/**
	 * a. Calcula e retorna (informa) a idade média dos candidatos;
	 * 
	 * @return uma String contendo a idade média dos candidatos.
	 */
	public String idadeMedia(){
		double total = 0;
		for (int i = 0; i < this.tamanho; i++){
			total = total + arrayCandidatos[i].getIdade();
		}
		total        = total / this.tamanho;
		String media = Double.toString(total);
		return "Idade média: " + media + " anos.";
	}
	
	/**
	 * b. Define a maior idade entre todos os candidatos;
	 * 
	 * @return uma String contendo a maior idade dentre todos os candidatos.
	 */
	public String maiorIdade(){
		int maiorInt = 0;
		for (int i = 0; i < this.tamanho; i++){
			if (arrayCandidatos[i].getIdade() > maiorInt)
				maiorInt = arrayCandidatos[i].getIdade();
		}
		String maiorString = Integer.toString(maiorInt);
		return "Maior idade entre todos os candidatos: " + maiorString + " anos.";
	}
	
	/**
	 * c. Define a maior idade entre todos os homens;
	 * 
	 * @return uma String contendo a maior idade dentre todos os homens.
	 */
	public String maiorIdadeHomens(){
		int maiorInt = 0;
		if (this.existeHomen)
		{
			for (int i = 0; i < this.tamanho; i++)
			{
				if (arrayCandidatos[i].getIdade() > maiorInt && "M".equals(arrayCandidatos[i].getGenero()))
				maiorInt = arrayCandidatos[i].getIdade();
			}
			String maiorString = Integer.toString(maiorInt);
			return "Maior idade entre todos os candidatos homens: " + maiorString + " anos.";
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
	public String mesmoNome()//falta arrumar o problema de ter dois pares de pessoas com nomes iguais
	{
		String resultado        = "";
		int mesmoNomeInt        = 1;
		boolean[] arrayBool     = new boolean[this.tamanho];
		boolean existeMesmoNome = false;
		
		Arrays.fill( arrayBool, Boolean.FALSE );
		
		for( int i = 0; i < this.tamanho; i++ )
		{
			for( int j = this.tamanho - 1; j > i; j-- )
			{
				if( arrayBool[j] == false 
				    && arrayCandidatos[i].getNome().equals(arrayCandidatos[j].getNome()) )
				{
					arrayBool[j] = true;
					mesmoNomeInt = mesmoNomeInt + 1;
					
					if( !resultado.contains( arrayCandidatos[i].getNome() ) )
						resultado = resultado + arrayCandidatos[i].getNome() + ", ";
					
					existeMesmoNome = true;
				}
			}
		}
		String mesmoNomeString = Integer.toString(mesmoNomeInt);
		if (existeMesmoNome)
		{
			// http://www.rexegg.com/regex-quickstart.html
			resultado = resultado.replaceAll(", $", ".");
			return "Existem " + mesmoNomeString + " candidatos com o mesmo nome. São eles:\n" + resultado;
		}
		else
			return "Não existem candidatos com o mesmo nome.";
	}
}