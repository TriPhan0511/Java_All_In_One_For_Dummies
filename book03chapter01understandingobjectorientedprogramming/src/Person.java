// Create a superclass named Person
public class Person 
{
//	Create a public field (for testing)
//	public String greeting = "Aloha";
//	String greeting = "Aloha";
	protected String greeting = "Aloha";
	
//	Create a private field
	private String name;
	
//	Getter / Setter: public methods
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
//	Create another public method
	public String sayHello()
	{
		return "Bonjour! I come from France.";
	}
}
