import java.text.NumberFormat;

public class HourlyEmployee extends Employee 
{
	private double hourRate;
	
	public HourlyEmployee(String name, double hourRate)
	{
		super(name);
		this.hourRate = hourRate;
	}
	
	@Override
	public void displaySalary()
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Hour rate: " + cf.format(hourRate));
	}
	
	public String sayAloha()
	{
		return "Aloha from hourly employee.";
	}
}
