import javax.swing.JOptionPane;

public class InteracaoUsuario {
	
	public String solicitaString(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public void informaUsuario(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public String solicitaGenero(String msg){
		String genero = null;
		while (!"M".equals(genero) && !"F".equals(genero)){
			genero = JOptionPane.showInputDialog(msg);
		}
		return genero;
	}
}
