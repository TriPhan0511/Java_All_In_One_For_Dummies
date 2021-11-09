import javax.swing.*;

public class JOptionPaneSample 
{
	public static void main(String[] args)
	{
		while (true)
		{
			String s;
			try
			{
				s = JOptionPane.showInputDialog("Enter an integer");
				int i = Integer.parseInt(s);
				JOptionPane.showMessageDialog(null, "The number you entered was " + i);
				break;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Invalid integer. Try again.");
			}
		}
	}
}
