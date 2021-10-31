/* This sample demonstrates upcasting and downcasting */

public class BallTest 
{
	public static void main(String[] args)
	{
		
		/*
		 * An object of a derived type can be treated as though is were an object of its base
		 * type. If the Baseball class extends the Ball class, for example, a Baseball object
		 * can be treated as though it were a Ball object. This arrangement is called upcasting,
		 * and Java does it automatically, so you don't have to code a casting operator.
		 * Thus the following code is legal:
		 * 
		 * */
		
//		Ball b = new BaseBall();
		
		/*
		 * Here an object of type BaseBall is created. Then a reference to this object is 
		 * assigned to the variable b, whose type is Ball, not Baseball.
		 * 
		 * */
		
		/*
		 * Now suppose that you have a method in a ball-game application named hit that's 
		 * declared like this:
		 * 
		 * 		public static void hit(Ball b)
		 * 
		 * In other words, this method accepts a Ball type as a parameter. When you call 
		 * this method, you can pass it either a Ball object or a Baseball object, because
		 * Baseball is a subclass of Ball. So the following code works:
		 * 
		 * */
		
//		BaseBall b1 = new BaseBall();
//		hit(b1);
//		Ball b2 = new Ball();
//		hit(b2);
		
		/*
		 * Automatic casting doesn't work the other way, however. Thus you can't use a
		 * Ball object where a BaseBall object is called. Suppose your program has a
		 * method declared like this:
		 * 
		 * 		public static void toss(BaseBall b)
		 * 
		 * Then the following code does not compile:
		 * 
		 * 		Ball b = new BaseBall();
		 *		toss(b); // error: won't compile
		 * 
		 * */

		/*
		 * You can explicitly cast the b variable to a BaseBall object, however, like this:
		 * 
		 * */
		
//		Ball b = new BaseBall();
//		toss((BaseBall) b);
		
		/*
		 * Note that the second statement throws an exception of type ClassCastException
		 * if the object referenced by the b variable isn't a BaseBall object. So the
		 * following code won't work:  
		 * 
		 * 		Ball b = new SoftBall();
		 * 		toss((BaseBall) b); // error: b isn't a BaseBal
		 * 
		 * */
		
		/*
		 * What of you want to call a method that's defined by a subclass from an object
		 * that's referenced by a variable of the superclass? Suppose that the SoftBall class
		 * has a method named riseBall that isn't defined by the Ball class. How can you call
		 * it from a Ball variable? One way to do that is to create a variable of the subclass
		 * and then use an assignment to cast the object:
		 * 
		 * */
		
//		Ball b =  new SoftBall();
//		SoftBall s = (SoftBall) b;
//		s.riseBall();
		
		/*
		 * But there's a better way: Java lets you cast the Ball object to a SoftBall and call
		 * the riseBall method in the same statement. All you need is an extra set of parentheses,
		 * like this: 
		 * 
		 * */
		
//		Ball b = new SoftBall();
//		((SoftBall) b).riseBall();
		
		/*
		 * Here the expression ((SoftBall) b) returns the object referenced by the b variable,
		 * cast as a SoftBall. Then you can call any method of the SoftBall class by using the
		 * dot operator. (This operator throws a ClassCastException if b is not a SoftBall object.)
		 * Thus the following code won't work:
		 * 
		 * 		Ball b = new BaseBall();
		 * 		((SoftBall) b).riseBall(); // error: won't compile
		 * 
		 * */
		
//		Ball b = new BaseBall();
//		((SoftBall) b).riseBall(); // error: won't compile
		
		/*
		 * As a general rule, you should declare method parameters with type as far up in
		 * the class hierarchy as possible. Rather than create separte toss methods that 
		 * accept BaseBall and SoftBall objects, for example, you can create a single toss
		 * method that accepts a Ball object. If necessary, the toss method can determine
		 * which type of Ball it's throwing by using the instanceof operator.
		 * 
		 * */
	}
	
	public static void hit(Ball b)
	{
		System.out.println("Hello from the hit method.");
	}
	
	public static void toss(BaseBall b)
	{
		System.out.println("Hello from the toss method.");
	}
}

class Ball {}

class BaseBall extends Ball {}

class SoftBall extends Ball 
{
	public void riseBall()
	{
		System.out.println("Hello from the riseBall method.");
	}
}

//----------------------------------------------------------------------------------------------------------


///* Example (Do as general rule) */
//public class BallTest
//{
//	public static void main(String[] args) 
//	{
//		BaseBall b1 = new BaseBall();
//		toss(b1);
//		
//		SoftBall b2 = new SoftBall();
//		toss(b2);
//	}
//	
//	public static void toss(Ball b)
//	{
//		System.out.println("Hello from the toss method.");
//	}
//}
//
//class Ball {}
//class BaseBall extends Ball {}
//class SoftBall extends Ball {}


























