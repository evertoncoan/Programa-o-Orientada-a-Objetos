
public class Controle {
	public static void main(String[] args){
		InteracaoUsuario iu = new InteracaoUsuario();
		Aluno a1 = new Aluno(123, "Patricia", "Computação");
		Aluno a2 = new Aluno(456, "Ana", "Enfermagem");
		Aluno a3 = new Aluno(789, "Marcos", "História");
		
		//iu.informaUsuario("a1 e a2: " + a1.verificaNomesIguais(a2));
		//iu.informaUsuario("a2 e a3: " + a2.verificaNomesIguais(a3));
		
		iu.informaUsuario(a1.toString());
		System.out.println("\n" + a2);
	}
}
