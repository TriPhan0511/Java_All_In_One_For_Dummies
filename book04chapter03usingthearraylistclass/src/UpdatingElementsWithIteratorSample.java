import java.util.*;

public class UpdatingElementsWithIteratorSample 
{
	public static void main(String[] args)
	{
		ArrayList<Person> people = new ArrayList<Person>();
		String[] names = new String[] {"Alex", "chris", "Brad", "Chris"};
		for (String name : names)
		{
			people.add(new Person(name));
		}
		System.out.println(people); // -> [Alex, chris, Brad, Chris]
		
//		Update the element meet a specific condition
		Iterator<Person> e = people.iterator();
		while (e.hasNext())
		{
			Person p = e.next();
			if (p.getName().equalsIgnoreCase("chris"))
			{
				p.setName("Hilton");
			}
		}
		
		System.out.println(people); // -> [Alex, Hilton, Brad, Hilton]
	}
}

class Person
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
}