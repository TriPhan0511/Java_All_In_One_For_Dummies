
public class ActorTest 
{
	public static void main(String[] args)
	{
		Actor a = new Actor("Brad", "Pitt", true);
		
//		System.out.println(a.intro());
////		-> My name's Pitt Brad.
//		System.out.println(a.intro2());
////		-> My name's Pitt Brad.And I am a good actor.
		
		a.printMe();
	}
}
