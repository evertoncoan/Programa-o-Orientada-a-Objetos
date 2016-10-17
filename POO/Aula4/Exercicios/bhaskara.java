package Aula4.Exercicios;

import javax.swing.JOptionPane;

public class bhaskara {

	public static void main(String[] args) 
	{
		double a = 0, b = 0, c = 0, r1 = 0, r2 = 0, delta = 0;
		
		String a_texto = JOptionPane.showInputDialog("Informe o valor de A: ");
		a = Integer.parseInt(a_texto);
		
		String b_texto = JOptionPane.showInputDialog("Informe o valor de B: ");
		b = Integer.parseInt(b_texto);
		
		String c_texto = JOptionPane.showInputDialog("Informe o valor de C: ");
		c = Integer.parseInt(c_texto);
		
		delta = (b * b) -4 * a *c;
		
		if (delta < 0 )
			System.out.println("Não existem raizes reais.");
		else {
			r1 = (-(b) + Math.sqrt(delta))/2*a;
		    r2 = (-(b) - Math.sqrt(delta))/2*a;
		    System.out.println(r1);
		    System.out.println(r2);}
	}

}