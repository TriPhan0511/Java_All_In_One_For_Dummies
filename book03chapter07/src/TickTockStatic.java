import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/* This sample demonstrate about the static inner class. */

public class TickTockStatic 
{
	private static String tickMessage = "tick....";
	private static String tockMessage = "tock....";
	
	public static void main(String[] args)
	{
		TickTockStatic t = new TickTockStatic();
		t.go();
	}
	
	private void go()
	{
		Timer t =  new Timer(1000, new Ticker());
		t.start();
		JOptionPane.showMessageDialog(null, "Click OK to exit program");
		System.exit(0);
		
	}
	
	private static class Ticker implements ActionListener
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




























