/*
 * A local variable is a variable that's declared within the body of a method. Then you can use
 * the variable only within that method. Other methods in the class aren't even aware that the variable exists.
 * 
 * */

public class LocalVariablesSample 
{
	public static void main(String[] args) 
	{
//		Declare a local variable
		String helloMessage = "Hello, world!";
		System.out.println(helloMessage);
	}

}
