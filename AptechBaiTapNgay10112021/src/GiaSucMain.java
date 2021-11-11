import java.util.ArrayList;
import java.util.Scanner;

public class GiaSucMain 
{
	private static Scanner sc = new Scanner(System.in);
	
	private ArrayList<ConBo> cacConBo = new ArrayList<>();
//	private ArrayList<ConCuu> cacConCuu = new ArrayList<>();
//	private ArrayList<ConDe> cacConDe = new ArrayList<>();
	
	public static void main(String[] args)
	{
		int slConBo = getInt(sc, "Nhap vao so luong con bo: ");
//		int slConCuu = getInt(sc, "Nhap vao so luong con cuu: ");
//		int slConDe = getInt(sc, "Nhap vao so luong con de: ");
		
		ArrayList<ConBo> cacConBo = getCacConConBo(slConBo);
//		ArrayList<ConCuu> cacConCuu = getCacConCuu(slConCuu);
//		ArrayList<ConDe> cacConDe = getCacConDe(slConDe);
		
		for (ConBo cb : cacConBo)
		{
			System.out.println(cb);
		}
	}
	
	private static ArrayList<ConCuu> getCacConCuu(int soLuong)
	{
		ArrayList<ConCuu> list = new ArrayList<>();
		for (int i = 0; i < soLuong; i++)
		{
			ConCuu gs = new ConCuu();
			list.add(gs);
		}
		return list;
	}
	
	private static ArrayList<ConDe> getCacConDe(int soLuong)
	{
		ArrayList<ConDe> list = new ArrayList<>();
		for (int i = 0; i < soLuong; i++)
		{
			ConDe gs = new ConDe();
			list.add(gs);
		}
		return list;
	}
	
	
	
	private static ArrayList<ConBo> getCacConConBo(int soLuong)
	{
		ArrayList<ConBo> list = new ArrayList<>();
		for (int i = 0; i < soLuong; i++)
		{
			ConBo gs = new ConBo();
			list.add(gs);
		}
		return list;
	}
	
	
	
	private static int getInt(Scanner sc, String msg)
	{
		int i;
		while (true)
		{
			try 
			{
				System.out.print(msg);
				String s = sc.nextLine();
				i = Integer.parseInt(s);
				if (i <= 0)
				{
					System.out.println("Vui long nhap vao mot so nguyen lon hon 0.");
					continue;
				}
				return i;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Vui long nhap vao mot so nguyen lon hon 0.");
			}
		}

	}
}

























