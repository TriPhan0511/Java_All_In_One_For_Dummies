import java.util.*;

/* Exercise 02: A program which get and display student's information */

public class StudentTest 
{
//	A static variable reference to an Scanner object which get user input
	private static Scanner sc = new  Scanner(System.in);

	public static void main(String[] args)
	{
//		Instantiate an ArrayList object for storing Student objects
		ArrayList<Student> students = new ArrayList<>();
		
//		Create three students and add them to students ArrayList.
		Student s1 = getStudent("\nFirst Student");
		students.add(s1);
		Student s2 = getStudent2("\nSecond Student");
		students.add(s2);
		Student s3 = getStudent2("\nThird Student");
		students.add(s3);
		
//		Display all of students' information
		displayStudents(students);
	}
	
//	getStudent method:
//	Use Student's constructor: Student(String fullName, double examMark, double practicalMark)
	private static Student getStudent(String msg)
	{
		System.out.println(msg);
		String fullName = getFullName("Full name? ");
		double examMark = getMark("Examination mark ? ");
		double practicalMark = getMark("Practical mark ? ");
		return new Student(fullName, examMark, practicalMark);
	}
	
//	getStudent2 method:
//	Use Student's default constructor and setter methods
	private static Student getStudent2(String msg)
	{
		System.out.println(msg);
		String fullName = getFullName("Full name? ");
		double examMark = getMark("Examination mark ? ");
		double practicalMark = getMark("Practical mark ? ");
		Student student = new Student();
		student.setFullName(fullName);
		student.setExamMark(examMark);
		student.setPracticalMark(practicalMark);
		return student;
	}
	
	private static void displayStudents(ArrayList<Student> students)
	{
		System.out.println("\n----------- Information Of Students -----------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n",
							"ID",
							"Full name",
							"Exam",
							"Prac",
							"Final");
		Student s;
		Iterator<Student> e = students.iterator();
		while (e.hasNext())
		{
			s = e.next();
			System.out.println(s);
		}
	}
	
//	getFullname method:
//	Full name shouldn't be empty.
	private static String getFullName(String msg)
	{
		String fullName;
		while (true)
		{
			System.out.print(msg);
			fullName = sc.nextLine();
			if (fullName.equals(""))
			{
				System.out.println("You entered an empty name. Try again.");
				continue;
			}
			return fullName;
		}
	}
	
//	getMark method:
//	mark should be a double and between 0.0 and 10.0
	private static double getMark(String msg)
	{
		double mark;
		while (true)
		{
			try
			{
				System.out.print(msg);
				mark = sc.nextDouble();
				if (mark < 0.0 || mark > 10.0)
				{
					System.out.println("Mark should be less than 0 and greater than 10. Try again.");
					continue;
				}
				return mark;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid mark. Try again.");
			}
			finally
			{
				sc.nextLine();
			}
		}
	}
}




