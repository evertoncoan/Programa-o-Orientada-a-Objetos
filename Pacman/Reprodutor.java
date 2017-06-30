import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Reprodutor implements Reproduzivel, ActionListener
{
	private Timer tempo;
	private int x;
	private int y;
	
	private JPanel painel;
	private PacMan pac;
	private Pastilhas pastilhas;//teste
	private GameInput input;//teste
	Salvamento save = new Salvamento();//teste
	
	public Reprodutor(int tempo, JPanel painel, int x, int y, PacMan pac, Pastilhas pastilhas, GameInput input)
	{
		this.tempo = new Timer (tempo, this);
		this.tempo.start();
		this.painel = painel;
		this.x = x;
		this.y = y;
		this.pac = pac;
		this.pastilhas = pastilhas;//teste
		this.input = input;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		x = pac.moverX(x, y);
		y = pac.moverY(y, x);
		pastilhas.comer(x, y);
		
		//System.out.println("x = " + x + ", " + (x + 33) + "   " + "y " + y + ", " + (y + 25));
		//System.out.println(pastilhas.pontos);//teste
		
		if (input.salvar)
		{
			try
			{
				save.salvar(x, "SavePacManX");
				save.salvar(y, "SavePacManY");
				System.out.println("Salvo!");
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (input.carregar)
		{
			try
			{
				x = save.carregar("SavePacManX");
				y = save.carregar("SavePacManY");
				//System.out.println(save.carregar("SavePacMan"));
				System.out.println("Carregado!");
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		painel.repaint();
	}
	
	public void reproduzir(Graphics g)
	{
		g.drawImage(pac.pacMan(), x, y, null);
	}
}
