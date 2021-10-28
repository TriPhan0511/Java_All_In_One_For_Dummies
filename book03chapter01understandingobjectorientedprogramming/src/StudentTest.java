
public class StudentTest 
{
	public static void main(String[] args)
	{
//		Create an intsance of Student
		Student s = new Student();
		
//		Use the setName method which is defined in the Person class
		s.setName("Peter");
		
//		Use the getName method which is defined in the Person class
		System.out.printf("Hello, my name is %s. I'm a student.", s.getName());
//		-> Hello, my name is Peter. I'm a student.
		
//		Use a public field which is defined in the Person class (for testing)
		System.out.printf("\nMy greeting: %s", s.greeting);
		
//		Use the sayHello method, which is a pubic method defined in the Person class
//		then is overridden in the Student class.
		System.out.printf("\n%s", s.sayHello());
//		-> Bonjour! I come from France.
		
		
		System.out.printf("\n%s", s.sayHello("Vietnam"));
//		-> Chao ban! Toi den tu Vietnam
	}
}








































