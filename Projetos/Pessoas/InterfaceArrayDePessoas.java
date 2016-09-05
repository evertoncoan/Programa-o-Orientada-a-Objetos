package Pessoas;

public interface InterfaceArrayDePessoas {
	public void addPessoa(Pessoa umaPessoa);
	
	public InterfaceArrayDePessoas getByIdade(int inicioDaFaixa, int fimDaFaixa);
	
	public boolean temPessoa(Pessoa pessoa);
	
	public String toString();
}