import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel
{
	private Reproduzivel[] imagem;
	
	public Painel(int numImg)
	{
		imagem = new Reproduzivel[numImg];
		
		System.out.println( "ESTOU AQUI 2!!!!!" );
		setFocusable(true);
		addKeyListener( new EscutadorDeTeclas() );
	}
	
	private int slot = 0;
	
	void addImagem(Reproduzivel imagem)
	{
		this.imagem[slot++] = imagem;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.BLACK);
		
		for (int i = 0; i < slot; i++)
		{
			imagem[i].reproduzir(g);
		}
	}
}
