import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class PacMan
{
	private Image imagem;
	
	private GameInput input;
	private URL urlParaImagem;
    private ImageIcon imagemIcone;
    private int varia;
    
    private Labirinto lab;
	
	public PacMan(GameInput input, Labirinto lab)
	{
		this.input = input;
		carregarImagem("C");
		this.lab = lab;
		varia = 5;
	}
	
	public int moverX(int x, int y)
	{
		if (input.key_right && lab.azul(x + 71, y))// teste
		{
			x = x + varia;
			return x;
		}

		if (input.key_left && lab.rgb(x - varia, y) != 269)
		{
			x = x - varia;
			return x;
		}
		
		return x;
	}
	
	public int moverY(int y, int x)
	{
		if (input.key_down && lab.rgb(x, y + 71) != 269)
		{
			y = y + varia;
			return y;
		}

		if (input.key_up && lab.rgb(x, y - varia) != 269)
		{
			y = y - varia;
			return y;
		}
		
		return y;
	}
	
	public void carregarImagem(String img)
	{
		urlParaImagem = getClass().getResource("./images/" + img + ".gif");
        imagemIcone = new ImageIcon(urlParaImagem);
        imagem = imagemIcone.getImage();
	}
	
	public Image pacMan()
	{
		if (input.key_right) 
		{
			carregarImagem("R");
			return imagem;
		}
		
		if (input.key_left) 
		{
			carregarImagem("L");
			return imagem;
		}
		
		if (input.key_down) 
		{
			carregarImagem("D");
			return imagem;
		}
		
		if (input.key_up) 
		{
			carregarImagem("U");
			return imagem;
		}
		
		return imagem;
	}
}
