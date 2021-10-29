
public class Actor 
{
//	Private fields
	private String lastName;
	private String firstName;
	private boolean goodActor;
	
//	A constructor
	public Actor(String last, String first)
	{
		lastName = last;
		firstName = first;
	}
	
//	Another constructor
	public Actor(String last, String first, boolean good)
	{
		this(last, first);
		goodActor = good;
	}
	
	public String intro()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("My name's ");
		builder.append(firstName);
		builder.append(" ");
		builder.append(lastName);
		builder.append(".");
		return builder.toString();
	}
	
	public String intro2()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(this.intro());
		builder.append("And I am a ");
		if (goodActor)
		{
			builder.append("good ");
		}
		else
		{
			builder.append("bad ");
		}
		builder.append("actor.");
		return builder.toString();
	}
	
	public void printMe()
	{
		System.out.println(this);
	}
	
	public String toString()
	{
		return "Fullname: " + this.firstName + " " + this.lastName; 
	}
}



























