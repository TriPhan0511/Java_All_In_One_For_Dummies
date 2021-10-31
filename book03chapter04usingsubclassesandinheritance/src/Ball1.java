/* This sample demonstrates how to use this and super in subclasses

/* 1. The this keyword provides a way to refer to the current object instance. */

//public class Ball 
//{
//	private int velocity;
//	public Ball(int velocity)
//	{
//		this.velocity = velocity;
//	}
//}

//-----------------------------------------------------------------------------------------

/* 
 * 2. But what if you need to refer to a field or a method that belongs to a base class?
 * 		To do that, you use the super keyword. It works similar to the this but refers to
 * 		the instance of the base class rather than the instance of the current class.
 * 
 *  */

public class Ball1
{
	public void hit()
	{
		System.out.println("You hit me a mile!");
	}
}

class BaseBall1 extends Ball1
{
	public void hit()
	{
		System.out.println("You tore the cover off!");
		super.hit();
	}
}

class BaseBallTest
{
	public static void main(String[] args)
	{
		BaseBall1 bb = new BaseBall1();
		bb.hit();
//		-> You tore the cover off!
//		-> You hit me a mile!
	}
}






































