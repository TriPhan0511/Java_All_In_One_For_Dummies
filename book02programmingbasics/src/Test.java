
public class Test 
{
	public static void main(String[] args) {
		Student s1 = null;
		
		if (s1 == null) {
			System.out.println("yes, is null");
		}
		
		
		s1 = new Student("Alex");
		
		if (s1 == null) 
		{
			System.out.println("yes, is null");
		}
		else
		{
			System.out.println("Not null");
		}
	}
}

class Student
{
//	Instance field
	private String name;
	
	public Student() {}
	
//	Constructor
	public Student(String name)
	{
		this.name = name;
	}
	
}