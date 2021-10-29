
public class BallTest 
{
	public static void main(String[] args)
	{
//		Create three instances of Ball class
		Ball b1 = new Ball("soccer");
		Ball b2 = new Ball("basebal");
		Ball b3 = new Ball("basketball");
		
//		System.out.printf("There are %d newly created instances of Ball class.", Ball.count);
		System.out.printf("There are %d newly created instances of Ball class.", Ball.getCount());
	}
}
