import java.io.*;

/*
 * It is possible to intentionally swallow exceptions in a way that lets you manage
 * the flow of your program. For example, suppose you want the openFile method to
 * return a boolean value to indicate whether the file exists, rather than throw
 * an exception. Then you could code the method something like that:
 * 
 * 
 * */

public class FileException3 
{
	public static boolean openFile(String name)
	{
		boolean fileOpened = false;
		try
		{
			FileInputStream f = new FileInputStream(name);
			fileOpened = true;
		}
		catch (FileNotFoundException e)
		{
		}
		return fileOpened;
	}
}
