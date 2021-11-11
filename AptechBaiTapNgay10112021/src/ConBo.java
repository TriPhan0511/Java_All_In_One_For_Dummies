
public class ConBo extends GiaSuc 
{
	public ConBo()
	{
		setTiengKeu("bo```");
		setSoLuongConCai(1, 5);;
		setSua(0, 20);
	}
	
//	public ConBo(int slCCItNhat, int sllCCNhieuNhat, 
//			int slSuaItNhat, int slSuaNhieuNhat, 
//			String tiengKeu) 
//	{
//		super(slCCItNhat, sllCCNhieuNhat, slSuaItNhat, slSuaNhieuNhat, tiengKeu);
//	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Con Bo: ");
		builder.append("Tieng keu: ");
		builder.append(getTiengKeu());
		builder.append(", So Luong Con Cai: ");
		builder.append(getSoLuongConCai());
		builder.append(", So Lit Sua: ");
		builder.append(getSua());
		builder.append(".");
		
		return builder.toString();
	}
}
	

