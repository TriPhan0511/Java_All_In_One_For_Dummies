
/*
 * A class can possibly inherit a superclass and implement one or more interfaces. 
 */

public class Poker extends Game
	implements Playable, CardGame
{
//	Inherits all members of the Game class.
	public void createGame() {}
	
//	Must implemet methods of the Playable
//	and CardGame interfaces
	public void play() {}
	public void deal() {}
	public void shuffle() {}
	public void getHand() {}
}
