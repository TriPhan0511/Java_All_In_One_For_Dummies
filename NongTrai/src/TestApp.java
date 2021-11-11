import java.util.ArrayList;
import java.util.Scanner;

public class TestApp 
{
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<GiaSuc> danBo;
	private static ArrayList<GiaSuc> danCuu;
	private static ArrayList<GiaSuc> danDe;
	
	public static void main(String[] args)
	{
		danBo = setDanBo("Dan Bo co bao nhieu con? ", sc);
		danCuu = setDanCuu("Dan Cuu co bao nhieu con? ", sc);
		danDe = setDanDe("Dan De co bao nhieu con? ", sc);
		
		displayDanGiaSuc(danBo);
		displayDanGiaSuc(danCuu);
		displayDanGiaSuc(danDe);
	}
	
//	Display the content of an ArrayList which contains some GiaSuc's subclass instances
	private static void displayDanGiaSuc(ArrayList<GiaSuc> danGiaSuc)
	{	
		int tongSoLuongGiaSucCon = 0;
		double tongSoLitSua = 0;
		String chitiet = "";
		for (GiaSuc gs : danGiaSuc)
		{
			tongSoLuongGiaSucCon += gs.getSoLuongConCai();
			tongSoLitSua += gs.getSoLitSua();
			chitiet += gs;
		}
		System.out.printf("\nSo Luong Gia Suc Trong Dan: %d\n", danGiaSuc.size());
		System.out.printf("So Luong Gia Suc Con Duoc Sinh Ra: %d\n", tongSoLuongGiaSucCon);
		System.out.printf("So Lit Sua Thu Duoc: %.2f\n", tongSoLitSua);
		System.out.println("Chi Tiet Ve Dan Gia Suc:\n" + chitiet);
	}
	
//	Create a list of ConBo's instances
	private static ArrayList<GiaSuc> setDanBo(String msg, Scanner sc)
	{
		int soLuong = getSoLuongDanGiaSuc(msg, sc);
		ArrayList<GiaSuc> danBo = new ArrayList<>();
		for (int i = 0; i < soLuong; i++)
		{
			GiaSuc gs = new ConBo(1, 1, 0.0, 20.0);
			danBo.add(gs);
		}
		return danBo;
	}
	
//	Create a list of ConCuu's instances
	private static ArrayList<GiaSuc> setDanCuu(String msg, Scanner sc)
	{
		int soLuong = getSoLuongDanGiaSuc(msg, sc);
		ArrayList<GiaSuc> danCuu = new ArrayList<>();
		for (int i = 0; i < soLuong; i++)
		{
			GiaSuc gs = new ConCuu(1, 1, 0, 5);
			danCuu.add(gs);
		}
		return danCuu;
	}	
	
//	Create a list of ConDe's instances
	private static ArrayList<GiaSuc> setDanDe(String msg, Scanner sc)
	{
		int soLuong = getSoLuongDanGiaSuc(msg, sc);
		ArrayList<GiaSuc> danDe = new ArrayList<>();
		for (int i = 0; i < soLuong; i++)
		{
			GiaSuc gs = new ConDe(1, 1, 0, 10);
			danDe.add(gs);
		}
		return danDe;
	}	
	
//	Get quantity 
	private static int getSoLuongDanGiaSuc(String msg, Scanner sc)
	{
		while (true)
		{
			System.out.print(msg);
			String s;
			int i;
			try
			{
				s = sc.nextLine();
				i = Integer.parseInt(s);
				if (i <= 0)
				{
					System.out.println("So luong gia suc phai lon hon 0.");
					continue;
				}
				return i;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Nhap vao mot so nguyen.");
			}
		}
	}	
}
