import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class PacMan
{
	 private Image pmImage;
	
	GameInput input;
	URL urlForImage;
    ImageIcon usFlag;
	
	public PacMan(GameInput input)
	{
		this.input = input;
		carregarImagem("C");
	}
	
	public int moverX(int x)
	{
		if (input.key_right && x < 1214)
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
		if (input.key_down && y < 630)
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
		urlForImage = getClass().getResource("./images/" + img + ".gif");
        usFlag = new ImageIcon(urlForImage);
        pmImage = usFlag.getImage();
	}
	
	public Image pacMan()
	{
		if (input.key_right) 
		{
			carregarImagem("R");
			return pmImage;
		}
		
		if (input.key_left) 
		{
			carregarImagem("L");
			return pmImage;
		}
		
		if (input.key_down) 
		{
			carregarImagem("D");
			return pmImage;
		}
		
		if (input.key_up) 
		{
			carregarImagem("U");
			return pmImage;
		}
		
		return pmImage;
	}
}
