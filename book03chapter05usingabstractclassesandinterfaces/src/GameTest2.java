
public class GameTest2 
{
	public static void main(String[] args)
	{
//		Dealable d = new CardDeck();
//		startGame(d, "Hearts");
////		-> Cards = 13
		
		CardDeck d = new CardDeck();
		startGame(d, "Hearts");
//		-> Cards = 13
		
	}
	
	private static void startGame(Dealable deck, String game)
	{
		if (game.equals("Poker"))
		{
			deck.deal(5);
		}
		else if (game.equals("Hearts"))
		{
			deck.deal(13);
		}
		else if (game.equals("Gin"))
		{
			deck.deal(10);
		}
	}
}

class CardDeck implements Dealable
{
	public void deal(int cards)
	{
		System.out.println("Cards = " + cards);
	}
}
