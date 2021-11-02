/* Exercise 02: A program which get and display student's information */

class Student 
{
//	Private fields
	private int studentID;
	private String fullName;
	private double examMark;
	private double practicalMark;
	
//	The default constructor
	public Student() {}
	
//	Another constructor
	public Student(int id, String fullName, double examMark, double practicalMark)
	{
		this.studentID = id;
		
//		Set a default full name for student if 
//		the input fullName is null or is an empty string.
		if (fullName == null || fullName.equals(""))
		{
			this.fullName = "Student's Name"; // Set a default full name
		}
		else
		{
			this.fullName = fullName;
		}
		
//		Student's mark should be between 0 and 10.
		if (examMark < 0)
		{
			this.examMark = 0;
		}
		else if (examMark > 10.0)
		{
			this.examMark = 10.0;
		}
		else
		{
			this.examMark = examMark;
		}
		
		if (practicalMark < 0)
		{
			this.practicalMark = 0;
		}
		else if (practicalMark > 10.0)
		{
			this.practicalMark = 10.0;
		}
		else
		{
			this.practicalMark = practicalMark;
		}
	}
	
//	Getters / Setters
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public void setStudentID(int id)
	{
		this.studentID = id;
	}
	
	public String getFullName()
	{
		return this.fullName;
	}
	
	public void setFullName(String fullName)
	{
//		Set a default full name for student if 
//		the input fullName is null or is an empty string.		
		if (fullName == null || fullName.equals(""))
		{
			this.fullName = "Student's Name"; // Set a default full name
		}
		else
		{
			this.fullName = fullName;
		}
	}
	
	public double getExamMark()
	{
		return this.examMark;
	}
	
	public void setExamMark(double mark)
	{
		if (mark < 0)
		{
			this.examMark = 0;
		}
		else if (mark > 10.0)
		{
			this.examMark = 10.0;
		}
		else
		{
			this.examMark = mark;
		}
	}
	
	public double getPracticalMark()
	{
		return this.practicalMark;
	}
	
	public void setPracticalMark(double mark)
	{
		if (mark < 0)
		{
			this.practicalMark = 0;
		}
		else if (mark > 10.0)
		{
			this.practicalMark = 10.0;
		}
		else
		{
			this.practicalMark = mark;
		}
	}
	
//	getFinalMark method
	public double getFinalMark()
	{
		return (this.examMark + this.practicalMark) / 2;
	}
	
//	Override the toString method
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(this.studentID);
		builder.append("\t");
		builder.append(this.fullName);
		builder.append("\t");
		builder.append(String.format("%.1f", this.examMark));
		builder.append("\t");
		builder.append(String.format("%.1f", this.practicalMark));
		builder.append("\t");
		builder.append(String.format("%.1f", getFinalMark()));
		
		return builder.toString();
	}
}


