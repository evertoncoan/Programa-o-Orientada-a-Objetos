import java.awt.AWTException;//
import java.awt.Color;//
import java.awt.Robot;//

public class Main
{
	public static void main(String[] args)
	{
		Painel quadro;
		Janela janela;
		Reprodutor anima;
		GameInput input;
		PacMan pac;
		
		input = new GameInput();
		pac = new PacMan(input);
		quadro = new Painel(5, input);
		janela = new Janela(quadro, "Pac-Man", 1280, 720);
		anima = new Reprodutor(7, quadro, 200, 0, pac);

		janela.cfgJanela();
		quadro.addImagem(anima);

	    System.out.println("Pixel:" + 25 + "," + 25);//
	    try {//
	        System.out.println(getPixel(25, 25));//
	    } catch (AWTException e1) {//
	        e1.printStackTrace();//
	    }//
	}
	
	public static Color getPixel(int x,int y) throws AWTException{//
	    Robot rb = new Robot();//
	    return rb.getPixelColor(x, y);//
	}//
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