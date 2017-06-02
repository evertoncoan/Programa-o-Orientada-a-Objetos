package Anima;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class Main {

	public static void main(String[] sdsd) {
		JFrame f;
		f = new JFrame();
		f.setSize(600, 600);
		f.setVisible(true);
		// ao sair da aplicacao, executar "System.exit(0)" (cf. aula)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// criar 'JPanel' (matriz de pixels para desenho) e associar a "f:
		// JFrame"
		Reprodutor quadro; // Reprodutor eh uma especializacao de JPanel
		quadro = new Reprodutor();
		f.setContentPane(quadro);

		Main.teste(quadro);
		quadro.repaint();
	}

	static void teste(Reprodutor quadro) {
		quadro.addFig(new Bola(quadro));
	}
}//

// bad code (apenas para aprender a configuracao)
class Bola implements Reproduzivel, ActionListener {
	private Timer d;
	{
		d = new Timer(12, this);
		d.start();
	}
	private JPanel quadro;

	Bola(JPanel quadro) {
		this.quadro = quadro;
	}

	private int x = 100;

	private boolean sentido = false;

	public void actionPerformed(ActionEvent e) {
		// System.out.print("tic, ");

		if (sentido == false) {
			if (x < 400) {
				x = x + 3;
			} else {
				x = x - 3;
				sentido = true;
			}
		} else {
			if (x <= 100) {
				x = x + 3;
				sentido = false;
			} else {
				x = x - 3;
			}
		}

		quadro.repaint();
	}

	public void reproduzir(Graphics g) {
		// g.drawOval(x,50,20,20);

		g.fillRect(90, 50, 10, 350);
		g.fillRect(450, 50, 10, 350);

		g.setColor(Color.RED);
		g.fillOval(x, 50, 50, 50);
		g.setColor(Color.ORANGE);
		g.fillOval(x, 100, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillOval(x, 150, 50, 50);
		g.setColor(Color.PINK);
		g.fillOval(x, 200, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(x, 250, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(x, 300, 50, 50);
		g.setColor(Color.GRAY);
		g.fillOval(x, 350, 50, 50);
	}

}//
