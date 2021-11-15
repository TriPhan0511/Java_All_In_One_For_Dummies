import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TickTock 
{
	public static void main(String[] args)
	{
//		Create a timer that calls the Ticket class
//		at one second intervals
		Timer t = new Timer(1000, new Ticker());
		t.start();
		
//		Display amessage box to prevent
//		the program from ending immediately
		JOptionPane.showMessageDialog(null, "Click OK to exit program.");
	}
}

class Ticker implements ActionListener
{
	private boolean tick = true;
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (tick)
		{
			System.out.println("Tick0...");
		}
		else {
			System.out.println("Tock0...");
		}
		tick = !tick;
	}
}