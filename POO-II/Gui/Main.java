package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {

public static void main(String[] args) {
  JFrame f;
  f = new JFrame();
  JPanel quadro;
  quadro = new JPanel();
  //gui
  gui01(quadro);

  f.setContentPane(quadro);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setSize(300,400);
  f.setVisible(true);
}

public static void gui01(JPanel quadro) {
  JButton b;
  JLabel r;
  r = new JLabel("clique ao lado");
  quadro.add(r);
  b = new JButton("Clique aqui");
  quadro.add(b);
  ActionListener t;
  t = new Aplicacao();
  b.addActionListener(t);

}

}//

class Aplicacao implements ActionListener {

  public void actionPerformed(ActionEvent e) {
    System.out.println("clicado");
  }

}
