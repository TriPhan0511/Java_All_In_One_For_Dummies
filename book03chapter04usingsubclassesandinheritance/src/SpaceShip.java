/* Final Method */

/*
 * A final method is a method that can't be overridden by a subclass.
 * To create a final method, you simply add the keyword final to the method declaration.
 * For example,
 * 
 * */

public class SpaceShip 
{
	private int velocity;
	
	public final int getVelocity()
	{
		return this.velocity;
	}
}


