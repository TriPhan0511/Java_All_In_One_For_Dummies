package version_3;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingSync 
{
	ScheduledThreadPoolExecutor pool = 
			new ScheduledThreadPoolExecutor(2);
	CountDownClockSync clock = new CountDownClockSync(20);
	
	public static void main(String[] args)
	{
		new DoTwoThingSync();
	}
	
	public DoTwoThingSync() 
	{
		pool.execute(clock);
		pool.execute(clock);
		pool.shutdown();
	}
}
