package Aula4.Exercicios;

import javax.swing.JOptionPane;

public class funcao 
{

	public static void main(String[] args) 
	{
		double x = 0;
		
		String x_texto = JOptionPane.showInputDialog("Informe o valor de x: ");
		x = Double.parseDouble(x_texto);
		
		if (x <= 1)
			System.out.println("1");
		else 
			if (x > 1 && x <= 2)
				System.out.println("2");
			else
				if (x > 2 && x <= 3)
					System.out.println(x * x);
				else
					if (x > 3)
						System.out.println(x * x * x);

	}

}
