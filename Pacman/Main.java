import java.awt.AWTException;// teste
import java.awt.Color;// teste
import java.awt.Robot;// teste

public class Main
{
	public static void main(String[] args)
	{
		Painel quadro;
		Janela janela;
		Reprodutor anima;
		GameInput input;
		PacMan pac;
		Labirinto lab;
		
		input = new GameInput();
		pac = new PacMan(input);
		lab = new Labirinto();
		quadro = new Painel(5, input, lab);
		janela = new Janela(quadro, "Pac-Man", 1300, 765);// 1280 x 720
		anima = new Reprodutor(7, quadro, 50, 50, pac);

		janela.cfgJanela();
		quadro.addImagem(anima);

	    System.out.println("Pixel:" + 25 + "," + 25);// teste
	    try {// teste
	        System.out.println(getPixel(40, 40));// teste
	    } catch (AWTException e1) {// teste
	        e1.printStackTrace();// teste
	    }// teste
	}
	
	public static Color getPixel(int x,int y) throws AWTException{// teste
	    Robot rb = new Robot();// teste
	    return rb.getPixelColor(x, y);// teste
	}// teste
}


/**
 * https://stackoverflow.com/questions/27208846/addkeylistener-not-working
 * https://stackoverflow.com/questions/8961938/java-keylistener-not-registering-arrow-keys
 * https://gist.github.com/hanksudo/5626452
 * 
 * https://stackoverflow.com/questions/22217148/get-pixel-color-on-screen-java
 * 
 * @author Everton
 *
 */