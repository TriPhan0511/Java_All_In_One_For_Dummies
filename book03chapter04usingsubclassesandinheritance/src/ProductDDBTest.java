//import java.io.IOException;
//
////import java.io.*;
//
///* This sample demonstrates how to throw a custom exception */
//
//public class ProductDDBTest
//{
//	public static void main(String[] args)
//	{
//		String productCode = "abc";
//		try
//		{
//			Product p = ProductDDB.getProduct(productCode);
//		}
//		catch(ProductDataException e) 
//		{
//			
//		}
//	}
//}
//
//class ProductDDB 
//{
//	public static Product getProduct(String code)
//		throws ProductDataException
//	{
//		try
//		{
//			Product p ;
//			
////			code that gets the product from a file and might throw an IOException
//			
//			p = new Product();
//			return p;
//		}
//		catch(IOException e)
//		{
//			throw new ProductDataException("An IO error occured.");
//		}
//	}
//}
//
//class Product {}