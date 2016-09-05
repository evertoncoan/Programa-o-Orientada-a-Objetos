package Pessoas;

public class Controle {
	public static void main(String[] args){
		
		//Instanciação de objetos
		Pessoa p1 = new Pessoa("Patricia", 33, 'f', 1.84);
		Pessoa p2 = new Pessoa("Rodrigo", 19, 'm', 1.75);
		Pessoa p3 = new Pessoa("Carlos", 15, 'm', 1.90);
		InterfaceArrayDePessoas pessoas = new ArrayDePessoas();
		
		pessoas.addPessoa(p1);
		pessoas.addPessoa(p2);
		pessoas.addPessoa(p3);
		
		InterfaceArrayDePessoas pessoasNaFaixaEtaria = pessoas.getByIdade(18, 40);
		System.out.println(pessoasNaFaixaEtaria.toString());
		
		System.out.printf("%s est� no array? %b", p1.getNome(), pessoas.temPessoa(p1));
	}
}