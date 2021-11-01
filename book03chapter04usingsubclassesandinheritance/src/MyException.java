
public class MyException 
{
	public static void main(String[] args)
	{
		try
		{
			doSomething(true);
		}
		catch(Exception e)
		{
			System.out.println("I catched that exception.");
		}
		
		System.out.println("Continue...");
	}
	
	private static void doSomething(boolean b)
		throws Exception
	{
		if (b)
		{
			throw new Exception();
		}
	}
}
