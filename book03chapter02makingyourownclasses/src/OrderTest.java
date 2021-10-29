
public class OrderTest 
{
	public static void main(String[] args)
	{
		Order o = new Order();
		o.setUnitPrice(10.0);
		o.setQuantityOrdered(9);
		
		System.out.printf("%.2f", o.getOrderTotal());
	}
}
