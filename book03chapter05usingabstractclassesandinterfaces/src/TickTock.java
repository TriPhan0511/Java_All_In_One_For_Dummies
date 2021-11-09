import javax.swing.*;
import java.awt.event.*;

/**
 * This sample demonstrate about the callbacks in Java.
 * 
 * @author Tri Phan
 *
 */

/*
 * Callbacks are handled in Java by a set of interfaces designed for this purpose. 
 * One handy use for callbacks is in the Timer class, which is part of the javax.swing package.
 * This class implements a basic timer that generates events at regular intervals - and lets
 * you set up a listener object to hanlde these events. The listener object must implement
 * the ActionListener interface, which defines a method named actionPerformed that's called
 * for each timer event.
 */

/*
 * The Timer class constructor accepts two parameters:
 * 
 * 		_ The first parameter is an int value that represents how often the timer events occur.
 * 
 *  	_ The second parameter is an object that implements the ActionListener interface. This
 *  		object's actionPerformed method is called when each timer event occur.
 */

/*
 * The ActionListener interface is defined in the java.awt.event package. It includes the 
 * following code:
 * 
		 public interface ActionListener extends EventListener{
			public void actionPerformed(ActionEvent e); // Invoked when an action occurs
		}
 */

/*
 * As you can see, the ActionListener interface consists of a single method named
 * actionPerformed. It receives a parameter of type ActionEvent, but you don't use
 * this parameter here. (You do use the ActionEvent class in Book 6.)
 */

/*
 * The Timer class has about 20 methods, but I talk about one of them here:
 * start, which sets the timer in motion. This method doesn't require any parameter
 * and doesn't return a value.
 */

/*
 * The following program uses the Timer class to alternately display the message Tick...
 * and Tock... on the console at 1-second intervals. The JOptionPane class is used to 
 * display a dialog box; the program runs until the user clicks the OK button in this box.
 * (Actually it takes a while for the JOptionPane class to shut down the timer, so you'll
 * see a few extra tick-tocks after clicking OK.)
 */

/*
 * Note that the JOptionPane class is used to display a dialog box that tells the user to
 * click the OK button to stop the application. You might think I include this dialog box
 * to give the use a way to end the program. In reality, I use it to give the timer some 
 * time to run. If I just end the main method after starting the timer, the application 
 * ends, which kills the timer. Because I use JOptionPane here, the application continues
 * to run as long as the dialog box is displayed.
 */


public class TickTock 
{
	public static void main(String[] args)
	{
//		Create a timer that calls the Ticker class
//		at one second intervals.
		Timer t = new Timer(1000, new Ticker()); // 1,000 milliseconds = 1 second
		t.start();
		
//		Display a message box to prevent the
//		program from ending immediately
		JOptionPane.showMessageDialog(null, "Click OK to exit program");
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
			System.out.println("Tick...");
		}
		else
		{
			System.out.println("Tock...");
		}
		tick = !tick;
	}
	
}



































