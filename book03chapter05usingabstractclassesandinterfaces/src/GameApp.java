
public class GameApp 
{
	public static void main(String[] args)
	{
		Player p1 = new Player();
		Player p2 = new BetterPlayer();
		
//		play(p1, p2);
////		-> A normal player is moving...
////		-> A better player is moving...

		play(new BetterPlayer(), new BestPlayer());
//		-> A better player is moving...
//		-> The best player is moving...
	}
	
	private static void play(Player p1, Player p2)
	{
		p1.move();
		p2.move();
	}
}

class Player
{
	public void move()
	{
		System.out.println("A normal player is moving...");
	}
}

class BetterPlayer extends Player
{
	public void move()
	{
		System.out.println("A better player is moving...");
	}
}

class BestPlayer extends Player
{
	public void move()
	{
		System.out.println("The best player is moving...");
	}
}


























