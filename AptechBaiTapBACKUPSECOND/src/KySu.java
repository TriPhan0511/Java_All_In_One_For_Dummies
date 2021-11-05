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
		this.nganhDaoTao = setString(nganhDaoTao);
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
		return "Ky Su: " + super.toString() + " " + this.nganhDaoTao;
	}
}
