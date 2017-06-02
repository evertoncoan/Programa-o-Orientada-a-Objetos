package GuiRsp3Contador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {

	public static void main(String[] args) {
		JFrame f;
		f = new JFrame();
		JPanel quadro;
		quadro = new JPanel();
		// gui
		gui01(quadro);

		f.setContentPane(quadro);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// f.setSize(300,400);
		f.pack();
		f.setVisible(true);
	}

	public static void gui01(JPanel quadro) {
		quadro.setPreferredSize(new Dimension(100, 50));
		JButton b;
		quadro.setLayout(new BorderLayout());
		JLabel r;
		r = new JLabel();
		quadro.add(r, BorderLayout.NORTH);
		JPanel p = new JPanel();
		quadro.add(p, BorderLayout.CENTER);
		b = new JButton();
		p.add(b);
		ActionListener t;
		t = new Incremento(new Contador(r));
		b.addActionListener(t);

	}

}//

class Contador {
	private int n;
	JLabel r;

	Contador(JLabel r) {
		this.r = r;
		this.atualizar();
	}

	void incrementar() {
		n = n + 1;
	}

	void atualizar() {
		r.setText("" + n);
	}
}//

class Incremento implements ActionListener {
	Contador contador;

	Incremento(Contador contador) {
		this.contador = contador;
	}

	public void actionPerformed(ActionEvent e) {
		contador.incrementar();
		contador.atualizar();
	}

}//
