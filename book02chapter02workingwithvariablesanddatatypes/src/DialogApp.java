import javax.swing.JOptionPane;

/* This program demonstrates how to use the JOptionPane class to get user input. */

public class DialogApp 
{
	public static void main(String[] args) 
	{
//		Use JOptionPane displays a simple dialog box to get text input from user.
		String s = JOptionPane.showInputDialog("Enter an integer:");
		
//		Use the parse method of the Integer wrapper class to convert the text
//		entered by the user to the appropriate primitive type
		int x = Integer.parseInt(s);
		
		System.out.printf("You entered %d", x);
	}
}
