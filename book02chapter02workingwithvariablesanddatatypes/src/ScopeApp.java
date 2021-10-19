/*
 * The scope of a variable refers to which parts of a class the variable exists in.
 * In the simplest terms, every variable exists only within the block in which the variable
 * is declared, as well as any blocks that are contained within that block. That's why 
 * class variables, which are declared in the class body, can be accessed by any methods
 * defined by the class, but local variables defined within a method can be accessed only
 * by the method in which they are defined. 
 * 
 * */

/*
 * In Java, a block is marked by a matching pair of braces. Java has many kinds of blocks,
 * including class bodies, method bodies, and block statements that belong to staments such as
 * if or for statements. But in each case, a block marks the scope boundaries for the variables
 * declared within it. 
 * 
 * */

/*
 * Strictly speaking, the scope of a alocal variable begins when the variable is initialized
 * and ends when the block that contains the variable's declaration ends. By contrast, the scope
 * for a class or instance variable is entire class in which the variable is declared. That means
 * you can use a class or instance variable in a method that physically appears before the variable
 * is declared, but you can't use a local variable before it's declared.
 * 
 * */

/*
 * A program demonstrates scope for class and local variables.
 * 
 * Output:
 * 			main: x = 5
 * 			myMethod: z = 15
 * 			myMethod: x = 5
 * 			myMethod: y = 10
 * 
 * */

public class ScopeApp
{
//	Declare a class variable
	static int x;
	
//	main method
	public static void main(String[] args) 
	{
		x = 5;
		System.out.println("main: x = " + x); 
		
//		Call the myMethod method
		myMethod();
	}
	
//	another method
	public static void myMethod()
	{
//		Declare and initialize a local variable
		int y = 10;
		
		if (y == x + 5) 
		{
//			Declare a variable which belongs to the if statement
			int z = 15;
			System.out.println("myMethod: z = " + z);
		}
		System.out.println("myMethod: x = " + x);
		System.out.println("myMethod: y = " + y);
		
	}
}



































