/* This sample demonstrate the technique called late binding. */

public class VehicleTest 
{
	public static void main(String[] args)
	{
		sayHello(new Vehicle());
//		-> Hello from Vehicle class.
		
		sayHello(new Car());
//		-> Hello from Car class.
		
		sayHello(new Bicycle());
//		-> Hello from Bicycle class.
	}
	
	private static void sayHello(Vehicle v)
	{
		System.out.println(v.greeting());
	}
}

class Vehicle 
{
	public String greeting()
	{
		return "Hello from Vehicle class.";
	}
}

class Car extends Vehicle 
{
//	Override the method  greeting
	public String greeting()
	{
		return "Hello from Car class.";
	}
}

class Bicycle extends Vehicle 
{
//	Override the method  greeting
	public String greeting()
	{
		return "Hello from Bicycle class.";
	}
}