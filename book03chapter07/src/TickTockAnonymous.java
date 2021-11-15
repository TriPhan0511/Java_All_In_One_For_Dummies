import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/* This sample illustrates about the anonymous class. */

public class TickTockAnonymous
{
	private String tickMessage = "Tick......";
	private String tockMessage = "Tock.......";
	
	public static void main(String[] args)
	{
		
		TickTockAnonymous t = new TickTockAnonymous();
		t.go();
	}
	
	private void go()
	{
		Timer timer = new Timer(1000, 
				new ActionListener()
				{
					private boolean tick = true;
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
				});
		timer.start();
		JOptionPane.showMessageDialog(null, "Click OK to exit program");
		System.exit(0);
	}
}


















