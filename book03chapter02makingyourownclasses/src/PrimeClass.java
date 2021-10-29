import java.util.Scanner;

/*
 * This sample demonstrates the initializer.
 * 
 * An initializer (also called an initializer block) is a lonely block of code that's
 * placed outside any method, constructor, or other block of code. Initializers are executed
 * whenever an instance of a class is created, regardless of which constructor is used to 
 * create the instance.
 * 
 * */

/*
 * Here are a few other tidbits of information concerning initializers:
 * 
 * 		_ If a class contains more than one initializer, the initializers are executed in the 
 * 			order in which they appear in the program.
 * 
 * 		_ Initializers are executed before any class constructor.
 * 
 * 		_ A special kind of initializer block called a static initializer lets you initialize 
 * 			static fields. 
 * 
 * */

public class PrimeClass 
{
	private Scanner sc = new Scanner(System.in);
	public int x;
	
//	Initializer
//	Gets the value for the class field named i from the user when the class is initialized
	{
		System.out.print("Enter the starting value for x: ");
		x = sc.nextInt(); 
	}
	
//	-----------------------------------------------------------------------------------
	
////	Another solution:
//	private Scanner sc = new Scanner(System.in);
//	public int x = getX();
//	
//	private int getX()
//	{
//		System.out.print("Enter a starting value for x: ");
//		return sc.nextInt();
//	}
//	
//	-----------------------------------------------------------------------------------

////	Another solution
//	private Scanner sc = new Scanner(System.in);
//	public int x;
//	
//	public PrimeClass()
//	{
//		System.out.print("Enter a starting value for x: ");
//		x = sc.nextInt();
//	}
}

































