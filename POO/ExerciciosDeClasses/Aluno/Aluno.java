
public class Aluno {
	private int matricula;
	private String nome;
	private String curso;
	
	public Aluno(){
		matricula = 0;
		nome = null;
		curso = null;
	}
	
	public Aluno(int mat, String pNome, String pCurso){
		matricula = mat;
		nome = pNome;
		curso = pCurso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public boolean verificaNomesIguais(Aluno pAluno){
		if(this.getNome().equals(pAluno.getNome()))
			return true;
		else
			return false;
	}
	
	public String toString(){
		return "Nome: " + this.getNome() +
			   "\nMatricula: " + this.getMatricula() +
			   "\nCurso: " + this.getCurso();
	}
}
