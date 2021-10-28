import java.text.NumberFormat;

public class TestApp 
{
	public static void main(String[] args)
	{
//		Invoice i = new Invoice();
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(1234.56589));
	}
}
