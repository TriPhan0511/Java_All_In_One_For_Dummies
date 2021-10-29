
public class Invoice 
{
//	A static field
	private static int nextInvoiceNumber = 1; 
	
//	Class fields
	private String customer;
	private int number;
	
//	Constructor
	public Invoice(String custName)
	{
		this.customer = custName;
		this.number = nextInvoiceNumber;
		nextInvoiceNumber++;
	}
	
//	Getter
	public int getNumber()
	{
		return this.number;
	}
	
	public String getCustomer()
	{
		return this.customer;
	}
}
