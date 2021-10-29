
public class Order 
{
	private double unitPrice;
	private int quantityOrdered;
	
	public double getOrderTotal()
	{
		return unitPrice * quantityOrdered;
	}
	
	public void setUnitPrice(double price)
	{
		unitPrice = price;
	}
	
	public void setQuantityOrdered(int quantity)
	{
		quantityOrdered = quantity;
	}
}
