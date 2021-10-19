
public class StringSample 
{
	public static void main(String[] args) 
	{
		/* 1. Declaring and initializing strings */
		
//		System.out.println(Person.name); // -> null
//		
//		Person p = new Person();
//		System.out.println(p.getCountry()); // -> null
//		
////		Calls the sayHello method
//		p.sayHello();
		
//		-------------------------------------------------------------------------
		
		/* 2. Combining strings (concatenation) */
		
//		String hello = "Hello, ";
//		String world = "World!";
//		String greeting = hello + world;
//		System.out.println(greeting); // -> Hello, Wordl!
		
//		-------------------------------------------------------------------------
		
		/* 3. Converting primitives to strings */
		
////		Java automatically converts primitive values to string values whenever
////		you use a primitive value in a concatenation.
//		int i = 2;
//		System.out.println("The value of i is " + i); // -> The value of i is 2
		
////		Be careful here:
//		int i = 2;
//		System.out.println(i + i + " equals 4."); // -> 4 equals 4.
		
////		You can explicitly convert a primitive value to a string by using the
////		toString method of the primitive type's wrapper class.
////		To convert the int variable x to a string, for example:
//		int x = 10;
//		String s = Integer.toString(x);
//		System.out.println(s); // -> 10
		
//		-------------------------------------------------------------------------
		
		/* 4. Converting strings to primitives */
		
		/*
		 * To convert a string to a primitive type, you use a parse method of the appropriate
		 * wrapper class.
		 * 
		 * Note that there is no parse method to convert a String to a Character.
		 * 
		 * */
		
//		int x = Integer.parseInt("10");
//		System.out.println(x + 5); // -> 15
//		
//		long x = Long.parseLong("10");
//		System.out.println(x + 5); // -> 15
		
//		short x = Short.parseShort("10");
//		System.out.println(x + 5); // -> 15
		
//		byte x = Byte.parseByte("10");
//		System.out.println(x + 5); // -> 15
		
//		double x =  Double.parseDouble("15.4");
//		System.out.println(x + 5); //- > 20.4
		
//		float x = Float.parseFloat("3.14");
//		System.out.println(x + 5); // -> 8.14
		
//		boolean x = Boolean.parseBoolean("1");
//		System.out.println(x); // -> false
//		
//		boolean y = Boolean.parseBoolean("true");
//		System.out.println(y); // -> true
	}

}

class Person
{
//	Declare a class variable (not initialzied yet)
	static String name;
	
//	Declare an instance variable (not initialzied yet)
	private String country;
	
//	Getter
	public String getCountry()
	{
		return this.country;
	}
	
//	Another method
	public void sayHello()
	{
//		Declare and initialize a local variable
		String message = "";
		System.out.println(message);
	}
}






























