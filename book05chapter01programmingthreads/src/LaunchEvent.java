
/*
 * Implementing the Runnable Interface
 * 
 * The Runnable interface marks an object that can be run as a thread. 
 * It has only one method, run, that contains the code that's executed in the thread.
 * (The Thread itself implements Runnable, which is why the Thread class has a run method.)
 * 
 */

/*
 * Using the Runnable interface
 * 
 * To use the Runnable interface to create and start a thread, 
 * you have to do the following:
 * 
 * 		1. Create a class that implements Runnable.
 * 
 * 		2. Provide a run method in the class you created in Step 1.
 * 
 * 		3. Create an instance of the Thread class and pass your Runnable object to
 * 			its constructor as a parameter.
 * 
 * 			A Thread object is created that can run your Runnable class. 
 * 
 * 		4. Call the Thread object's start method.
 * 
 * 			The run method of your Runnable object is called and executes in a
 * 			separte thread.	
 * 
 */

/*
 * This class implements the Runnable interface.
 * 
 * The constructor accepts two parameters: an integer representing the 
 * start time (in seconds) and a string message that's displayed when
 * the time arrives. The constructor simply stores these parameters values
 * in private fields.
 * 
 *  In the run method, the Thread.sleep method is called to put the thread 
 *  to sleep until the desired countdown time arrives. The length of time that the
 *  the thread should sleep is calcualted by the expression 20000 - (start * 1000).
 *  The countdown clock starts at 20 seconds, which is 20,000 milliseconds. This
 *  expression simply subtracts the number of milliseconds that corresponds to the
 *  desired start time from 20,000. Thus, if the desired start time is 6 seconds,
 *  the sleep method sleeps for 14,000 milliseconds - that is, 14 seconds.
 *  
 *  When the thread wakes up, it displays the message passed via its constructor
 *  on the console.
 */

//public class LaunchEvent implements Runnable 
//{
//	private int start;
//	private String message;
//	
//	public LaunchEvent(int start, String message)
//	{
//		this.start = start;
//		this.message = message;
//	}
//	
//	@Override
//	public void run()
//	{
//		try
//		{
//			Thread.sleep(20000 - (start * 1000));
//		}
//		catch(InterruptedException e)
//		{}
//		System.out.println(message);
//	}
//}

//-----------------------------------------------------------------------------

public class LaunchEvent implements Runnable 
{
	private int start;
	private String message;
	TimeMonitor tm;
	
	public LaunchEvent(int start, String message,
			TimeMonitor monitor)
	{
		this.start = start;
		this.message = message;
		this.tm = monitor;
	}
	
	public void run()
	{
		boolean eventDone = false;
		while (!eventDone)
		{
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{}
			if (tm.getTime() <= start)
			{
				System.out.println(this.message);
				eventDone = true;
			}
		}
	}
}





























