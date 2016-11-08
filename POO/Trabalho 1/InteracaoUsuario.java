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
			String mensagemErro = "Não é número inteiro positivo.\nInsira um número inteiro positivo.";
			String texto = this.solicitaString(msg);
			
			if( texto == null )
			{
				break;
			}
			
			try
			{
				inteiro = Integer.parseInt(texto);
				if (inteiro > -1)
					notNumber = true;
				else
					this.informaUsuario(mensagemErro);
			}
			catch(NumberFormatException e)
			{
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
	
	public int solicitaMenu(String msg)
	{
		int menu          = 0;
		boolean notNumber = false;
		
		while (notNumber == false)
		{
			String texto = this.solicitaString(msg);
			
			if(    !"1".equals(texto) || !"2".equals(texto) || !"3".equals(texto)
			    || !"4".equals(texto) || !"5".equals(texto) || !"6".equals(texto) )
			{
				menu = Integer.parseInt(texto);
				notNumber = true;
			}
				
			if( texto == null )
			{
				break;
			}
		}
		
		return menu;
	}
}
