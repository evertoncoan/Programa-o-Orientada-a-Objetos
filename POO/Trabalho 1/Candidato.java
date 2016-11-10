public class Candidato {
	private int idade;
	private String nome;
	private String genero;
	
	public Candidato(){
		idade = 0;
		nome = null;
		genero = null;
	}
	
	public Candidato(int pIdade, String pNome, String pGenero){
		idade = pIdade;
		nome = pNome;
		genero = pGenero;
	}

	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int pIdade){
		idade = pIdade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String pNome){
		nome = pNome;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public void setGenero(String pGenero){
		genero = pGenero;
	}
	
	public String toString(){
		return "Gênero: "  + this.getGenero() +
			   "\nIdade: " + this.getIdade() +
			   "\nNome: "  + this.getNome();
	}
	
	public boolean equals(Object o)
	{
		Candidato c = (Candidato)o;
		
		if (   this.getGenero().equals(c.getGenero())
			&& this.getNome().equals(c.getNome())
			&& this.getIdade() == c.getIdade() )
		{
			return true;
		}
		else
			return false;
	}
}
