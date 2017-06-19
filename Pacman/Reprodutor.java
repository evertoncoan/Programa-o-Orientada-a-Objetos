import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Reprodutor implements Reproduzivel, ActionListener
{
	private Timer tempo;
	private JPanel painel;
	private int x;
	private int y;
	
	PacMan pac;
	
	public Reprodutor(int tempo, JPanel painel, int x, int y, PacMan pac)
	{
		this.tempo = new Timer (tempo, this);
		this.tempo.start();
		this.painel = painel;
		this.x = x;
		this.y = y;
		this.pac = pac;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		x = pac.moverX(x, y);
		y = pac.moverY(y, x);
		
		painel.repaint();
	}
	
	public void reproduzir(Graphics g)
	{
		//g.setColor(Color.YELLOW);
		//g.fillOval(x, y, 50, 50); // teste
		g.drawImage(pac.pacMan(), x, y, null);
		//g.setColor(Color.BLUE);
		//g.drawLine(200, 200, 400, 200);
		//g.fillRect(0, 0, 200, 200);
	}
}
