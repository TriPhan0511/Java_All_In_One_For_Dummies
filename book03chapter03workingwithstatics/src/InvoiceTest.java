
public class InvoiceTest 
{
	public static void main(String[] args)
	{
		Invoice v1 = new Invoice("Alex");
		Invoice v2 = new Invoice("Kelly");
		Invoice v3 = new Invoice("Josh");
		
		System.out.printf("Number of %s's invoice: %d", v1.getCustomer(), v1.getNumber());
		System.out.printf("\nNumber of %s's invoice: %d", v2.getCustomer(), v2.getNumber());
		System.out.printf("\nNumber of %s's invoice: %d", v3.getCustomer(), v3.getNumber());
	}
}
