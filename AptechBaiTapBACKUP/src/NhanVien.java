
public class NhanVien extends CanBo 
{
	private String congViec;
	
	public NhanVien(String hoTen, int tuoi, String s, String diaChi, String congViec)
	{
		super(hoTen, tuoi, s, diaChi);
		setCongViec(congViec);
	}
	
	public void setCongViec(String congViec)
	{
//		Neu string truyen vao bang null hoac rong thi set this.nganhDaoTao cos gia tri la "chua biet"
		if (congViec == null || congViec.equals(""))
		{
			this.congViec = "chua biet";
		}
		else
		{
			this.congViec = congViec;
		}
	}

//	Override the toString method
	public String toString()
	{
		return "Nhan Vien: " + super.toString() + " " + this.congViec;
	}	
}
