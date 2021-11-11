import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentApp 
{
	private static final String FILE_PATH = "src/students.txt";
	private static final String ROLL_NUMBER_PATTERN = "[CTN]\\d{4}[G-M]V?\\d{4}"; 
	private static ArrayList<Student> validRollNumbers = new ArrayList<>();
	private static ArrayList<String> invalidRollNumbers = new ArrayList<>();
	
	
	public static void main(String[] args)
	{
		BufferedReader reader = getFile(FILE_PATH);
		if (reader == null)
		{
			System.out.println("Something goes wrong.");
		}
		else
		{
			handleRollNumber(reader);
		}
	}
	
	private static void handleRollNumber(BufferedReader reader)
	{
		String line;
		try 
		{
			while ((line = reader.readLine()) != null && line.length() != 0)
			{
				if (isValidRollNo(ROLL_NUMBER_PATTERN, line))
				{
					Student s = new Student(line);
					validRollNumbers.add(s);
					
//				Do this in thread 2 (in later version):
					Student savedStudent = validRollNumbers.get(validRollNumbers.size() - 1);
					String savedRollNumber =savedStudent.getRollNumber(); 
					System.out.printf("Welcome student has roll number : %s\n", 
							savedRollNumber);
					System.out.printf("Valid collection has length: %d\n", validRollNumbers.size());
					String path = "src/" + savedRollNumber + ".txt";
					writeToFile(path, savedStudent.toString(), false);
				}
				else
				{
					invalidRollNumbers.add(line);
					
//					Do this in thread 3 (in later version):
					String s = invalidRollNumbers.get(invalidRollNumbers.size() - 1);
					System.out.printf("Invalid roll number: %s\n", s);
					String path = "src/invalid.txt";
					writeToFile(path, s, true);
				}
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Cannot read from the file.");
		}
	}
	
	private static boolean isValidRollNo( String regex, String rollNumber) 
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(rollNumber);
		return matcher.matches();
	}
	
	private static BufferedReader getFile(String path)
	{
		BufferedReader reader = null;
		try 
		{
			
			 reader = new BufferedReader(new FileReader(path));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot open the file.");
			System.out.println(e.getMessage());
		}
		
		return reader;
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
