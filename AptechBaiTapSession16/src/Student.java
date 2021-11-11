
public class Student 
{
	private String studRollNo;
	public Student(String rollNumber) 
	{
		this.studRollNo = rollNumber;
	}
	public String getRollNumber()
	{
		return this.studRollNo;
	}
	public void setRollNumber(String roollNumber) 	
	{
		this.studRollNo = roollNumber;
	}
	@Override
	public String toString()
	{
		return "RollNumber: " + this.studRollNo;
	}
}
