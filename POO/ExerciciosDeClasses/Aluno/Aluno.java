package ExerciciosDeClasses.Aluno;

public class Aluno {
	private int matricula;
	private String nome;
	private String curso;
	private Disciplina[] disciplinas;
	
	public Aluno(){
		matricula = 0;
		nome = null;
		curso = null;
		disciplinas = null;
	}
	
	public Aluno(int mat, String pNome, String pCurso, Disciplina[] pDisciplinas){
		matricula = mat;
		nome = pNome;
		curso = pCurso;
		disciplinas = pDisciplinas;
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
	
	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public boolean verificaNomesIguais(Aluno pAluno){
		if(this.getNome().equals(pAluno.getNome()))
			return true;
		else
			return false;
	}
	
	public String mostraArrayDisciplinas(){
		String msg = null;
		for(int i = 0; i < disciplinas.length; i++)
			msg += "Nota[%d]: " + i + disciplinas[i];
		return msg;
	}
	
	public String toString(){
		return "Nome: " + this.getNome() +
			   "\nMatricula: " + this.getMatricula() +
			   "\nCurso: " + this.getCurso() +
			   "\nDisciplinas: " + this.mostraArrayDisciplinas();
	}
}
