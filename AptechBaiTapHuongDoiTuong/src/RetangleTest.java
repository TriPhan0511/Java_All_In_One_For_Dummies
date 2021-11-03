import java.util.*;

/* Exercise 01: Calculate a rectangle's area and perimeter */

public class RetangleTest 
{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Rectangle rec = getRectangle("\nEnter width and length:");
		displayRectangle(rec); // Print out this rectangle's information
		
//		--------------------------------------------------------------------------------------
		
////		Another way:
//		Rectangle rec = getRectangle2("\nEnter width and length:");
//		displayRectangle(rec); // Print out this rectangle's information
	}
	
//	displayRectangle method:
	private static void displayRectangle(Rectangle rec)
	{
		System.out.println("\n--------- Rectangle's Information ---------");
		System.out.printf("\nLength: %.2f\nWidth: %.2f\nArea: %.2f\nPerimeter: %.2f",
							rec.getLength(),
							rec.getWidth(),
							rec.calcArea(),
							rec.calcPerimeter());
	}
	
//	getRectangle method:
//	Use the default constructor to instantiate an object of Rectangle class.
//	Then use a Scanner object to get user's input.
//	Finnaly, use two setter methods (setLength and setWidth) to set the data 
//	for the newly created Rectangle object. 
	private static Rectangle getRectangle(String msg)
	{
		System.out.println(msg);
		Rectangle rec = new Rectangle();
		
//		Get length from user's input,
//		then set it for the rectangle.
		while (true)
		{
			try
			{
				System.out.print("Length ? ");
				rec.setLength(sc.nextDouble());
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("You should enter a number. Try again.");
			}
			catch(Exception e)
			{
				System.out.println("The length should be greater than 0. Try again.");
			}
			finally
			{
				sc.nextLine();
			}
		}
		
//		Get width from user's input,
//		then set it for the rectangle.		
		while (true)
		{
			try
			{
				System.out.print("Width ? ");
				rec.setWidth(sc.nextDouble());
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("You should enter a number. Try again.");
			}
			catch(Exception e)
			{
				System.out.println("The width should be greater than 0. Try again.");
			}
			finally 
			{
				sc.nextLine();
			}
		}	
		return rec;
	}

//	getRectangle2 method:
//	Use a Scanner object to get length and width from user's input.
//	Then use the constructor Rectangle(double length, double width) to instantiate an object of the Rectangle class.
	private static Rectangle getRectangle2(String msg)
	{
		Rectangle rec;
		while (true)
		{
			try
			{
				System.out.println(msg);
				System.out.print("\nLength ? ");
				double length = sc.nextDouble();
				System.out.print("Width ? ");
				double width = sc.nextDouble();
				rec = new Rectangle(length, width);
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("You should enter numbers for length and width. Try again.");
			}
			catch(Exception e)
			{
				System.out.println("The length and width should be greater than 0. Try again.");
			}
			finally 
			{
				sc.nextLine();
			}
		}
		return rec;
	}
}	


