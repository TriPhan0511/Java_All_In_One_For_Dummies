
public class SingletonClassTest 
{
	public static void main(String[] args) 
	{
		/*
		 * Here's a bit of code that calls the getInstance method twice and then
		 * compares the resulting objects.
		 * 
		 * */
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		
		if (s1 == s2)
		{
			System.out.println("The objects are the same.");
		}
		else
		{
			System.out.println("The objects are not the same.");
		}
//		-> The objects are the same.
		
		/*
		 * When this code run, the first call to getInstance creates a new instance of the
		 * SingletonClass class. The second call to getInstance simply returns a reference 
		 * to the instance that was created in the first call. As a result, the comparison 
		 * in the if statement is true, and the first message is printed to the console. 
		 * 
		 * */
	}
}




























