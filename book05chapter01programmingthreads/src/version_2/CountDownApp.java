package version_2;

import java.util.ArrayList;
import java.util.List;

public class CountDownApp 
{
	public static void main(String[] args) 
	{
		CountDownClock clock = new CountDownClock(20);
		List<Runnable> events = new ArrayList<>();
		events.add(new LaunchEvent(16, "Flood the pad!", clock));
		events.add(new LaunchEvent(6, "Start engines!", clock));
		events.add(new LaunchEvent(0, "Liftoff", clock));
		
		clock.start();
		for (Runnable e : events)
		{
			new Thread(e).start();
		}
	}
}
