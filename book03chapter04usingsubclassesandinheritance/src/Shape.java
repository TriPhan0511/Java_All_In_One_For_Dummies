/* Casting Up and Down */

/*
 * An object of a derived type can be treated as though it were an object of its base type.
 * If the Reactangle class extends the Shape class, a Rectangle object can be treated as 
 * though it were a Shape object. This arrangement is called upcasting, and Java does it
 * automatically, so you don't have to code a casting operator.
 * Thus the following code is legal:
 * 			
 * 		Shape s = new Rectangle();
 * 
 * Here an object of type Rectangle is created. Then a reference to this object is assigned
 * to the variable s, whose type is Shape, not Rectangle.
 * 
 * */

/*
 * Now suppose that you have a method in the application named calcArea that's declared like this:
 * 
 * 		public void calcArea(Shape s)
 * 
 * In other words, this method accepts a Shape type as a parameter. When you call this method, you
 * can pass it either a Shape object or a Rectangle object, because Rectangle is a subclass of Shape.
 * So the following code works:
 * 
 * 		Rectangle r = new Rectangle();
 * 		calcArea(r);
 * 		Shape s =  new Shape();
 * 		calcArea(s);
 * 
 * */

/*
 * Automatic casting doesn't work the other way, however. Thus you can't use a Shape object where
 * a Rectangle object is called for. Suppose your program has a method declared like this:
 * 
 * 		public void calcPerimeter(Rectangle r)
 * 
 * The the following code does not compile:
 * 
 * 		Shape s = new Shape();
 * 		calcPerimeter(s); // error: won't compile
 * 
 * */

/*
 * You can explicitly cast the s variable to a Rectangle object, however, like this: 
 * 
 * 		Shape s = new Rectangle();
 * 		calcPerimeter((Rectangle) s);
 * 
 * Note that the second statement throws an exception of type ClassCastException if the
 * object referenced by the s variable isn't a Rectangle object. So the following code
 * won't work:
 * 
 * 		Shape s = new Triangle();
 * 		calcPerimeter(s); // error: s isn't a Rectangle object
 * 
 * */

//-------------------------------------------------------------------------------------------------

/*
 * What if you want to call a method that's defined by a subclass from an object
 * that's referenced by a variable of the superclass? Suppose that the Triangle
 * class has a method name showName that isn't defined by the Shape class. How can
 * you call it from a Shape variable? 
 * 
 * Java lets you cast the Shape object to a Triangle and call the showName method
 * in the same statement. All you need is an extra set of parentheses, like this:
 * 
 *  	Shape s = new Triangle();
 *  	((Triangle) s).showName();
 *  
 *  Here the expression ((Triangle) s) returns the object referenced by the s variable,
 *  cast as a Triangle. Then you can call any method of the Triangle class by using the
 *  dot operator. (This operator throws a ClassCastException if s is not a Triangle object.)
 * 
 * */


public class Shape 
{
	public void method1()
	{
		System.out.println("Hello from Shape class.");
	}
}

class Rectangle extends Shape
{
	public void method2()
	{
		System.out.println("Hello from Rectangle class.");
	}
}

class Triangle extends Shape 
{
	public void showName() 
	{
		System.out.println("Hello from showName method.");
	}
}

class Test
{
	public static void main(String[] args)
	{
//		Shape s = new Shape();
//		calcArea(s);
//		Rectangle r = new Rectangle();
//		calcArea(r); // Upcasting automatically
		
//		-----------------------------------------------------
		
//		Shape s =  new Shape();
////		calcPerimeter(s); // error: won't compile
		
//		-----------------------------------------------------
		
////		Shape s = new Rectangle();
////		calcPerimeter((Rectangle) s);
//		
//		Shape s = new Triangle();
//		calcPerimeter((Rectangle) s); // error: s2 isn't a Rectangle
		
//		-----------------------------------------------------
		
//		Shape s = new Triangle();
////		s.showName(); // error: won't compile
//		((Triangle) s).showName();
		
//		Shape s = new Rectangle();
//		((Triangle) s).showName(); // error: ClassCastException
		
//		Shape s = new Shape();
//		((Triangle) s).showName(); // error: ClassCastException
	}
	
//	A method that accepts a Shape object as a parameter
	public static void calcArea(Shape s)
	{
		System.out.println("This method calcaluate the area of a shape.");
	}
	
//	A method that accepts a Rectangle object as a parameter
	public static void calcPerimeter(Rectangle r)
	{
		System.out.println("This method calculate a perimeter of a rentangle.");
	}
}
























