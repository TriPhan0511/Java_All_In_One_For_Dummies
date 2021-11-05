
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
		this.hoTen = setString(hoTen);
		setTuoi(tuoi);
		setGioiTinh(s);
		this.diaChi = setString(diaChi);
	}
	
//	Some setters
	private String setString(String s)
	{
//		Neu string truyen vao bang null hoac rong thi tra ve gia tri la "Chua biet"
		if(s == null || s.equals(""))
		{
			return "Chua biet";
		}
		return s;
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
}




























