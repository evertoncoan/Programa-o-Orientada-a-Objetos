import javax.swing.JOptionPane;

public class InteracaoUsuario {
	
	public String solicitaString(String msg)
	{
		return JOptionPane.showInputDialog(msg);
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
				break;
			}
			
			try
			{
				inteiro = Integer.parseInt(texto);
				
				notNumber = true;
			}
			catch(NumberFormatException  e)
			{
				 this.informaUsuario("Não é número. Insira um número");
			}
		}
		
		return inteiro;
	}
	
	public void informaUsuario(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public String solicitaGenero(String msg)
	{
		String genero = null;
		while (!"M".equals(genero) && !"F".equals(genero))
		{
			genero = JOptionPane.showInputDialog(msg);
			if( genero == null )
			{
				break;
			}
		}
		return genero;
	}
}
