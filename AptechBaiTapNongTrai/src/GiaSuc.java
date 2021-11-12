import java.util.Random;

public class GiaSuc 
{
//	Private fields
	private String tiengKeu;
	private int soLuongConCai;
	private double soLitSua;
	
//	Default constructor
	public GiaSuc() {}
	
//	Another constructor
	public GiaSuc(String tiengKeu,
					int slConCaiItNhat, int slConCaiNhieuNhat, 
					double soLitSuaItNhat, double soLitSuaCaoNhat)  
	{
		setTiengKeu(tiengKeu);
		setSoLuongConCai(slConCaiItNhat, slConCaiNhieuNhat);
		setSoLitSua(soLitSuaItNhat, soLitSuaCaoNhat);
	}
	
//	Getters
	public String getTiengKeu()
	{
		return this.tiengKeu;
	}
	
	public int getSoLuongConCai()
	{
		return this.soLuongConCai;
	}
	
	public double getSoLitSua()
	{
		return this.soLitSua;
	}
	
//	Setters
	public void setTiengKeu(String tiengKeu)
	{
		this.tiengKeu = tiengKeu;
	}
	
	public void setSoLuongConCai(int itNhat, int nhieuNhat)
	{
		this.soLuongConCai = getRandomInteger(itNhat, nhieuNhat);
	}
	
	public void setSoLitSua(double itNhat, double nhieuNhat)
	{
		this.soLitSua = getRandomDouble(itNhat, nhieuNhat);
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Tieng keu: ");
		builder.append(this.getTiengKeu());
		builder.append(", so luong con cai: ");
		builder.append(this.getSoLuongConCai());
		builder.append(", so lit sua: ");
		builder.append(String.format("%.2f", this.getSoLitSua()));
		builder.append(".\n");
		return builder.toString();
	}
	
//	Get a random double
	private double getRandomDouble(double low, double high)
	{
		return new Random().nextDouble() * (high - low) + low;
	}
	
//	Get a random integer
	private static int getRandomInteger(int low, int high)
	{
		return (int) (Math.random() * (high - low + 1)) + low;
	}
}


































