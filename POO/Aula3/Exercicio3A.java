import javax.swing.JOptionPane;

public class Exercicio3A
{
	public static void main(String[] args)
	{
		String xTexto = JOptionPane.showInputDialog("Informe x: ");
		double x = Double.parseDouble(xTexto);
	
		String yTexto = JOptionPane.showInputDialog("Informe y: ");
		double y = Double.parseDouble(yTexto);
	
		String zTexto = JOptionPane.showInputDialog("Informe z: ");
		double z = Double.parseDouble(zTexto);
		
		if ((x > y) || (z <= 30))
			System.out.println(x * 2);
		
		else
			System.out.printf("x = " + x/2 + "\nz = " + z/5);
	}
}
