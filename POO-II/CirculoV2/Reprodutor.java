package CirculoV2;

import java.awt.*;
import javax.swing.*;

class Reprodutor extends JPanel {
  
  private Reproduzivel[] fig = new Reproduzivel[500]; //nao eh legal usar numeros em codigos, mas ...
  private int prox = 0; //proximo slot disponivel

  //adicionar uma figura para reproducao
  void addFig(Reproduzivel fig) {
    this.fig[prox++] = fig;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    //if(fig != null)
      for(int i = 0; i < prox; i++) {
         fig[i].reproduzir(g);
      }

  }//()
    

}//



