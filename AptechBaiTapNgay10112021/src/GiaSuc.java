
public class GiaSuc 
{
	private int soLuongConCai;
	private int sua;
	private String tiengKeu;
	
	public GiaSuc() {}
	
//	public GiaSuc(int slCCItNhat, int sllCCNhieuNhat, 
//			int slSuaItNhat, int slSuaNhieuNhat, 
//			String tiengKeu) 
//	{
//		
//		setSoLuongConCai(slCCItNhat, sllCCNhieuNhat);
//		setSua(slSuaItNhat, slSuaNhieuNhat);
//		setTiengKeu(tiengKeu);
//	}

	public double getSua() 
	{
		return sua;
	}

	public void setSua(int itNhat, int nhieuNhat) 
	{
		this.sua = getRandomNumber(itNhat, nhieuNhat);
	}

	public String getTiengKeu() 
	{
		return tiengKeu;
	}

	public void setTiengKeu(String tiengKeu) 
	{
		this.tiengKeu = tiengKeu;
	}
	
	public void setSoLuongConCai(int itNhat, int nhieuNhat)
	{
		this.soLuongConCai = getRandomNumber(itNhat, nhieuNhat);
	}

	public int getSoLuongConCai() 
	{
		return soLuongConCai;
	}
	
//	Return a random number between low and high
	private static int getRandomNumber(int low, int high)
	{
		return (int) (Math.random() * (high - low + 1)) + low;
	}
	
}
























