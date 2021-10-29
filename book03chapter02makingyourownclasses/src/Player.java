
public class Player 
{
//	A private field
	private int health;
	
//	Getter
	public int getHealth()
	{
		return health;
	}
	
//	Setter
	public void setHealth(int h)
	{
		if (h < 0)
		{
			health = 0;
		}
		else if (h > 100)
		{
			health = 100;
		}
		else
		{
			health = h;
		}
	}
}
