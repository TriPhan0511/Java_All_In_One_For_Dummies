import java.util.InputMismatchException;

public class TestApp 
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 0;
		
		try
		{
			int c = a / b;
		}
		catch (Exception e)
		{
			System.out.println("Cannot divide by zero.");
		}
		
	}
}






























