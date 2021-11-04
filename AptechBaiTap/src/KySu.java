import java.util.Scanner;

public class KySu extends CanBo
{
	private String nganhDaoTao;
	
	public KySu(String hoTen, int tuoi, String s, String diaChi, String nganhDaoTao)
	{
		super(hoTen, tuoi, s, diaChi);
		setNganhDaoTao(nganhDaoTao);
	}
	
	public void setNganhDaoTao(String nganhDaoTao)
	{
//		Neu string truyen vao bang null hoac rong thi set this.nganhDaoTao cos gia tri la "chua biet"
		if (nganhDaoTao == null || nganhDaoTao.equals(""))
		{
			this.nganhDaoTao = "chua biet";
		}
		else
		{
			this.nganhDaoTao = nganhDaoTao;
		}
	}
	
//	Override the getCanBo method
	public CanBo getCanBo(Scanner sc) 
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
		System.out.print("Nganh dao tao ? ");
		String nganhDaoTao = sc.nextLine();
		
		return new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
	}	
	
//	Override the toString method
	public String toString()
	{
		return "\nKy Su: " + super.toString() + " " + this.nganhDaoTao;
	}
}
