import javax.swing.JFrame;

public class Janela
{
	private JFrame janela;
	private Painel quadro;
	private int largura;
	private int altura;
	private String titulo;
	
	public Janela(Painel quadro, String titulo, int largura, int altura)
	{
		janela = new JFrame();
		this.titulo = titulo;
		this.quadro = quadro;
		this.largura = largura;
		this.altura = altura;
	}
	
	void cfgJanela()
	{
		janela.setTitle(titulo);
		janela.setSize(largura, altura);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setContentPane(quadro);
	}
}
