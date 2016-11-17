import javax.swing.JOptionPane;

public class IntencaoUsuario {
	
	public String solicitaString(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public void informaUsuario(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
}
