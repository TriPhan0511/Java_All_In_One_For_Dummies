
/*
 * An instance variable is similar to a class variable but doesn't specify the word static
 * in its declaration. As the name suggests, instance variables are associated with instances
 * of classes. As a result, you can use them only when you create an instance of the class.
 * Because static methods aren't associated with an instance of the class, you can't use an
 * instance variable in a static method - and that includes the main method.
 * 
 * */

public class InstanceVariablesSample 
{
//	Declare an instance variable
	String helloMessage;

	public static void main(String[] args) 
	{
//		helloMessage = "Hello, world!"; // error
	}

}
