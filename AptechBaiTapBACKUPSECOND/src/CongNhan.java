import java.util.Scanner;

public class CongNhan extends CanBo 
{
	private int bac;
	
	public CongNhan() {}
	
	public CongNhan(String hoTen, int tuoi, String s, String diaChi, int bac)
	{
		super(hoTen, tuoi, s, diaChi);
		setBac(bac);
	}
	
	public void setBac(int bac)
	{
//		Bac nam trong khoang tu 1 de 10
		if (bac < 1)
		{
			this.bac = 1;
		}
		else if (bac > 10)
		{
			this.bac = 10;
		}
		else
		{
			this.bac = bac;
		}
	}
	
//	Override the setInfo method
	public void setInfo(Scanner sc)
	{
		super.setInfo(sc);
		int bac = Utilities.getInteger("Bac: ", sc);
		setBac(bac);
	}
	
//	Override the toString method
	public String toString()
	{
		return "Cong Nhan: " + super.toString() + " " + this.bac;
	}

}
























