
public class PlayerTest 
{
	static Player p1 = new Player();
	
//	public static void startGame()
//	{
//		p1.setHealth(0);
//		System.out.printf("At the beginning, health = %d", p1.getHealth());
//	}
//	
//	public static void train()
//	{
//		p1.setHealth(100);
//		System.out.printf("\nAfter training, health = %d", p1.getHealth());
//	}
	
	public static void main(String[] args)
	{
//		startGame();
//		train();
//		System.out.printf("\nNow, health = %d", p1.getHealth());
		
//		Player p2 = new Player();
//		p2.setHealth(20);
//		System.out.println(p2.getHealth());
		
		Player p3 = new Player();
		System.out.println(p3.getHealth());
		
		p3.setHealth(90);
		System.out.println(p3.getHealth()); // -> 90
		
		p3.setHealth(-10);
		System.out.println(p3.getHealth()); // -> 0
		
		p3.setHealth(200);
		System.out.println(p3.getHealth()); // -> 100
	}
	
	
}





















