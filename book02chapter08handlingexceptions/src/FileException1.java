import java.io.*;

/*
 * This sample demonstrates the first solution to handle the FileNotFoundException:
 * Using try catch in the openFile method.
 * 
 * */

public class FileException1 
{
	public static void main(String[] args)
	{
		String path = "D:/test.txt";
		openFile(path);
	}
	
	public static void openFile(String name)
	{
		try
		{
			FileInputStream f = new FileInputStream(name);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
}



































