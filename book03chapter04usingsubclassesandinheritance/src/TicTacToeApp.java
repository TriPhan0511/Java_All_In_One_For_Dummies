/* This simple sample demonstrate what is polymorphism */

/*
 * The term polymorphism refers to the ability of Java to use base class variables to
 * refer to subclass objects; to keep track of which subclass an object belongs to; and
 * to use overridden methods of the subclass, even though the subclass isn't known when
 * the program is compiled.
 * 
 * */

/*
 * Java knows to call the move method of the BetterPlayer subclass because it uses a
 * technique called late binding. Late binding simply means that when the compiler
 * can't tell for sure what type of object a variable references, it doesn't hard-wire
 * the method calls when the programm is compiled. Instead, it waits until the program
 * is executing to determine exactly which method to call.
 * 
 * */

public class TicTacToeApp 
{
	public static void main(String[] args)
	{
		Player p1 = new Player();
		Player p2 = new BetterPlayer();
		playTheGame(p1, p2);
	}
	
	public static void playTheGame(Player p1, Player p2)
	{
		p1.move();
		p2.move();
	}
}

// Superclass
class Player 
{
	public int move()
	{
		for (int i = 0; i < 9; i++)
		{
			System.out.println("\nThe basic player says:");
			System.out.println("I'll take the first open square!");
			return firstOpenSquare();
		}
		return -1;
	}
	
	private int firstOpenSquare()
	{
		int square = 0;
		
//		code to find the first open square goes here
		
		return square;
	}
}

// Subclass
class BetterPlayer extends Player
{
	public int move()
	{
		System.out.println("\nThe beter player says:");
		System.out.println("I'm looking for a good move...");
		return findBestMove();
	}
	
	private int findBestMove()
	{
		int square = 0;
		
//		code to find the best move goes here
		
		return square;
	}
}
























