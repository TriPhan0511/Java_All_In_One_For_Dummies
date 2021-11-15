
/* Using Lambda Expressions */

/*
 * A lambda expression lets you create an anonymous class that implements a specific type
 * of interface called a functional interface - which has one and only one abstract method. 
 * 
 * You can use a lambda expression anywhere you can use a normal Java expression.
 * You'll use it most in assigment statements or as passed parameters. The only
 * restriction is that you can use a lambda expression only in a context that
 * requires an instance of a functional interface.
 */

/*
 * The general syntax for a lambda expression is this:
 * 	
 * 		(parameters) -> expression
 * 
 * or this:
 * 
 * 		(parameters) -> { statement; ... }
 * 
 * If you use an expression, a semicolon is not required. If you use one or more 
 * statements, the statements must be enclosed in curly braces and a semicolon is
 * required at the end of each statement.
 * 
 * Note also that if the functional interface that the lambda is based on returns
 * a value (not void), the value of expression in the first syntax is used as the
 * return value. In the second syntax, in which one or more statements are enclosed
 * in a block, you must use a return statement to return an appropriate value.
 * 
 * */

////Example 1:
//public class LambdaBall 
//{
//	public static void main(String[] args)
//	{
////		Ball b2 = () ->  System.out.println("You hit it again!"); 
//		Ball b2 = () -> { System.out.println("You hit it again!"); };
//		b2.hit();
//	}
//	
//	interface Ball
//	{
//		void hit();
//	}
//}

//Example 2:
public class LambdaBall 
{
	public static void main(String[] args)
	{
		Ball b = () -> 
		{
			int result = 100 + 1;
			return result;
		};
		System.out.println(b.hit());
	}
	
	interface Ball
	{
		int hit();
	}
}

























