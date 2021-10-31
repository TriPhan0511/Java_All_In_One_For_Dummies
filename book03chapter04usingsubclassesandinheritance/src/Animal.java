/* Understanding Inheritance and Constructors */

/*
 * When you create an instance of a subclass, Java automatically calls the default constructor
 * of the base class before it executes the subclass constructor. Consider the following classes:
 * 
 * */

//public class Animal 
//{
//	public Animal()
//	{
//		System.out.println("Hello from the Animal constructor.");
//	}
//}
//
//class Fish extends Animal
//{
//	public Fish()
//	{
//		System.out.println("Hello from the Fish constructor.");
//	}
//}
//
//class FishTest
//{
//	public static void main(String[] args)
//	{
//		Fish f = new Fish();
////		-> Hello from the Animal constructor.
////		-> Hello from the Fish constructor.
//	}
//}

//---------------------------------------------------------------------------------------------------

/*
 * If you want, you can explicitly call a base class constructor from a subclass
 * by using the super keyword. Because Java automatically calls the default constructor
 * for you, the only reason to do this is to call a constructor of the base class
 * that uses a parameter. Here's the version of the Animal and Fish classes in which 
 * the Fish constructor calls a Animal constructor that uses a parameter:
 * 
 * */

/*
 * You need to obey a few rules and regulations when working with superclass constructors:
 * 
 * 		_ If you use the super keyword to call the superclass constructor, you must do so
 * 			in very first statement in the constructor.
 * 
 * 		_ If you don't explicitly call super, the compiler insert a call to the default 
 * 			constructor of the base class. In that case, the base class must have a default
 * 			constructror. If the base class doesn't have a default constructor, the compiler 
 * 			refuses to compile the program.
 * 
 * 		_ If the superclass is itself a subclass, the constructor for its superclass is called
 * 			in the same way. This continues all the way up the inheritance hierarchy until you
 * 			get to the Object class, which has no super class.
 * 
 * 
 * */

//public class Animal
//{
//	private String name;
//	
//	public Animal(String name)
//	{
//		this.name = name;
//	}
//	
//	public String getName()
//	{
//		return this.name;
//	}
//}
//
//class Fish extends Animal
//{
//	private String movement;
//	
//	public Fish(String name, String movement)
//	{
//		super(name); // Use the super keyword to call the constructor from base class.
//		this.movement = movement;
//	}
//	
//	public String toString()
//	{
//		return getName() + " " + this.movement; 
//	}
//}
//
//class FishTest
//{
//	public static void main(String[] args)
//	{
//		Fish shark = new Fish("Shark", "swim");
//		System.out.println(shark);
////		-> Shark swim
//	}
//}

//---------------------------------------------------------------------------------------------------

























