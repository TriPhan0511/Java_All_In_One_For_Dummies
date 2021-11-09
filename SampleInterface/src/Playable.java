
/* Using Additional Interface Method Types */

public interface Playable 
{
//	An abstract method
	void start();
	
//	1. A default method
	default void sayHello()
	{
		System.out.println("Hello from Playable interface.");
	}
	
//	Another default method
	public default void sayFrench()
	{
		System.out.println("I am a default method and i am calling a private method");
//		Calls the private method named sayBonjour
		sayBonjour();
		
	}
	
//	2. A static method
//	static methods: Like static methods for class, provide methods are invoked
//	apart from an instance of a class implementing the interface.
//	Static methods cannot be overridden.
	public static void intro()
	{
		System.out.println("I'm the Playable interface.");
	}
	
//	Another static method
	public static void go()
	{
		System.out.println("I am a static method in the Playable interface, "
				+ "\nand i am calling a private static method");
//		Calls the private static method named sayGoodBye
		sayGoodbye();
	}
	
//	3. A private method
//	A private method can be called only by default methods 
//	or other private interface methods.	
//	A private method cannot be overridden or accessed by an implementing class.
	private void sayBonjour()
	{
		System.out.println("Bonjour from a private method of Playable interface.");
	}
	
//	4. A private static method
//	Private static methods similar to private methods but are static and
//	can be called only by static interface methods or other private static 
//	interface methods.
//	A private static method cannot be overridden or accessed by an implementing class.
	private static void sayGoodbye()
	{
		System.out.println("Goodbye from a private static method of an interface.");
	}
}






















