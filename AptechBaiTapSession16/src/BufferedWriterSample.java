import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample 
{
	public static void main(String[] args)
	{
		String path = "src/test3.txt";
		String content = "Aloha1";
		writeToFile(path, content);
		System.out.println("Done");
	}
	
	private static void writeToFile(String path, String content)
	{
		try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
			writer.append(content);
			writer.append(System.lineSeparator());
			writer.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Cannot write to this file.");
		}
		finally
		{
			
		}
	}
}
