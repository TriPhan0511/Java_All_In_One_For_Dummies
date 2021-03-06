
/*
 * 1. Extending the Thread class
 * 
 * The easiest way to create a thread is to write a class that extends the Thread class.
 * Then all you have to do to start a thread is create an instance of your thread class
 * and calls it start method.
 * 
 * The following code is a version of the CountDownClock class that extends the Thread class.
 * 
 * Note that there is a method in the Thread class named void run(), which is called when
 * the thread is started. Place the code that you want the thread to execute inside this
 * method.
 */

/*
 * Constructors and Methods of the Thread Class
 * 
 *	Constructor								Explanation
 *
 *	Thread()								Creates an instance of the Thread class. This constructor is
 *											the basic Thread constructor without parameters.
 *
 *	Thread(String name)						Creates a Thread object and assigns the specified name to the thread.
 *
 *	Thread(Runnable target)					Turns any object that implements an API interface calles Runnable
 *											into a thread.
 *
 *	Thread(Runnable target,					Creates a thread from any object that implements Runnable and
 *			String name)					assigns the specified name to the thread.
 *	
 * 	static void sleep(int milliseconds)		Causes the current executing thread to sleep for a specified 
 * 											number of milliseconds.
 * 
 *	void run()								Is called when the thread is started. Place the code that you
 *											want the thread to execute inside this method.
 *
 * 	void start()							Starts the thread.
 * 
 *	static void yield()						Causes the currently executing thread to yield to other threads
 *											that are waiting to execute.
 * 
 */

/*
 * Remember:
 * 
 * At some point in its execution, the run method should either call sleep or yield 
 * to give other threads a chance to execute.
 */

//public class CountDownClock extends Thread
//{
//	public void run()
//	{
//		for (int t = 20; t >= 0; t--)
//		{
//			System.out.println("T minus " + t);
//			try
//			{
//				Thread.sleep(1000); // pause 1 second
//			}
//			catch (InterruptedException e) 
//			{}
//		}
//	}
//}

//------------------------------------------------------------------------------------------------------------------

/* The CountDownClock (Version 3) */

public class CountDownClock extends Thread
implements TimeMonitor
{
	private int t;
	
	public CountDownClock(int start)
	{
		this.t = start;
	}
	
	@Override
	public void run()
	{
		for (; t >= 0; t--)
		{
			System.out.println("T minus " + t);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{}
		}
	}
	
	@Override
	public int getTime()
	{
		return t;
	}
}


























