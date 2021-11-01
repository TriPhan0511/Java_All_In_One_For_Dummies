import java.io.*;

/* This sample demonstrates about the checked exceptions */

public class CheckedExceptionsSample 
{
//	Adding a throws clause to the openFile method's declaration means that
//	when the FileNotFoundException occurs, it is simply passed up to the 
//	method that called the openFile method. That means the calling method
//	(in this illustration, main) must catch or throw the exception. 
//	To catch the exception, the main method would have to be coded like this:
	public static void main(String[] args)
	{
		try
		{
			openFile("C:/test.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
	
//	Throwing the FileNotFoundExcept:
//	pass the exception up to the method that calls the openFile method.
//	Add a throws clause to the openFile method's declaration.
//	That clause indicates that the openFile method knows it contains a
//	statement that might throw an FileNotFoundException but doesn't want
//	to deal with that exception here. Instead, the exception is passed up
//	to the caller.
	public static void openFile(String name)
		throws FileNotFoundException
	{
		FileInputStream f = new FileInputStream(name);
	}
	
//	----------------------------------------------------------------------
	
//	Another way: 
	
//	public static void main(String[] args)
//	{
//		openFile("C:\test.txt");
//	}
	
//	Catching FileNotFoundException
//	public static void openFile(String name)
//	{
//		try
//		{
//			FileInputStream f = new FileInputStream(name);
//		}
//		catch(FileNotFoundException e)
//		{
//			System.out.println("File not found.");
//		}
//	}
}


