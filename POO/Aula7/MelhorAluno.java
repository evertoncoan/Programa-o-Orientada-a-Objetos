package Aula7;

import javax.swing.JOptionPane;

public class MelhorAluno 
{
	public static void main(String[] args)
	{
		int numeroAlunos, contador = 0;
		double nota, melhorNota = 0;
		String nome, nomeAluno = null;
		
		String texto = JOptionPane.showInputDialog("Informe o número de alunos: ");
		numeroAlunos = Integer.parseInt(texto);
		
		do {
			nome = JOptionPane.showInputDialog("Informe o nome do aluno(a): ");
			
			String texto1 = JOptionPane.showInputDialog("Informe a nota do aluno(a): ");
			nota = Double.parseDouble(texto1);
			
			if (nota > melhorNota){
				melhorNota = nota;
				nomeAluno = nome;
			}
			contador = contador + 1;
			
		} while (contador < numeroAlunos);
		
		System.out.println("O melhor aluno(a) da turma é " + nomeAluno + ".");
		System.out.println("Com a nota " + melhorNota + ".");
	}
}
