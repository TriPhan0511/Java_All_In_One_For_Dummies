
public class ConCuu extends GiaSuc
{
//	A class variable
	public static String tiengKeu = "hehehe";
	
//	Default constructor
	public ConCuu() 
	{
		setTiengKeu(tiengKeu);
	}
	
//	Another constructor
	public ConCuu(int slConCaiItNhat, int slConCaiNhieuNhat, 
					double soLitSuaItNhat, double soLitSuaCaoNhat)
	{
		super(tiengKeu, slConCaiItNhat, slConCaiNhieuNhat, 
				soLitSuaItNhat, soLitSuaCaoNhat);
	}
}
