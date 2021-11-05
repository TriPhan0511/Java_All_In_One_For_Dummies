import java.util.Scanner;

public class CanBo 
{
//	Private fields
	private String hoTen;
	private int tuoi;
	private GioiTinh gt;
	private String diaChi;
	
//	A default constructor
	public CanBo() {}
	
//	Another constructor
	public CanBo(String hoTen, int tuoi, String s, String diaChi)
	{
//		this.hoTen = setString(hoTen);
		setHoTen(hoTen);
		setTuoi(tuoi);
		setGioiTinh(s);
//		this.diaChi = setString(diaChi);
		setDiaChi(diaChi);
	}
	
//	Some setters
	public void setHoTen(String hoTen)
	{
		this.hoTen = setString(hoTen);
	}
	
	public void setTuoi(int tuoi)
	{
//		Tu 18 tuoi tro len moi duoc lam can bo
		if(tuoi < 18)
		{
			this.tuoi = 18;
		}
		else
		{
			this.tuoi = tuoi;
		}
	}
	
	public void setGioiTinh(String s)
	{
		if (s.equalsIgnoreCase("Nam"))
		{
			this.gt = GioiTinh.NAM;
		}
		else if (s.equalsIgnoreCase("Nu"))
		{
			this.gt = GioiTinh.NU;
		}
		else
		{
			this.gt = GioiTinh.KHAC;
		}
	}
	
	public void setDiaChi(String diaChi)
	{
		this.diaChi = setString(diaChi);
	}
	
//	Getter
	public String getHoTen()
	{
		return this.hoTen;
	}
	
//	Override the toString method
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(this.hoTen);
		builder.append(" ");
		builder.append(this.tuoi);
		builder.append(" ");
		builder.append(parseGioiTinh(this.gt));
		builder.append(" ");
		builder.append(diaChi);
		
		return builder.toString();
	}
	
	private String parseGioiTinh(GioiTinh gt)
	{
		String s;
		switch(gt)
		{
		case NAM:
			s = "Nam";
			break;
		case NU:
			s = "Nu";
			break;
		default:
			s = "Khac";
			break;
		}
		return s;
	}
	
	public String setString(String s)
	{
//		Neu string truyen vao bang null hoac rong thi tra ve gia tri la "Chua biet"
		if(s == null || s.equals(""))
		{
			return "Chua biet";
		}
		return s;
	}
	
	public void setInfo(Scanner sc)
	{
//		Gets user input
		String hoTen = Utilities.getString("Ho Ten: ", sc);
		int tuoi = Utilities.getInteger("Tuoi: ", sc);
		String gioiTinh = Utilities.getString("Gioi tinh: ", sc);
		String diaChi = Utilities.getString("Dia chi: ", sc);
		
//		Calls the setters
		setHoTen(hoTen);
		setTuoi(tuoi);
		setGioiTinh(gioiTinh);
		setDiaChi(diaChi);
	}
}




























