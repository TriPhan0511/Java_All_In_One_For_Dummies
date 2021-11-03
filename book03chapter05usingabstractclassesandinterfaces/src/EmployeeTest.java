import java.text.NumberFormat;

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Employee emp = getEmployee(10000.0);
		
		String msg = "";
		if (emp instanceof SalariedEmployee)
		{
			msg = "The employee's salary is ";
			msg += ((SalariedEmployee) emp).getFormattedSalary();
		}
		if (emp instanceof HourlyEmployee)
		{
			msg = "The empployee's hourly rate is ";
			msg += ((HourlyEmployee) emp).getFormattedRate();
		}
		
		System.out.println(msg);
	}
	
	public static Employee getEmployee(double salary)
	{
//		return new SalariedEmployee(salary);
		return new HourlyEmployee(salary);
	}
}

class Employee 
{
	private double salary;
	
	public Employee(double salary)
	{
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
}

class SalariedEmployee extends Employee 
{
	public SalariedEmployee(double salary)
	{
		super(salary);
	}
	
	public String getFormattedSalary()
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(getSalary());
	}
}

class HourlyEmployee extends Employee 
{
	public HourlyEmployee(double salary)
	{
		super(salary);
	}
	
	public String getFormattedRate()
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(getSalary());
	}
}




















