package version_3;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingsLocked 
{
	ScheduledThreadPoolExecutor pool =
			new ScheduledThreadPoolExecutor(2);
	CountDownClockLocked clock = new CountDownClockLocked();
	
	public DoTwoThingsLocked() 
	{
		pool.execute(clock);
		pool.execute(clock);
		pool.shutdown();
	}
	
	public static void main(String[] args) 
	{
		new DoTwoThingsLocked();
	}
}
