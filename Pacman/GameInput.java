import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameInput
{
	private int dx;
	private int dy;
	private int x;
	private int y;

	public GameInput()
	{
		System.out.println("ESTOU AQUI 7!!!!!");
		this.x = 0;
		this.x = 0;
	}

	public int moveX()
	{
		//System.out.println("ESTOU AQUI 6!!!!!");
		x += dx;
		return x;
	}

	public int moveY()
	{
		//System.out.println("ESTOU AQUI!!!!! 5");
		y += dy;
		return x;
	}

}



class EscutadorDeTeclas implements KeyListener
{
	@Override
	public void keyTyped(KeyEvent e)
	{
		System.out.println("ESTOU AQUI 8!!!!!");
		myKeyEvt(e, "keyTyped");
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		System.out.println("ESTOU AQUI 9!!!!!");
		myKeyEvt(e, "keyReleased");
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println("ESTOU AQUI 10!!!!!");
		myKeyEvt(e, "keyPressed");
	}

	private void myKeyEvt(KeyEvent e, String text)
	{
		
		System.out.println("ESTOU AQUI 11!!!!!");
		int key = e.getKeyCode();
		System.out.println("TEST");

		if (key == KeyEvent.VK_KP_LEFT || key == KeyEvent.VK_LEFT)
		{
			System.out.println(text + " LEFT");
			// Call some function
		}
		else if (key == KeyEvent.VK_KP_RIGHT || key == KeyEvent.VK_RIGHT)
		{
			System.out.println(text + " RIGHT");
			// Call some function
		}
	}
}

