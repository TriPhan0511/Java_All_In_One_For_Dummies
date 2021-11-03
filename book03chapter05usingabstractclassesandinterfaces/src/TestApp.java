
public class TestApp 
{
//	public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}
	
//	public enum BallType {BABSEBALL, SOFTBALL}
	
	public static void main(String[] args)
	{
//		String userChoice = "baseball";
//		Ball b1 = BallFactory.getBallInstance(userChoice);
//		b1.hit(0);
////		-> Hello from BaseBall.
//		
//		userChoice = "softball";
//		Ball b2 = BallFactory.getBallInstance(userChoice);
//		b2.hit(0);
////		-> Hello from SoftBall.
//		
//		userChoice = "abc";
//		Ball b3 = BallFactory.getBallInstance(userChoice);
//		if (b3 == null) {
//			System.out.println("Yes, is null.");
//		}
////		-> Yes, is null.
		
//		----------------------------------------------------------------
		
//		CardSuit suit;
//		suit = CardSuit.DIAMONDS;
//		suit = CardSuit.CLUBS;
//		
//		if (suit == CardSuit.DIAMONDS)
//		{
//			System.out.println("Diamonds");
//		}
//		else
//		{
//			System.out.println("No");
//		}
		
//		----------------------------------------------------------------
		
		Ball b1 = BallFactory.getBallInstance(BallFactory.BallType.BASEBALL);
		b1.hit(0);
//		-> Hello from BaseBall.
		
		Ball b2 = BallFactory.getBallInstance(BallFactory.BallType.SOFTBALL);
		b2.hit(0);
//		-> Hello from SoftBall.
	}
				
}





























