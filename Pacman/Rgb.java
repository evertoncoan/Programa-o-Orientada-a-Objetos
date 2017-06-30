
public class Rgb
{
	int cor;
	private boolean executar;
	
	
	public Rgb()
	{
		executar = true;
		thread.start();
	}
	
	Thread thread = new Thread()
	{
	    public void run()
	    {
	    	while (executar)
	    	{
	    		try { Thread.sleep(100); } catch ( InterruptedException e ) { e.printStackTrace(); }
	    		
	    		System.out.println("oi");
	    	}
	    }
	};
}
