package Grafico;

import javax.swing.*;
import java.awt.*;

class Main {

  public static void main(String[] dsds) {
    JFrame f;
    f = new JFrame();
    f.setContentPane(new Reprodutor());
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(400,500);
    f.setVisible(true);

  }
 
}//

class Reprodutor extends JPanel {
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
       g.setColor(Color.green);
       g.drawRect(100,200,80,80);
       g.setColor(Color.blue);
       g.fillOval(100,200,80,80);
       g.setColor(Color.red);
       g.drawPolygon(new int[]{100,150,125},new int[]{150,150,100},3);
       g.setColor(Color.GREEN);
       g.fillRect(50, 20, 150, 80);
       g.setColor(Color.yellow);
       g.fillRoundRect(80, 80, 40, 40, 20, 30);
    
  }

}

