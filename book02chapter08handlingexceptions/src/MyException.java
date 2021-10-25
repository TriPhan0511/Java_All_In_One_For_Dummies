/* Throwing Your Own Exceptions */

public class MyException 
{
	public static void main(String[] args)
	{
		try
		{
			doSomething(true);
		}
		catch (Exception e)
		{
			System.out.println("Exception!");
		}
	}
	
	public static void doSomething(boolean t)
		throws Exception
	{
		if (t)
		{
			throw new Exception();
		}
	}
}
