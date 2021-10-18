
/*
 * A class variable is a variable that any method in a class can access, including static methods
 * such as main. When declaring a class variable, you have two basic rules to follow:
 * 
 * 		_ You must place the declaration within the body of the class but not within any of the
 * 			class methods.
 * 
 * 		_ You must include the word static in the declaration. The word static comes before the
 * 			variable type.
 * 
 * */

/*
 * Class variables are often called static variables. The key distinction between a static variable
 * and an instance, is that the value of a static variable is the same for all instances of the class.
 * In contrast, each instance of a class has distinct values for its instance variables.
 * 
 * */

public class ClassVariablesSample 
{
//	Declare a static variable (also called class variable)
	static String helloMessage;
	
	public static void main(String[] args) 
	{
//		Set a value of "Hello, world!" for the helloMessage static variables.
		helloMessage = "Hello, world!";

		System.out.println(helloMessage);
//		-> Hello, world!
	}
}



















