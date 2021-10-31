/* Final Variables (Constants) */

/*
 * A final variable is a variable whose value can't change after it's been initialized.
 * To declare a final variable, you add the final keyword to the variable declaration, 
 * like this:
 * 			final int WEEKDAYS = 5;
 * 
 * 
 * A variable that is both final and static is called a constant. Constants are often used 
 * for values that are universally the same, such as the number of days in June or the atomic
 * weight of iridium. To create a constant, add static final (not final static) to the 
 * declaration, as follows:
 * 			static final WEEKDAYS = 5;
 * */


public class Circle 
{
	private static final double PI = 3.14; // A constant
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double calcArea()
	{
		return PI * this.radius;
	}

}

class CircleTest
{
	public static void main(String[] args)
	{
		Circle c = new Circle(10.0);
		System.out.printf("The area is %.2f", c.calcArea());
	}
}
