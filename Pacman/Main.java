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
		lab = new Labirinto();
		pac = new PacMan(input, lab);
		quadro = new Painel(5, input, lab);
		janela = new Janela(quadro, "Pac-Man", 1300, 765);// 1280 x 720
		anima = new Reprodutor(20, quadro, 15, 15, pac);

		janela.cfgJanela();
		quadro.addImagem(anima);
		
		
		
	}
	
}


/**
 * https://stackoverflow.com/questions/27208846/addkeylistener-not-working
 * https://stackoverflow.com/questions/8961938/java-keylistener-not-registering-arrow-keys
 * https://gist.github.com/hanksudo/5626452
 * 
 * https://docs.oracle.com/javase/tutorial/2d/images/loadimage.html
 * https://stackoverflow.com/questions/601274/how-do-i-properly-load-a-bufferedimage-in-java
 * http://docs.oracle.com/javase/7/docs/api/java/awt/image/BufferedImage.html#getRGB%28int,%20int%29
 * https://stackoverflow.com/questions/25761438/understanding-bufferedimage-getrgb-output-values
 * 
 * @author Everton
 *
 */