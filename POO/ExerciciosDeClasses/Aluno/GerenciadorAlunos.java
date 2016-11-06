package ExerciciosDeClasses.Aluno;

public class GerenciadorAlunos {
	Aluno[] alunos = new Aluno[3];
	int i = 0;
	
	public GerenciadorAlunos(){
		alunos = null;
	}
	
	public GerenciadorAlunos(int numeroAlunos){
		alunos = new Aluno[numeroAlunos];
	}
	
	public int insereAlunos(Aluno a){
		if(i >= alunos.length)
			return -1;
		else{
			alunos[i] = a;
			return i++;
		}
	}
	
	public String pesquisaAluno(Aluno a){
		String msg = "Aluno não encontrado.";
		for(Aluno x : alunos){
			if(x.getNome().equals(a.getNome()))
				msg = "Aluno Encontrado.";
		}
		return msg;
	}
	
	public String pesquisaAluno(String nome){
		String msg = "Aluno não encontrado.";
		for(Aluno x : alunos){
			if(x.getNome().equals(nome))
				msg = "Aluno Encontrado.";
		}
		return msg;
	}
}
