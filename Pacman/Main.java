
public class Main
{
	public static void main(String[] args)
	{
		Painel quadro;
		Janela janela;
		Reprodutor anima;
		GameInput input;
		
		input = new GameInput();
		quadro = new Painel(5, input);
		janela = new Janela(quadro, 1280, 720);
		anima = new Reprodutor(7, quadro, 100, 100, input);

		janela.cfgJanela();
		quadro.addImagem(anima);
	}
}
