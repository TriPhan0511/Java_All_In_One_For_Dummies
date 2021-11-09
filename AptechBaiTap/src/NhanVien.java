import java.util.Scanner;

public class NhanVien extends CanBo 
{
	private String congViec;
	
	public NhanVien() {}
	
	public NhanVien(String hoTen, int tuoi, String s, String diaChi, String congViec)
	{
		super(hoTen, tuoi, s, diaChi);
		setCongViec(congViec);
	}
	
	public void setCongViec(String congViec)
	{
		this.congViec =setDefaultValue(congViec);
	}
	
//	Override the setInfo method
	public void setInfo(Scanner sc)
	{
		super.setInfo(sc);
		String congViec = Utilities.getString("Cong viec: ", sc);
		setCongViec(congViec);
	}	

//	Override the toString method
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Nhan Vien: \n");
		builder.append(super.toString());
		builder.append(",\n  cong viec: ");
		builder.append(this.congViec);
		builder.append(".");
		
		return builder.toString();
	}
}























