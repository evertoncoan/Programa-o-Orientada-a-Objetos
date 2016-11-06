package ExerciciosDeClasses.Aluno;

public class Disciplina {
	private String codigo;
	private String nome;
	private String semestre;
	private double[] notas = new double[3];
	
	public Disciplina(){
		codigo = null;
		nome = null;
		semestre = null;
		for(int i = 0; i < notas.length; i++)
			notas[i] = 0;
	}
	
	public Disciplina(String c, String n, String s, double[] pNotas){
		codigo = c;
		nome = n;
		semestre = s;
		notas = pNotas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String mostraArrayNotas(){
		String msg = null;
		for(int i = 0; i < notas.length; i++)
			msg += "Nota[]: " + notas[i];
		return msg;
	}
	
	public String toString(){
		return "Código: " + this.getCodigo() +
				"\nNome: " + this.getNome() +
				"\nSemestre: " + this.getSemestre() +
				"\nNotas: " + this.mostraArrayNotas();
	}
}
