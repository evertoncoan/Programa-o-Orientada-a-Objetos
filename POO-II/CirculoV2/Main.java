package CirculoV2;

import java.awt.*;
import javax.swing.*;

class Main {
  
  public static void main(String[] sdsd) {
    JFrame f;
    f = new JFrame();
    f.setSize(500,500);
    f.setVisible(true);
   //ao sair da aplicacao, executar "System.exit(0)" (cf. aula)
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    //criar 'JPanel' (matriz de pixels para desenho) e associar a "f: JFrame"
    Reprodutor quadro; //Reprodutor eh uma especializacao de JPanel 
    quadro = new Reprodutor();
    f.setContentPane(quadro);
    
    teste1(quadro);

  } 

  static void teste1(Reprodutor quadro) {
  }
  
}//













