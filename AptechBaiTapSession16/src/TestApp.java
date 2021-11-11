import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestApp 
{
	public static void main(String[] args)
	{
		String path = "src/test.txt";
		String content = "Hello";
//		String content = "Aloha";
//		writeToFile(path, content, false);
		writeToFile(path, content, true);
		System.out.println("Done");
	}
	
	private static void writeToFile(String path, String content, boolean append)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, append));
			writer.write(content);
			writer.write(System.lineSeparator());
			writer.close();
			
		}
		catch (IOException e)
		{
			System.out.println("Cannot write to file " + path);
		}
	}
}
