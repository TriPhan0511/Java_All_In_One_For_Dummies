import java.util.Scanner;

/* Exercise 01: Calculate a rectangle's area and perimeter */

// A class consists of a main method for testing.
public class RetangleTest 
{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
////		Way 1: 
//		Rectangle rec = getRectangle();
//		
////		Print out this rectangle's area and perimeter
//		System.out.printf("Area = %.2f", rec.calcArea());
//		System.out.printf("\nPerimeter = %.2f", rec.calcPerimeter());
		
//		--------------------------------------------------------------------------------------
		
//		Way 2:
		Rectangle rec = getRectangle2();
		
//		Print out this rectangle's area and perimeter
		System.out.printf("Area = %.2f", rec.calcArea());
		System.out.printf("\nPerimeter = %.2f", rec.calcPerimeter());		
	}
	
//	getRectangle method:
//	Use the constructor Rectangle() to instantiate an object of Rectangle class.
//	Then use a Scanner object to get user's input.
//	Finnaly, use two setter methods (setLength and setWidth) to set the data for the newly created Rectangle object. 
	private static Rectangle getRectangle()
	{
//		Instantiates an object of Rectangle class 
//		and assign the reference to that object to the rec variable.
		Rectangle rec = new Rectangle();
		
//		Get length and width from user's input,
//		then set length and width for the rectangle.
		while (true)
		{
			try
			{
				System.out.print("Enter the length: ");
				rec.setLength(sc.nextDouble());
				break;
			}
			catch(Exception e)
			{
				sc.nextLine();
				System.out.println("Invalid length. The length should be greater than 0.");
				continue;
			}
		}
		
		while (true)
		{
			try
			{
				System.out.print("Enter the width: ");
				rec.setWidth(sc.nextDouble());
				break;
			}
			catch(Exception e)
			{
				sc.nextLine();
				System.out.println("Invalid width. The width should be greater than 0.");
				continue;
			}
		}	
		return rec;
	}

//	getRectangle2 method:
//	Use a Scanner object to get length and width from user's input.
//	Then use the constructor Rectangle(double length, double width) to instantiate an object of the Rectangle class.
	private static Rectangle getRectangle2()
	{
		Rectangle rec;
		while (true)
		{
			try
			{
				System.out.print("Enter the length: ");
				double length = sc.nextDouble();
				System.out.print("Enter the width: ");
				double width = sc.nextDouble();
				rec = new Rectangle(length, width);
				break;
			}
			catch(Exception e)
			{
				sc.nextLine();
				System.out.println("Invalid data.\n"
						+ "Length and width should be numbers and are greater than 0.");
				continue;
			}
		}
		return rec;
	}
}	


