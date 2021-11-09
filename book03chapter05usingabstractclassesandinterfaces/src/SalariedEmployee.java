import java.text.NumberFormat;

public class SalariedEmployee extends Employee 
{
	private double salary;
	
	public SalariedEmployee(String name, double salary)
	{
		super(name);
		this.salary = salary;
	}
	
	@Override
	public void displaySalary()
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Salary: " + cf.format(salary));
	}
	
	public String sayHello()
	{
		return "Hello from salaried employee.";
	}
}
