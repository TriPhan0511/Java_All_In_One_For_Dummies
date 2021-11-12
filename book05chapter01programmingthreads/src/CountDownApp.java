
/*
 * 2. Creating and starting a thread
 * 
 * After you define a class that defines a Thread object, you can create and start 
 * the thread. Here's the main class for the first version of the countdown application: 
 * 
 */

public class CountDownApp 
{
	public static void main(String[] args)
	{
		Thread clock = new CountDownClock();
		clock.start();
	}
}
