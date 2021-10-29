
public class Ball 
{
//	A static field
	private static int ballCount;
	
//	An instance field
	private String name;
	
//	Constructor
	public Ball(String name)
	{
		this.name = name;
		ballCount++;
	}
	
	public static int getCount()
	{
		return ballCount;
	}
}
