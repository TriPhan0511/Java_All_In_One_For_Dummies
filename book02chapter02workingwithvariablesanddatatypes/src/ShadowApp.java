/*
 * A shadowed variable is a variable that would otherwise be accessible but is temporarily
 * made unavailable because a variable with the same name has been declared in a more 
 * immediate scope.
 * 
 * For example, a class variable named x is declared. Then, in the main method, a local variable
 * with the same name is declared.
 * 
 * */

/* This program demonstrates shadowing variable */

/*
 * Output:
 * 			x = 5
 * 			x = 10
 * 			ShadowApp.x = 5	
 * 
 * */

public class ShadowApp 
{
//	Declare a class variable
	static int x;
	
	public static void main(String[] args)
	{
		x = 5;
		System.out.println("x = " + x); // -> x = 5
		
//		Declare and initialize a local variable which has the same name with the class variable
		int x = 10;
		System.out.println("x = " + x); // -> x = 10
		
		System.out.println("ShadowApp.x = " + ShadowApp.x); // -> ShadowApp.x = 5
	}
}


