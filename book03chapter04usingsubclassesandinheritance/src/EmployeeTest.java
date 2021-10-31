import java.text.NumberFormat;

/* This sample demonstrate how to use the instanceof operator to determine an object's type. */

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		/*
		 * To tell what type of object has been assigned to the emp variable, you can use the
		 * instanceof operator, which is defined specifically for this purpose.
		 * 
		 * */
		Employee emp = getEmployee();
		String msg;
		if (emp instanceof SalariedEmployee)
		{
			msg = "The employee's salary is ";
			msg += ((SalariedEmployee) emp).getFormattedSalary();
		}
		else
		{
			msg = "The employee's hourly rate is ";
			msg += ((HourlyEmployee) emp).getFormattedPayRate();
		}
		System.out.println(msg);
	}
	
	public static Employee getEmployee()
	{
//		return new SalariedEmployee(10000.0);
		return new HourlyEmployee(20.0);
	}
}

// Superclass
class Employee {} 


// Subclass
class SalariedEmployee extends Employee 
{
	private double salary;
	
	public SalariedEmployee(double salary) 
	{
		this.salary = salary;
	}
	
	public String getFormattedSalary()
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(this.salary);
	}
}

// Another subclass
class HourlyEmployee extends Employee 
{
	private double payRate;
	
	public HourlyEmployee(double payRate)
	{
		this.payRate = payRate;
	}
	
	public String getFormattedPayRate()
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(this.payRate);
	}
}





















