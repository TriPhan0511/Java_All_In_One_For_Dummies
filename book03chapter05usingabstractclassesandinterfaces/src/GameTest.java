
/*
 * Using an interface as a type
 * 
 
 */

public class GameTest 
{
	/*
	 *  In Java, an interface is a kind of type, just like a class. As a result, you can use
	 *  an interface as the type for a variable, parameter, or a method return value.
	 *  
	 *  Consider the following snippet of code.
	 */
	
	/*
	 * Here I assume that the getGame method returns an object that implements the Playable
	 * interface. This object is assigned to a variable of type Playable in the first statement.
	 * Then the second statement calls the object's play method.
	 */
	
	public static void main(String[] args)
	{
		Playable game = getGame();
		game.play();
	}
	
	private static Hearts getGame()
	{
		return new Hearts();
	}
}

























