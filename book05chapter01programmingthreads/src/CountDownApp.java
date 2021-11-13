
/*
 * The CountDownApp (Version 1)
 * 
 * After you define a class that defines a Thread object, you can create and start 
 * the thread. Here's the main class for the first version of the countdown application: 
 *  
 * */

//public class CountDownApp 
//{
//	public static void main(String[] args)
//	{
//		Thread clock = new CountDownClock();
//		clock.start();
//		
//		LaunchEvent event1 = new LaunchEvent(16, "Event Number One happenning");
//		Thread event1Thread = new Thread(event1);
//		event1Thread.start();
//		
//	}
//}

//-------------------------------------------------------------------------------------------

/*
 * The CountDownApp (Version 2)
 *
 * The main method starts by creating an instance of the CountDownClock class
 * and saving it in the clock variable. 
 * 
 * Next, it creates three LaunchEvent objects to flood the pad at 16 seconds,
 * start the engines at 6 seconds, and lift off at 0 seconds. These objects are
 * assigned to variables of type Runnable named flood, igintion, and liftoff.
 * 
 * The clock thread is started. The coundown start ticking.
 * 
 * Finally, the program starts the three LaunchEvent objects as threads.
 * It does this by creating a new instance of the Thread class, passing the
 * LaunchEvent objects as parameters to the Thread constructor, and then 
 * calling the start method to start the thread. Note that because this program
 * doesn't need to do anything with these threads after they're started, it 
 * doesn't bother creating variables for them.
 * 
 */

//import java.util.ArrayList;
//
//public class CountDownApp 
//{
//	public static void main(String[] args)
//	{
//		Thread clock = new CountDownClock();
//		ArrayList<Runnable> events = new ArrayList<>();
//		events.add(new LaunchEvent(16, "Flood the pad!"));
//		events.add(new LaunchEvent(6, "Start engines!"));
//		events.add(new LaunchEvent(0, "Liftoff!"));
//		clock.start();
//		for (Runnable event : events)
//		{
//			new Thread(event).start();
//		}
//	}
//}

//-------------------------------------------------------------------------------------------

import java.util.ArrayList;

public class CountDownApp 
{
	public static void main(String[] args)
	{
		CountDownClock clock = new CountDownClock(20);
		ArrayList<Runnable> events = new ArrayList<>();
		events.add(new LaunchEvent(16, "Flood the pad!", clock));
		events.add(new LaunchEvent(6, "Start the engines!", clock));
		events.add(new LaunchEvent(0, "Liftoff!", clock));
		clock.start();
		for (Runnable event : events)
		{
			new Thread(event).start();
		}
	}

}





























