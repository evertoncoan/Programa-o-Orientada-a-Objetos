import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Reprodutor implements Reproduzivel, ActionListener
{
	private Timer tempo;
	private JPanel painel;
	private int dx;
	private int dy;
	private int x;
	private int y;
	
	GameInput input = new GameInput();
	
	public Reprodutor(int tempo, JPanel painel, int x, int y)
	{
		this.tempo = new Timer (tempo, this);
		this.tempo.start();
		this.painel = painel;
		this.x = x;
		this.y = y;
		this.dx = 0;
		this.dy = 0;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		x = input.moveX();
		y = input.moveY();
	
		painel.repaint();
	}
	
	public void reproduzir(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 50, 50); // teste
	}

}
