
public class TestApp 
{
	public static void main(String[] args)
	{
		
		Soccer s = new Soccer();
		
//		Test an abstract method of an interface
		s.start();
//		-> Let's begin the game!
		
//		Test a default method of an interface
		s.sayHello();
//		-> Hello from Playable interface.
		
//		Test a static method of an interface
		Playable.intro();
//		-> I'm the Playable interface.
		
//		Test a private method of an interface
//		A private method can be called only by default methods 
//		or other private interface methods.
		s.sayFrench();
//		-> I am a default method and i am calling a private method
//		-> Bonjour from a private method of Playable interface.
		
//		Test a private static method of an interface
//		Private static methods similar to private methods but are static and
//		can be called only by static interface methods or other private static 
//		interface methods.
		Playable.go();
	}
}
