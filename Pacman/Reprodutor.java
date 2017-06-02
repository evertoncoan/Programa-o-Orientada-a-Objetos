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
	
	GameInput input;
	
	public Reprodutor(int tempo, JPanel painel, int x, int y, GameInput input)
	{
		this.tempo = new Timer (tempo, this);
		this.tempo.start();
		this.painel = painel;
		this.x = x;
		this.y = y;
		this.input = input;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (input.key_down)
		{
			if (y < 630)
				y += 5;
		}

		if (input.key_up)
		{
			if (y > 0)
				y -= 5;
		}

		if (input.key_right)
		{
			if (x < 1214)
				x += 5;
		}

		if (input.key_left)
		{
			if (x > 0)
				x -= 5;
		}
		
		painel.repaint();
	}
	
	public void reproduzir(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 50, 50); // teste
	}
}