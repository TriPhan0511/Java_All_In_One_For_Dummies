
public class PersonTest 
{
	public static void main(String[] args) 
	{
////		1. Upcasting (automatically)
//		
//		Student s = new Student();
//		intro(s);
////		-> Aloha from Student.
//		
//		Person p = s;
//		intro(p);
////		-> Aloha from Student.
		
//		2. Downcasting (not automatically)
		
//		Person p =  new Student();
////		sayHello(p); // error: won't compile, so we need to explicitly cast the p variable to a Student object.
//		sayHello((Student) p);
////		-> It is sayHello method.

//		3.
//		Person p = new Student();
////		p.sing(); // error: won't compile because the method sing() is undefined for the type Person.
//		((Student) p).sing();
////		-> Lalala, i am a student.
//		((Teacher) p).sing(); // error: wont compile because class Student cannot be cast to class Teacher
		
////		Person p = new Student();
//		Person p = new Teacher();
//		if (p instanceof Student)
//		{
//			((Student) p).sing();
//		}
//		if (p instanceof Teacher)
//		{
//			((Teacher) p).sing();
//		}
		

	}
	
//	A method that take an object of Person type as a parameter
	public static void intro(Person p)
	{
		System.out.println(p.greeting());
	}
	
//	A method that take an object of Student type as a parameter
	public static void sayHello(Student s)
	{
		System.out.println("It is sayHello method.");
	}
}

class Person 
{
	public String greeting()
	{
		return "Hello from Person.";
	}
}

class Student extends Person
{
	public String greeting()
	{
		return "Aloha from Student.";
	}
	
	public void sing()
	{
		System.out.println("Lalala, i am a student.");
	}
	
	public String toString()
	{
		return "I am a student.";
	}
}

class Teacher extends Person
{
	public String greeting()
	{
		return "Bonjour from Teacher.";
	}
	
	public void sing()
	{
		System.out.println("hoho, i am a teacher.");
	}
	
	public String toString()
	{
		return "I am a teacher.";
	}
}




























