import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/* This sample demonstrates about the inner class. */

public class TickTockInner 
{
	private String tickMessage = "Tick...";
	private String tockMessage = "Tock...";
	
	public static void main(String[] args)
	{
		TickTockInner t = new TickTockInner();
		t.go();
	}
	
	public void go()
	{
//		Create a timer that calls the Ticker class
//		at one second intervals
		Timer t = new Timer(1000, new Ticker());
		t.start();
		
//		Display a message box tp prevent the
//		program from ending immediately
		JOptionPane.showMessageDialog(null, "Click OK to exit program");
		
//		Calls the exit method of th System class, which immediately
//		shuts down the Java Virtual Machine.
//		This method call isn't striclty required here, but if you leave it out,
//		the timer continues to run for a few seconds after you click OK before
//		the JVM figures out that it should skill the timer.
		System.exit(0);
	}
	
	class Ticker implements ActionListener
	{
		private boolean tick = true;
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (tick)
			{
				System.out.println(tickMessage);
			}
			else
			{
				System.out.println(tockMessage);
			}
			tick = !tick;
		}
	}
}






























