/* This sample demonstrates how to pass arguments by reference */

/*
 * When arguments are passed by reference it means that:
 * 
 * 		_ The actual memory location of the argument is passed to the called method
 * 			(the object or a copy of the object is not passed)
 * 
 * 		_ The called method can change the value of the argument passed to it.
 * 
 * 		_ Variables of reference types such as objects are passed to the methods
 * 			by reference.
 * 
 * 		_ There are two references of the same object namely, argument reference
 * 			variable and parameter reference variable.
 * 
 * */


public class AptechCallByReferenceSample 
{
	public static void main(String[] args) 
	{
//		Create a Person instance
		Person p = new Person("Alex");
		
//		Print out the name of p 
		System.out.println(p.getName()); // -> Alex		 
		
//		Calls the changeName method
		changeName(p);
		
//		Print out the name of p 
		System.out.println(p.getName()); // -> New name
		
	}
	
	/* Method: changeValue */
	static void changeName(Person p)
	{
		p.setName("New name");
	}
	
}

class Person
{
//	Instance variable
	private String name;
	
//	Constructor
	public Person(String name)
	{
		this.name = name;
	}
	
//	Getter / Setter
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}



































