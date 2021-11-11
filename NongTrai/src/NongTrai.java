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
	
//	Get the cattles' sound
	private static void tiengKeuCuaGiaSuc()
	{
		System.out.println("\n=== Nhung tieng keu ban se duoc nghe khi cac con vat bi doi ===\n");
		System.out.println("Con Bo: " + ConBo.tiengKeu);
		System.out.println("Con Cuu: " + ConCuu.tiengKeu);
		System.out.println("Con De: " + ConDe.tiengKeu);
	}
	
//	Create a farm
	private static void lapTrangTrai()
	{
		System.out.println("\nChao Mung Den Voi Nong Trai Nuoi Bo, Cuu va De!\n");
		System.out.println("Vui long nhap so luong cac loai gia suc "
				+ "\nde thanh lap nong trai.\n");
		danBo = setDanBo("Ban muon co bao nhieu con bo? " , sc);
		danCuu = setDanCuu("Bao nhieu con cuu? ", sc);
		danDe = setDanDe("Va bao nhieu con de? ", sc);
	}
	
//	Display information about the farm
	private static void hienThiThongTinCuaTrangTrai()
	{
		System.out.println("\n===== Thong Tin Ve Trang Trai =====\n");
		hienThiDanGiaSuc(danBo);
		hienThiDanGiaSuc(danCuu);
		hienThiDanGiaSuc(danDe);
	}
	
//	Display the content of an ArrayList which contains some GiaSuc's subclass instances
	private static void hienThiDanGiaSuc(ArrayList<GiaSuc> danGiaSuc)
	{	
		int tongSoLuongGiaSucCon = 0;
		double tongSoLitSua = 0;
		String chitiet = "";
		for (GiaSuc gs : danGiaSuc)
		{
			tongSoLuongGiaSucCon += gs.getSoLuongConCai();
			tongSoLitSua += gs.getSoLitSua();
			int viTri = danGiaSuc.indexOf(gs);
			chitiet += viTri + 1;
			chitiet += ".";
			chitiet += gs;
		}
		String loai = "";
		GiaSuc gs = danGiaSuc.get(0);
		if (gs instanceof ConBo)
		{
			loai = "Bo";
		}
		else if (gs instanceof ConCuu)
		{
			loai = "Cuu";
		}
		else if (gs instanceof ConDe)
		{
			loai = "De";
		}
		System.out.printf("Dan %s Co %d Con.\n", loai, danGiaSuc.size());
		System.out.printf("So Luong %s Con Duoc Sinh Ra: %d\n", loai, tongSoLuongGiaSucCon);
		System.out.printf("So Lit Sua Thu Duoc: %.2f\n", tongSoLitSua);
		System.out.printf("Chi Tiet Ve Dan %s:\n%s\n", loai, chitiet);
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
