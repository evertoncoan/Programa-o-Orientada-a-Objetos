import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel
{
	private Reproduzivel[] imagem;
	private Labirinto lab;
	
	public Painel(int numImg, GameInput input, Labirinto lab)
	{
		imagem = new Reproduzivel[numImg];
		this.lab = lab;
		
		setFocusable(true);
		addKeyListener(input);
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
		g.drawImage(lab.labirinto(), 0, 0, this);
		//g.drawImage(lab.BufImagem(), 0, 0, this);
		
		for (int i = 0; i < slot; i++)
		{
			imagem[i].reproduzir(g);
		}
	}
}
