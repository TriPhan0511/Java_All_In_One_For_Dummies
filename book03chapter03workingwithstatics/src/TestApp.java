
public class TestApp 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("A");
		Person p2 = new Person("A");
		
		if (p1 == p2)
		{
			System.out.println("The objetcs are the same.");
		}
		else
		{
			System.out.println("The objects are not the same.");
		}
	}
}

class Person
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
}
