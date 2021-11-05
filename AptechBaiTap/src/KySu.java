import java.util.Scanner;

public class KySu extends CanBo
{
	private String nganhDaoTao;
	
	public KySu() {}
	
	public KySu(String hoTen, int tuoi, String s, String diaChi, String nganhDaoTao)
	{
		super(hoTen, tuoi, s, diaChi);
		setNganhDaoTao(nganhDaoTao);
	}
	
	public void setNganhDaoTao(String nganhDaoTao)
	{
		this.nganhDaoTao = setDefaultValue(nganhDaoTao);
	}
	
	
//	Override the setInfo method
	public void setInfo(Scanner sc)
	{
		super.setInfo(sc);
		String nganhDaoTao = Utilities.getString("Nganh dao tao: ", sc);
		setNganhDaoTao(nganhDaoTao);
	}	
	
//	Override the toString method
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Ky Su: \n");
		builder.append(super.toString());
		builder.append(",\n  nganh dao tao: ");
		builder.append(this.nganhDaoTao);
		builder.append(".");
		
		return builder.toString();
	}
}













