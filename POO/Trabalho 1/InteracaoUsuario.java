import javax.swing.JOptionPane;

public class InteracaoUsuario {
	
	public String solicitaString(String msg)
	{
		return JOptionPane.showInputDialog(msg);
	}
	
	public int solicitaInteiro(String msg, boolean menu)
	{
		int     inteiro   = 0;
		boolean notNumber = false;
		
		while (notNumber == false)
		{
			String mensagemErro = "Não é número inteiro positivo.\nInsira um número inteiro positivo.";
			String texto = this.solicitaString(msg);
			
			if( texto == null )
			{
				if( menu )
				{
					return -1;
				}
				else
				{
					break;
				}
			}
			
			try
			{
				inteiro = Integer.parseInt(texto);
				if (inteiro > -1 || menu)
					notNumber = true;
				else
					if( !menu )
						this.informaUsuario(mensagemErro);
			}
			catch(NumberFormatException e)
			{
				if( !menu )
					this.informaUsuario(mensagemErro);
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
