
/*
 * This sample demonstrates about the anonymous inner classes
 * (usually just called anonymous classes.)
 * */

/*
 * Creating an anonymous class:
 * 
 * 		new ClassOrInterface() { class-body }
 * 
 * */

/*
 * Here are some thing to ponder when you work with anonymous classes:
 * 
 * 	1. You can't create a constructor for an anonymous class, because the 
 * 		anonynous class doesn't have a name. What could you call the constructor, anyway?
 * 
 * 	2. You can't pass parameters if the anonynous class is based on an interface.
 * 		That makes sense; intefaces don't have constructors, so Java wouldn't 
 * 		have anything to pass the parameters to.
 * 
 * 	3. An assigment statement can use an anonymous class as shown in this example.
 * 		In that case, the anonymous class body is followed by a semicolon that
 * 		marks the end of the assigment statement. Note that this semicolon is
 * 		part of the assigment statement, not the anonymous class
 * 
 * 	4. Anonymous class is a special type of inner classk like any inner class, it
 * 		automatically has access to the fields and methods of its outer class.
 * 
 * 	5. An anonymous class can't be static.
 */

public class AnonClass 
{
	public static void main(String[] args)
	{
		Ball b = new Ball()
		{
			public void hit()
			{
				System.out.println("You hit it!");
			}
		};
		b.hit();
	}
	
	interface Ball
	{
		public void hit();
	}
}






























