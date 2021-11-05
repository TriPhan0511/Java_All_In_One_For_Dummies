import java.util.Scanner;

public class CongNhan extends CanBo 
{
	private int bac;
	
	public CongNhan() 
	{
		super();
	}
	
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
	
	public CanBo getCongNhan(Scanner sc) 
	{
//		Lay thong tin tu user
		System.out.print("Ho Ten ? ");
		String hoTen = sc.nextLine();
		System.out.print("Tuoi ? ");
		int tuoi = sc.nextInt();
		System.out.print("Gioi Tinh ? ");
		String gioiTinh = sc.nextLine();
		System.out.print("Dia Chi ? ");
		String diaChi = sc.nextLine();
		System.out.print("Bac ? ");
		int bac = sc.nextInt();
		
		return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
	}
	
//	Override the toString method
	public String toString()
	{
		return "Cong Nhan: " + super.toString() + " " + this.bac;
	}

}
























