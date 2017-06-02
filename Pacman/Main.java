
public class Main
{
	public static void main(String[] args)
	{
		Painel quadro;
		Janela janela;
		Reprodutor anima;
		
		quadro = new Painel(5);
		janela = new Janela(quadro, 1280, 720);
		anima = new Reprodutor(20, quadro, 100, 100);

		
		janela.cfgJanela();
		quadro.addImagem(anima);
		
	}
	
	
}
