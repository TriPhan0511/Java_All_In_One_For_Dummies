
public class BallFactory 
{
	public static Ball getBallInstance(BallType type)
	{
		switch (type)
		{
		case BASEBALL:
			return new BaseBall();
		case SOFTBALL:
			return new SoftBall();
		default:
			return null;
		}
	}
}






















