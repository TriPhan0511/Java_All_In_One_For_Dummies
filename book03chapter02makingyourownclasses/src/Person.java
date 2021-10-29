
/*
 * This sample introduces a new type of class called a record (Java 14).
 * 
 * A record is designed to simplify the task of creating class that consist of nothing
 * more than a collection of data fields that - and here's the important part - 
 * cannot be changed after the record is created.
 * 
 * (The Java term for an object that can't be changed after it has been created is immutable.)
 * 
 * */

/*
 * You could create a class that implements this behavior using a traditional Java class as follows:
 * 
 * Here, the Person class has two private fields named firstName and lastName, a constructor accepts
 * String arguments to initialize the private fields, and getter methods that retrieve the first and
 * last name values. When a Person object has been created from this class, the class provides no
 * mechanism for changing the first or last name values.
 * 
 * */

//public final class Person 
//{
//	private final String firstName;
//	private final String lastName;
//	
//	public Person(String f, String l)
//	{
//		firstName = f;
//		lastName = l;
//	}
//	
//	public String firstName()
//	{
//		return firstName;
//	}
//	
//	public String lastName()
//	{
//		return lastName;
//	}
//}

//--------------------------------------------------------------------------------------------------

//Another solution: Using record 

/*
 * With the new record feature, you could replace the entire Person class with the following
 * single line of code:
 * 
 * 		public record Person(String firstName, String lastName) {}
 * 
 * Here are the notable details you need to remember about creating records:
 * 
 * 		_ You specify the data components of the record in parentheses following the record name.
 * 			In this example, there are two data components, firstName and lastName.
 * 
 * 		_ Java automatically creates private class fields for each the data components.
 * 
 * 		_ Java automatically creates public getter methods for each of the data components,
 * 			using the names you provide. (You can, if you wish, provide additional methods.)
 * 
 * 		_ Java automatically creates a constructor that accepts the data component values as
 * 			arguments, in the order in which you list them when you define the record. (You 
 * 			can, if you wish, create additional constructors or override the default constructor
 * 			to provide features such as data validation.)
 * 
 * */

public record Person(String firstName, String lastName) {}

//public record Person(String firstName, String lastName) 
//{
//	public String intro()
//	{
//		return "My name's " + firstName + " " + lastName + ".";
//	}
//}



































