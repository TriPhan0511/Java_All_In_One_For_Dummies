
/*
 * In this sample, the Playable2 interface specifies that if an implementing class
 * does not provide an implementation of the quit method, the default method will be used. 
 */

public class TestLambdaCollection 
{
	public static void main(String[] args)
	{
//		Create an instance of the Game class
		Game g = new Game();
		
//		Calls the play method
		g.play(); // -> Good luck!

//		Calls the quit method 
//		(it is a default method in the Playable2 interface, 
//		and was not overridden in the Game class.)
		g.quit(); // -> Sorry, quitting is not allowed.
	}
}

interface Playable2
{
//	An abstract method
	void play(); 
	
//	A default method
	default void quit()
	{
		System.out.println("Sorry, quitting is not allowed.");
	}
}

class Game implements Playable2
{
//	Implements the abstract method named play in the Playable2 interface
	public void play()
	{
		System.out.println("Good luck!");
	}
}
























