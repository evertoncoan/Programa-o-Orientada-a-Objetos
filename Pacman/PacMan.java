import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class PacMan
{
	private Image imagem;
	
	GameInput input;
	URL urlParaImagem;
    ImageIcon imagemIcone;
	
	public PacMan(GameInput input)
	{
		this.input = input;
		carregarImagem("C");
	}
	
	public int moverX(int x)
	{
		if (input.key_right && x < 1216)
		{
			x = x + 5;
			return x;
		}

		if (input.key_left && x > 0)
		{
			x = x - 5;
			return x;
		}
		
		return x;
	}
	
	public int moverY(int y)
	{
		if (input.key_down && y < 656)
		{
			y = y + 5;
			return y;
		}

		if (input.key_up && y > 0)
		{
			y = y - 5;
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
