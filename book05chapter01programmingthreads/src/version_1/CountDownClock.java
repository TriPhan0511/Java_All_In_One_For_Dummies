package version_1;

/**
 * This class extends the Thread class.
 * @version 1.0 2021-12-03
 * @author Tri Phan
 *
 */
public class CountDownClock extends Thread 
{
	public void run()
	{
		for (int t = 20; t >= 0; t--)
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
}
