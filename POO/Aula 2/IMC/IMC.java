package IMC;

import javax.swing.JOptionPane;

public class IMC 
{
	public static void main(String[] args)
	{
		double peso;
		double altura;
		double IMC;
		String texto;
		
		texto = JOptionPane.showInputDialog("Informe seu peso: ");
		peso = Double.parseDouble(texto);
		
		texto = JOptionPane.showInputDialog("Informe sua altura: ");
		altura = Double.parseDouble(texto);
		
		IMC = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + IMC);
	}
}
