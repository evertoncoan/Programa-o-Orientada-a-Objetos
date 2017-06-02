import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameInput implements KeyListener
{
	boolean key_right, key_left, key_down, key_up;
	
	public void keyTyped(KeyEvent e){}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == e.VK_DOWN)
		{
			key_down = false;
		}
		if (e.getKeyCode() == e.VK_UP)
		{
			key_up = false;
		}
		if (e.getKeyCode() == e.VK_RIGHT)
		{
			key_right = false;
		}
		if (e.getKeyCode() == e.VK_LEFT)
		{
			key_left = false;
		}
	}

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == e.VK_DOWN)
		{
			key_down = true;
		}
		if (e.getKeyCode() == e.VK_UP)
		{
			key_up = true;
		}
		if (e.getKeyCode() == e.VK_RIGHT)
		{
			key_right = true;
		}
		if (e.getKeyCode() == e.VK_LEFT)
		{
			key_left = true;
		}
	}
}