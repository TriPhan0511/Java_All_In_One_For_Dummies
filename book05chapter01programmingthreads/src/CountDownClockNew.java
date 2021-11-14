
public class CountDownClockNew implements Runnable 
{
	private int t;
	
	public CountDownClockNew(int t)
	{
		this.t = t;
	}
	
	@Override
	public void run()
	{
		System.out.println("T minus " + t);
	}
}
