
/*
 * A class can implement more than one interface
 */

public class Hearts implements Playable, CardGame
{
//	Must implement methods of the Playable
//	and CardGame interfaces
	public void play() 
	{
		System.out.println("Hello from Hearts. "
				+ "\nThis method is implemented from Playable interface.");
	}
	public void deal() {}
	public void shuffle() {}
	public void getHand() {}
}
