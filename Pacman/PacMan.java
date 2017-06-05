import java.awt.Image;

public class PacMan
{
	GameInput input;
	
	public PacMan(GameInput input)
	{
		this.input = input;
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
	
	
}
