package version_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 2.0 
 * @author Tri Phan
 *
 */
public class CountDownApp
{
	public static void main(String[] args) 
	{
		Thread clock = new CountDownClock();
		List<Runnable> events = new ArrayList<>();
		events.add(new LaunchEvent(16, "Flood the pad!"));
		events.add(new LaunchEvent(6, "Start engines!"));
		events.add(new LaunchEvent(0, "Liftoff!"));
		
		clock.start();
		for (Runnable e : events)
		{
			new Thread(e).start();
		}
	}
}


























