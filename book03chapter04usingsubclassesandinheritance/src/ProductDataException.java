/* This sample demonstrates how to create an exception class */

public class ProductDataException extends Exception 
{
	public ProductDataException() {}
	
	public ProductDataException(String message)
	{
		super(message);
	}
}
