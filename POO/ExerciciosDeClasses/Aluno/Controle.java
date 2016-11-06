package ExerciciosDeClasses.Aluno;

public class Controle {
	public static void main(String[] args){
		//InteracaoUsuario iu = new InteracaoUsuario();
		GerenciadorAlunos ga = new GerenciadorAlunos(3);
		
		double[] notas1 = new double[3];
		Disciplina ine5401 = new Disciplina("ine5401", "Introdução a CO", "2016-2", notas1);
		
		double[] notas2 = new double[3];
		Disciplina ine5402 = new Disciplina("ine5402", "POOI", "2016-2", notas2);
		
		Disciplina[] array_disciplinas = new Disciplina[2];
		array_disciplinas[0] = ine5401;
		array_disciplinas[1] = ine5402;
		
		Aluno a1 = new Aluno(123, "Patricia", "Computação", array_disciplinas);
		Aluno a2 = new Aluno(456, "Ana", "Automação", array_disciplinas);
		Aluno a3 = new Aluno(789, "Ana Pereira", "SistemasInformação", array_disciplinas);
		
		ga.insereAlunos(a1);
		ga.insereAlunos(a2);
		ga.insereAlunos(a3);
		
		String existeAluno = ga.pesquisaAluno("Ana Pereira");
		System.out.println(existeAluno);
		
		//iu.informaUsuario("a1 e a2: " + a1.verificaNomesIguais(a2));
		//iu.informaUsuario("a2 e a3: " + a2.verificaNomesIguais(a3));
		
		//iu.informaUsuario(a1.toString());
		//System.out.println("\n" + a2);
	}
}
