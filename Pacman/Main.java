import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Painel quadro;
		Janela janela;
		Reprodutor anima;
		GameInput input;
		PacMan pac;
		Labirinto lab;
		Pastilhas pastilhas;//teste
		
		int numImg = 5;
		int tempoDoTimer = 20;
		int alturaJanela = 765;
		int larguraJanela = 1300;
		int posicaoInicialDoPacManX = 100;
		int posicaoInicialDoPacManY = 100;
		
		String tituloDaJanela = "Pac-Man";
		
		input = new GameInput();
		lab = new Labirinto();
		pastilhas = new Pastilhas();
		pac = new PacMan(input, lab);
		quadro = new Painel(numImg, input, lab);
		janela = new Janela(quadro, tituloDaJanela, larguraJanela, alturaJanela);// 1280 x 720
		anima = new Reprodutor(tempoDoTimer, quadro, posicaoInicialDoPacManX, posicaoInicialDoPacManY, pac, pastilhas, input);

		janela.cfgJanela();
		quadro.addImagem(anima);
		quadro.addImagem(pastilhas);//teste
		
		
		
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
 * http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html
 * 
 * @author Everton
 *
 */