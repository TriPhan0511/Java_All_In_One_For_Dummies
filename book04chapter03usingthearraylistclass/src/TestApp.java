import java.util.ArrayList;
import java.util.Iterator;

public class TestApp 
{
	public static void main(String[] args)
	{
////		Create an array list
//		ArrayList signs = new ArrayList();
		
//		Create an array list that holds String objects
//		ArrayList<String> signs = new ArrayList<String>();
		
//		Create an array list (shortcut)
//		ArrayList<String> signs = new ArrayList<>();
		
		/* Adding Elements */
//		signs.add("Drink Pepsi");
//		signs.add("No minors allowed");
//		signs.add("Say Pepsi, please");
//		signs.add("7-Up: You Like It, It Likes You");
//		signs.add("Dr. Pepper 10, 2, 4");
//		signs.add(0, "Coca cola");
		
		/* Accessing Elements */
		
////		Way 1:
//		for (int i = 0; i < signs.size(); i++)
//		{
//			System.out.println(signs.get(i));
//		}
		
////		Way 2:
//		for (String s : signs)
//		{
//			System.out.println(s);
//		}
		
////		If you need to know the index number of a particular object in an array list,
////		and you have a reference to the object, you can use the indexOf method.
//		for (String s : signs)
//		{
//			int i = signs.indexOf(s);
//			System.out.printf("Item %d: %s\n", i, s);
//		}
		
		/* Printing an ArrayList: Use the toString method */
//		System.out.println(signs.toString());
		
//		------------------------------------------------------------------------------------------------
		
		/*
		 * Using an Iterator
		 * 
		 * Another way to access all the elements in an array list (or any other collection type)
		 * is to use an iterator. An iterator is a special type of object whose sole purpose in
		 * life is to let you step through the elements of a collection.  
		 */
		
		/*
		 * An iterator object implements the Iterator interface, which is defined as part of the
		 * java.util package. As a result, to use an iterator, you must import either 
		 * java.util.Iterator or java.util.*. The Iterator interface defines just three methods.
		 * These methods are all you need to access each element of a collection. (Actually, you
		 * usually need just the hasNext and next methods. The remove method is gravy.)
		 */
		
		/*
		 * The Iterator Interface
		 * 
		 * 		hasNext()		Returns true if the collection has at least one element that hasn't yet been retrieved
		 * 
		 * 		next()			Returns the next element in the collection.
		 * 
		 * 		remove()		Removes the most recently retrieved element.
		 */
		
		/*
		 * The Iterator pattern relies on interfaces so that the code that's using the iterator doesn't
		 * have to know what actual class is being iterated. As long as the class implements the iterator
		 * interface, it can be iterated.
		 * 
		 * In addition to the Iterator interface, the collection class iself needs a way to get an
		 * iterator object. It does so via the iterator method, which simply returns an iterator object
		 * for the collection. The iterator method is defined by the Iterable interface. Thus, any object
		 * that implements Iterable interface has an iterator method that provides am iterator for the object.
		 */
		
		/*
		 * To use an iterator, you first call the array list's iterator method to get the iterator. Then you
		 * use the iterator's hasNext and next methods to retrieve each item in the collection. The normal way
		 * to do that is with a while loop. Here's an example:
		 */
		
//		ArrayList<String> nums = new ArrayList<>();
//		nums.add("One");
//		nums.add("Two");
//		nums.add("Three");
//		nums.add("Four");
//		
//		String s;
//		Iterator<String> e = nums.iterator();
//		while (e.hasNext())
//		{
//			s = e.next();
//			System.out.println(s);
//		}
		
//		------------------------------------------------------------------------------------------------
		
		/* Updating Elements */
		
////		Example 1: Use the set method
//		ArrayList<String> nums = new ArrayList<>();
//		nums.add("One");
//		nums.add("Two");
//		nums.add("Three");
//		displayAList(nums); // -> One Two Three 
//		System.out.println();
//		
////		Update nums array list
//		nums.set(0, "Uno");
//		nums.set(1, "Dos");
//		nums.set(2, "Tres");
//		displayAList(nums); // -> Uno Dos Tres
		
//		Example 2:
		/*
		 * Because array lists contain references to objects, not the objects themselves, any changes
		 * you make to an object in an array list are automatically reflected in the list. As a result,
		 * you don't often have to use the set method.
		 * 
		 */
		
//		ArrayList<Employee> emps = new ArrayList<Employee>();
//		emps.add(new Employee("Alex", "Ferguson"));
//		emps.add(new Employee("Brad", "Pitt"));
//		emps.add(new Employee("Chris", "Sutton"));
//		System.out.println(emps); // -> [Alex Ferguson, Brad Pitt, Chris Sutton]
//		
////		Update the second employee in the list
//		Employee e = emps.get(1);
//		e.changeName("Zed Yoon"); // -> [Alex Ferguson, Zed Yoon, Chris Sutton]
		
		/*
		 * Notice that the second employee's name was changed, even though the program
		 * doesn't use the set method to replace the changed Employee object in the collection.
		 * That's because the array list merely stores references to the Employee objects.
		 */
		
//		------------------------------------------------------------------------------------------------
		
		/* Deleting Elements */
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Alex", "Ferguson"));
		emps.add(new Employee("Brad", "Pitt"));
		emps.add(new Employee("Chris", "Sutton"));
		System.out.println(emps); // -> [Alex Ferguson, Brad Pitt, Chris Sutton]
		System.out.println(emps.size()); // -> 3
				
		
////		1. To remove all the elements, use the clear method
//		emps.clear();
//		System.out.println(emps); // -> [] 
//		System.out.println(emps.size()); // -> 0
		
////		2. To remove a specific elemene, use the remove method:
//		emps.remove(1);
//		System.out.println(emps); // -> [Alex Ferguson, Chris Sutton]
//		System.out.println(emps.size()); // -> 2
		
//		3. Alternatively, you can pass the actual object you want to remove. This is useful
//		if you don't know the index of the object you want to remove, but you happen to have
//		a reference to the actual object, as in this example:
		Employee hillary = new Employee("Hillary", "Duff");
		emps.add(1, hillary);
		System.out.println(emps); // -> [Alex Ferguson, Hillary Duff, Brad Pitt, Chris Sutton]
		System.out.println(emps.size()); // -> 4
//		Remove hillary
		emps.remove(hillary);
		System.out.println(emps); // -> [Alex Ferguson, Brad Pitt, Chris Sutton]
		System.out.println(emps.size()); // -> 3
		
		
	}
	
	private static void displayAList(ArrayList<String> list)
	{
		Iterator<String> e = list.iterator();
		while (e.hasNext())
		{
			System.out.printf("%s ", e.next());
		}
	}
}

class Employee
{
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void changeName(String fullName)
	{
		int spacePosition = fullName.indexOf(" ");
		String firstName = fullName.substring(0, spacePosition);
		String lastName = fullName.substring(spacePosition + 1);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString()
	{
		return this.firstName + " " + this.lastName;
	}
}



























