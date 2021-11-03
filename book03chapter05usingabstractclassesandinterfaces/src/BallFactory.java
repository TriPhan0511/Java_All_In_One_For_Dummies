
//public class BallFactory 
//{
//	public static Ball getBallInstance(String t)
//	{
//		if (t.equalsIgnoreCase("BaseBall"))
//		{
//			return new BaseBall();
//		}
//		if (t.equalsIgnoreCase("SoftBall"))
//		{
//			return new SoftBall();
//		}
//		return null;
//	}
//}


public class BallFactory 
{
//	Create a enum field
//	public enum BallType {BASEBALL, SOFTBALL}
	public static enum BallType {BASEBALL, SOFTBALL}
	
	public static Ball getBallInstance(BallType t) 
	{
		if (t == BallType.BASEBALL)
		{
			return new BaseBall();
		}
		if (t == BallType.SOFTBALL)
		{
			return new SoftBall();
		}
		return null;
	}
}
