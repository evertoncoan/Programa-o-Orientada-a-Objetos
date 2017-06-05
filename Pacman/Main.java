
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
		anima = new Reprodutor(7, quadro, 100, 100, pac);

		janela.cfgJanela();
		quadro.addImagem(anima);
	}
}


/**
 * https://stackoverflow.com/questions/27208846/addkeylistener-not-working
 * https://stackoverflow.com/questions/8961938/java-keylistener-not-registering-arrow-keys
 * https://gist.github.com/hanksudo/5626452
 * 
 * @author Everton
 *
 */