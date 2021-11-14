import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class TickTockInner 
{
	private String tickMessage = "Tick...";
	private String tockMessage = "Tock...";
	
	public static void main(String[] args)
	{
		TickTockInner t = new TickTockInner();
		t.go();
	}
	
	public static void go()
	{
		Timer timer = new Timer(1000, new Ticker());
	}
	
	class Ticker implements ActionListener
	{
		private boolean tick;
		
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






























