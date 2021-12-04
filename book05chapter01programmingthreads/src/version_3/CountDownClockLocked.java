package version_3;

import java.util.concurrent.locks.ReentrantLock;

// Using a Lock.

public class CountDownClockLocked extends Thread 
{
	ReentrantLock lock = new ReentrantLock();
	
	public void run()
	{
		lock.lock();
		for (int i = 20; i >= 0; i--)
		{
			System.out.println("T minus " + i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{}
		}
		lock.unlock();
	}
}
