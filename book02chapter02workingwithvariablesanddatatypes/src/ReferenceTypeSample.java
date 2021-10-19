/*
 * A reference type is a type that's based on a class rather than on one of the 
 * primitive types that built into the Java language.
 * 
 * A reference type can be based on a class that's provided as part of the Java API 
 * class library or on a class thay you write yourself. Either way, when you create
 * an object from a class, Java allocates however much memory the object requires 
 * to store the object. Then, if you assign the object to a variable, the variable 
 * is actually assigned a reference to the object, not the object itself. This reference
 * is the address of the memory location where the object is stored. 
 * 
 * 
 * */

public class ReferenceTypeSample 
{
	public static void main(String[] args) 
	{
////		Declare a variable that can refer to a Ball object
////		Then, calls the Ball constructor to create a new Ball object,
////		and assigns a reference to the Ball object to the variable:
//		Ball b = new Ball(10);
		
////		One of the key concepts in working with reference type is the fact that a variable
////		of a particular type doesn't actually contain an object of that type. Instead, it 
////		constains a reference to an object of the correct type. An important side effect 
////		is that two variables can refer to the same object.
//		Ball b1 = new Ball(10);
//		Ball b2 = b1;
//		
////		Change the radius field via the b2 object
//		b2.setRadius(50);
//		
////		Because b1 and b2 refer to the same object, so if we get the radius field via b1,
////		we will get the new value of the radius field (50).
//		System.out.println(b1.getRadius()); // -> 50
		
//		------------------------------------------------------------------------------------
		
		/* Using inferred variable types */
		
//		Java 10 introduced a new feature called local variable type inference, which lets you
//		substitute the generic word var for the variable type whenever you declare and initialize
//		a local variable in the same sentence.

////		Example:
//		var x = 10;
//		System.out.println(x);
		
////		Another example:
//		var b3 = new Ball(30);
//		System.out.println(b3.getRadius());
		
		/*
		 * Here are few important details to note about local variable type inference:
		 * 
		 *  	_ When you use the var type, you must declare the variable and assign a value
		 *  		in the same statement. So, the following code will not compile:
		 *  			var b1; // Does not compile
		 *  			b1 = new Ball(100);
		 * 
		 * 		_ The var type can be used only for local variables. You must still explicitly
		 * 			state the type for class variables.
		 * 
		 * 		_ After you've created a var variable, you can't change its type. For example,
		 * 			the following will not compile:
		 * 				var x = 5;
		 * 				x = "Hello"; // Can't change the type
		 * 
		 * 		_ You can use var only for local variables. You can't use it for method parameter,
		 * 			method return types, or class fields.
		 * 
		 * */
		
	}
}

class Ball 
{
//	Instance variable
	private int radius;
	
//	Constructor
	public Ball(int radius) 
	{
		this.radius = radius;
	}
	
//	Getter / Setter
	public int getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
}
































