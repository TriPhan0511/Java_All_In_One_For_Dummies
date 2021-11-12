import java.util.ArrayList;
import java.util.Scanner;

/* Bai Tap Ngay 10/11/2021 */

public class NongTrai 
{
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<GiaSuc> danBo;
	private static ArrayList<GiaSuc> danCuu;
	private static ArrayList<GiaSuc> danDe;

	public static void main(String[] args)
	{
//		Calls the lapTrangTrai method to create a farm
		lapTrangTrai();
//		Get the information about the farm
		String choice;
		do
		{
			System.out.print("\nBan Co Muon Tra Cuu Thong Tin Ve Trang Trai? \n\n"
					+ "Bam phim 1 de nghe tieng keu cua cac con vat khi doi.\n"
					+ "Bam phim 2 de biet thong tin tong quat ve trang trai.\n"
					+ "Bam bat cu phim nao de thoat khoi chuong trinh.\n\n"
					+ "Lua chon cua ban? ");
			choice = sc.nextLine();
			switch(choice)
			{
				case "1":
					tiengKeuCuaGiaSuc();
					break;
				case "2":
					hienThiThongTinCuaTrangTrai();
					break;
				default:
					break;
			}
		} while (choice.equals("1") || choice.equals("2"));
		System.out.println("\nChao ban, hen gap lai!");
	}
	
//	Create a farm
	private static void lapTrangTrai()
	{
		System.out.println("\nChao Mung Den Voi Nong Trai Nuoi Gia Suc!\n");
		System.out.println("Vui long nhap so luong cac loai gia suc "
				+ "\nde thanh lap nong trai.\n");
		danBo = setDanGiaSuc(sc, "Bo");
		danCuu = setDanGiaSuc(sc, "Cuu");
		danDe = setDanGiaSuc(sc, "De");
	}
	
//	Create a list of ConBo's instances
	private static ArrayList<GiaSuc> setDanGiaSuc(Scanner sc, String t)
	{
		String msg = "Ban muon co bao nhieu con ";
		msg += t.toLowerCase();
		msg += "? ";
		
		int soLuong = getSoLuongDanGiaSuc(msg, sc);
		ArrayList<GiaSuc> danGiaSuc = new ArrayList<>();
		for (int i = 0; i < soLuong; i++)
		{
			GiaSuc gs = getGiaSuc(t);
			if (gs == null)
			{
				System.out.println("Null");
				break;
			}
			danGiaSuc.add(gs);
		}
		return danGiaSuc;
	}	
	
//	Display information about the farm
	private static void hienThiThongTinCuaTrangTrai()
	{
		System.out.println("\n===== Thong Tin Ve Trang Trai =====\n");
		hienThiDanGiaSuc(danBo);
		hienThiDanGiaSuc(danCuu);
		hienThiDanGiaSuc(danDe);
	}
	
//	Display the content of an ArrayList which 
//	contains some GiaSuc's subclass instances
	private static void hienThiDanGiaSuc(ArrayList<GiaSuc> danGiaSuc)
	{	
		if (danGiaSuc.size() != 0)
		{
			int tongSoLuongGiaSucCon = 0;
			double tongSoLitSua = 0;
			String chitiet = "";
			int viTri = 1;
			int soLuongDanGiaSuc = 0;
			GiaSuc g = null;
			for (GiaSuc gs : danGiaSuc)
			{
				if (gs != null)
				{
					tongSoLuongGiaSucCon += gs.getSoLuongConCai();
					tongSoLitSua += gs.getSoLitSua();
					chitiet += viTri;
					chitiet += ".";
					chitiet += gs;
					viTri++;
					soLuongDanGiaSuc++;
					g = gs;
				}
				
			}
			String loai = "";
			if (g instanceof ConBo)
			{
				loai = "Bo";
			}
			else if (g instanceof ConCuu)
			{
				loai = "Cuu";
			}
			else if (g instanceof ConDe)
			{
				loai = "De";
			}
			else
			{
				loai = "Gia Suc";
			}
				
			System.out.printf("Dan %s Co %d Con.\n", loai, soLuongDanGiaSuc);
			System.out.printf("So Luong %s Con Duoc Sinh Ra: %d\n", 
								loai, tongSoLuongGiaSucCon);
			System.out.printf("So Lit Sua Thu Duoc: %.2f\n", tongSoLitSua);
			System.out.printf("Chi Tiet Ve Dan %s:\n%s\n", loai, chitiet);
		}
	}
	
//	Get a GiaSuc's subclass instances
	private static GiaSuc getGiaSuc(String t)
	{
		if (t.equalsIgnoreCase("Bo"))
		{
			return new ConBo(1, 1, 0.0, 20.0);
		}
		else if (t.equalsIgnoreCase("Cuu"))
		{
			return new ConCuu(1, 1, 0.0, 5.0);
		}
		else if (t.equalsIgnoreCase("De"))
		{
			return new ConDe(1, 1, 0.0, 10.0);
		}
		return null;
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
	
//	Get the cattles' sound
	private static void tiengKeuCuaGiaSuc()
	{
		System.out.println("\n=== Nhung tieng keu ban se duoc nghe "
				+ "khi cac con vat bi doi ===\n");
		System.out.println("Con Bo: " + ConBo.tiengKeu);
		System.out.println("Con Cuu: " + ConCuu.tiengKeu);
		System.out.println("Con De: " + ConDe.tiengKeu);
	}	
}

























