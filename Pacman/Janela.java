import javax.swing.JFrame;

public class Janela
{
	private JFrame janela;
	Painel quadro;
	private int largura;
	private int altura;
	
	public Janela(Painel quadro, int largura, int altura)
	{
		janela = new JFrame();
		this.quadro = quadro;
		this.largura = largura;
		this.altura = altura;
	}
	
	void cfgJanela()
	{
		janela.setTitle("Pac-Man");
		janela.setSize(largura, altura);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setContentPane(quadro);
	}
}
