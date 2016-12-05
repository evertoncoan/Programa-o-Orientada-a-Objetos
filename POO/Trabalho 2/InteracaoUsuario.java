import javax.swing.JOptionPane;

public class InteracaoUsuario
{
	
	public String solicitaString(String msg)
	{
		return JOptionPane.showInputDialog(msg);
	}
	
	public void informaUsuario(String msg)
	{
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public int solicitaInteiro(String msg)
	{
		int     inteiro   = 0;
		boolean notNumber = false;
		
		while (notNumber == false)
		{
			String texto = this.solicitaString(msg);
			
			if( texto == null )
			{
				return Integer.MAX_VALUE;
			}
			
			try
			{
				inteiro = Integer.parseInt(texto);
				notNumber = true;
			}
			catch(NumberFormatException e){}
		}
		
		return inteiro;
	}
}
