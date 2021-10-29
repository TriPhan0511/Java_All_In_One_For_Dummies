
public class CountTestApp 
{
	public static void main(String[] args)
	{
		printCount();
		for (int i = 0; i < 10; i++)
		{
//			CountTest c1 = new CountTest();
			new CountTest();
			printCount();
		}
	}
	
	public static void printCount()
	{
		System.out.println("There are now "
				+ CountTest.getInstanceCount()
				+ " instances of the CountTest class.");
	}
	
}

class CountTest
{
//	A static field
	private static int instanceCount = 0;
	
//	A constructor
	public CountTest()
	{
		instanceCount++;
	}
	
//	A static method
	public static int getInstanceCount()
	{
		return instanceCount;
	}
}































