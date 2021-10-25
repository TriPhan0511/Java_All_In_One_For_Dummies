import java.io.*;

/*
 * This sample demonstrates the second solution to handle the FileNotFoundException:
 * Adding a throws clause to the openFile method' declaration and 
 * using try catch in the main method. 
 * 
 * */

public class FileException2 
{
	public static void main(String[] args)
	{
		try
		{
			String path = "D:/test.txt";
			openFile(path);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
	}
	
	public static void openFile(String name)
		throws FileNotFoundException
	{
		FileInputStream f = new FileInputStream(name);
	}
}
