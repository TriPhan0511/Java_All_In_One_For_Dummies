
public class EmployeeTest 
{
	
	public static void main(String[] args)
	{
//		Employee e1 = new SalariedEmployee("Alex", 10000.0);
//		e1.displaySalary();
////		-> Salary: $10,000.00
//		
//		Employee e2 = new HourlyEmployee("Brad", 1.5);
//		e2.displaySalary();
////		-> Hour rate: $1.50
		
//		Employee e3 = new HourlyEmployee("Chris", 5.6);
		Employee e3 = new SalariedEmployee("Chris", 5.6);
		if (e3 instanceof HourlyEmployee)
		{
			System.out.println(((HourlyEmployee) e3).sayAloha());
		}
		if (e3 instanceof SalariedEmployee)
		{
			System.out.println(((SalariedEmployee) e3).sayHello());
		}
	}
}
