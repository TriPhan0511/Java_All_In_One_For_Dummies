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
		setHoTen(hoTen);
		setTuoi(tuoi);
		setGioiTinh(s);
		setDiaChi(diaChi);
	}
	
	public void setHoTen(String hoTen)
	{
		this.hoTen = setDefaultValue(hoTen);
	}
	
	public void setTuoi(int tuoi)
	{
//		Make sure the value of the "tuoi" field is always greater than or equal to 18
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
		this.diaChi = setDefaultValue(diaChi);
	}
	
//	Getter
	public String getHoTen()
	{
		return this.hoTen;
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
	
	public String setDefaultValue(String s)
	{
		if(s == null || s.equals(""))
		{
			return "Not Known";
		}
		return s;
	}
	
	public void setInfo(Scanner sc)
	{
//		Gets user input
		String hoTen = Utilities.getString("Ho Ten: ", sc);
		int tuoi = validateTuoi(sc);
		String gioiTinh = Utilities.getString("Gioi tinh: ", sc);
		String diaChi = Utilities.getString("Dia chi: ", sc);
		
//		Calls the setters
		setHoTen(hoTen);
		setTuoi(tuoi);
		setGioiTinh(gioiTinh);
		setDiaChi(diaChi);
	}
	
	private int validateTuoi(Scanner sc)
	{
		int tuoi;
		while (true)
		{
			tuoi = Utilities.getInteger("Tuoi (be greater than or equal to 18): ", sc);
			if (tuoi < 18)
			{
				System.out.println("You should enter a number which be greater than or "
									+ "equal to 18. Try again.");
			}
			else
			{ 
				return tuoi;
			}
		}
	}
	
//	Override the toString method
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("  Ho ten: ");
		builder.append(this.hoTen);
		builder.append(", tuoi: ");
		builder.append(this.tuoi);
		builder.append(", \n  gioi tinh: ");
		builder.append(parseGioiTinh(this.gt));
		builder.append(", dia chi: ");
		builder.append(diaChi);
		
		return builder.toString();
	}
}



























