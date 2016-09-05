package Pessoas;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private double altura;
	
	public Pessoa(String nome, int idade, char sexo, double altura){
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setAltura(altura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaPeso(){
		double pesoIdeal;
		if(sexo == 'f'){
			pesoIdeal = 62.1 * altura - 44.7;
		}
		else{
			pesoIdeal = 72.7 * altura - 58;
		}
		return pesoIdeal;	
	}
	
	public void idadeAsteriscos(){
		for(int i=0; i < idade; i++)
			System.out.print("*");
	}
	
	public String toString(){
		return "Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Altura: " + this.getAltura() + ", Sexo: " + this.getSexo() + "Peso ideal: " + this.calculaPeso(); 
	}
}