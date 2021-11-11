
public class ConBo extends GiaSuc 
{
//	A class variable
	public static String tiengKeu = "booo";
	
//	Default constructor
	public ConBo() 
	{
		setTiengKeu(tiengKeu);
	}
	
//	Another constructor
	public ConBo(int slConCaiItNhat, int slConCaiNhieuNhat, 
					double soLitSuaItNhat, double soLitSuaCaoNhat)
	{
		super(tiengKeu, slConCaiItNhat, slConCaiNhieuNhat, 
				soLitSuaItNhat, soLitSuaCaoNhat);
	}
}



