//import java.util.*;
//
//public class QuanLyCanBo 
//{
//	public static ArrayList<CanBo> list = new ArrayList<>();
//	public static Scanner sc = new Scanner(System.in);
//	
//	public static void main(String[] args)
//	{
////	Dummy data
//	CongNhan cn1 =  new CongNhan("alex ferguson", 40, "nam", "England", 5);
//	list.add(cn1);
//	CongNhan cn2 = new CongNhan("Dennis Beckamp", 45, "nam", "Netherland", 0);
//	list.add(cn2);
//	CongNhan cn3 = new CongNhan("Alex Ferguson", 32, "nam", "Argentina", 100000);
//	list.add(cn3);
//	
//	KySu ks1 = new KySu("Bryan Adams", 50, "nam", "America", "Cong nghe thong tin"); 
//	list.add(ks1);
//	
//	NhanVien nv1 = new NhanVien("alex ferguson", 50, "nu", "America", "Thu ky");
//	list.add(nv1);
//	
////		------------------------------------------------------------------------------------
//		
//		System.out.println("\nAloha, I am an employee manager. May I help you?");
//		int choice = 0;
//		while (true && choice != 4)
//		{
//			System.out.println("\n********** Main Menu ***********");
//			System.out.println("\nPress 1 to add a new employee to the list.\n"
//					+ "Press 2 to search employees based on their names.\n"
//					+ "Press 3 to display the information of all employees.\n"
//					+ "Press 4 to say goodbye to me.");
//			choice = Utilities.getInteger("\nYour choice: ", sc);
//			switch (choice)
//			{
//				case 1: 
//	//				Call the addItem method to add an object to the list
//					addItem();				
//					break;
//				case 2:
//	//				Calls the find method to find a CanBo based on hoTen field
//					findBasedOnHoTen(list);
//					break;
//				case 3:
//	//				Calls the displayItems method to show the information in the list
//					displayItems(list);
//					break;
//				case 4:
//					System.out.println("\nI hope I were useful for you.\nGoobye. See you soon!");
//					break;
//				default:
//					System.out.println("\nWrong choice! Try again.");
//					break;
//			}
//		}
//	}
//	
//	private static void findBasedOnHoTen(ArrayList<CanBo> list)
//	{
//		String hoTen = Utilities.getString("Enter ho ten: ", sc);
//		
////		Call the getItems to get the list of CanBo meet the condition
//		ArrayList<CanBo> found = getItemsBasedOnHoTen(hoTen, list);
//		if (found.size() == 0)
//		{
//			System.out.println("\nResult: Not found.");
//			System.out.println("\nYou will be get back to the main menu...");
//		}
//		else
//		{
//			System.out.println("\nResult: Found!");
////			Call the displayItems method to show the result
//			displayItems(found);
//		}
//	}
//	
//	private static ArrayList<CanBo> getItemsBasedOnHoTen(String hoTen, ArrayList<CanBo> list) 
//	{
//		ArrayList<CanBo> result = new ArrayList<>();
//		for (CanBo cb: list)
//		{
//			if (cb.getHoTen().equalsIgnoreCase(hoTen))
//			{
//				result.add(cb);
//			}
//		}
//		
//		return result;
//	}
//	
//	private static void addItem()
//	{
//		System.out.println("\n----------- Enter a new employee to the list ------------------");
//		int choice = 0;
//		while (true && choice != 4)
//		{
//			
//			System.out.println("\nPress 1 to add a new CongNhan to the list.\n"
//					+ "Press 2 to add a new KySu to the list.\n"
//					+ "Press 3 to add a new NhanVien to the list.\n"
//					+ "Press 4 to exit.");
//			choice = Utilities.getInteger("\nWhich option do you want ?  ", sc);
//			switch(choice)
//			{
//				case 1:
//					System.out.println("\n***** Adding an CongNhan object to the list *****");
//					addItem(list, getCongNhan());				
//					break;
//				
//				case 2:
//					System.out.println("\n***** Adding an KySu object to the list *****");
//					addItem(list, getKySu());
//					break;
//				case 3:
//					System.out.println("\n***** Adding an NhanVien object to the list *****");
//					addItem(list, getNhanVien());
//					break;
//				case 4:
//					System.out.println("\nYou will be get back to the main menu...");
//					break;
//				default:
//					System.out.println("\nWrong choice. Try again.");
//					break;
//			}
//		}
//	}
//	
//	private static void displayItems(ArrayList<CanBo> list)
//	{
//		System.out.println("\n----------- Information of employee(s) ------------------\n");
//		for (CanBo cb: list)
//		{
//			System.out.println(cb);
//		}
//		System.out.println("\nYou will be get back to the main menu...");
//	}
//	
//	private static void addItem(ArrayList<CanBo> list, CanBo cb)
//	{
//		list.add(cb);
//	}
//	
//	public static CongNhan getCongNhan() 
//	{
////		Get user input
//		String hoTen = Utilities.getString("Ho Ten: ", sc);
//		int tuoi = Utilities.getInteger("Tuoi: ", sc);
//		String gioiTinh = Utilities.getString("Gioi tinh: ", sc);
//		String diaChi = Utilities.getString("Dia chi: ", sc);
//		int bac = Utilities.getInteger("Bac: ", sc);
//		
//		return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
//	}
//	
//	public static KySu getKySu() 
//	{
////		Get user input
//		String hoTen = Utilities.getString("Ho Ten: ", sc);
//		int tuoi = Utilities.getInteger("Tuoi: ", sc);
//		String gioiTinh = Utilities.getString("Gioi tinh: ", sc);
//		String diaChi = Utilities.getString("Dia chi: ", sc);
//		String nganhDaoTao = Utilities.getString("Nganh dao tao: ", sc);
//		
//		return new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
//	}
//	
//	public static NhanVien getNhanVien() 
//	{
////		Get user input
//		String hoTen = Utilities.getString("Ho Ten: ", sc);
//		int tuoi = Utilities.getInteger("Tuoi: ", sc);
//		String gioiTinh = Utilities.getString("Gioi tinh: ", sc);
//		String diaChi = Utilities.getString("Dia chi: ", sc);
//		String congViec = Utilities.getString("Cong viec: ", sc);
//		
//		return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
//	}
//}

//---------------------------------------------------------------------------------------------------------

//import java.util.Scanner;
//
//public class QuanLyCanBo
//{
//	private static Scanner sc = new Scanner(System.in);
//	
//	public static void main(String[] args)
//	{
////		CongNhan cn = new CongNhan();
////		cn.setInfo(sc);
////		System.out.println(cn);
//		
//////		KySu ks = new KySu("Brad", 50, "nam", "usa", "actor");
//////		KySu ks = new KySu("Brad", 50, "nam", "usa", "");
////		KySu ks = new KySu("Brad", 50, "nam", "usa", null);
////		System.out.println(ks);
//		
////		KySu ks = new KySu();
////		ks.setInfo(sc);
////		System.out.println(ks);
//		
////		NhanVien nv = new NhanVien("Jenifer Lopez", 12, "nu", "usa", "actrees");
////		System.out.println(nv);
//		
//		NhanVien nv = new NhanVien();
//		nv.setInfo(sc);
//		System.out.println(nv);
//	}
//}

//---------------------------------------------------------------------------------------------------------

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class QuanLyCanBo 
//{
//	public static ArrayList<CanBo> list = new ArrayList<>();
//	public static Scanner sc = new Scanner(System.in);
//	
//	public static void main(String[] args)
//	{
////	Dummy data
//		CongNhan cn1 =  new CongNhan("alex ferguson", 40, "nam", "England", 5);
//		list.add(cn1);
//		CongNhan cn2 = new CongNhan("Dennis Beckamp", 45, "nam", "Netherland", 0);
//		list.add(cn2);
//		CongNhan cn3 = new CongNhan("Alex Ferguson", 32, "nam", "Argentina", 100000);
//		list.add(cn3);
//		
//		KySu ks1 = new KySu("Bryan Adams", 50, "nam", "America", "Cong nghe thong tin"); 
//		list.add(ks1);
//		
//		NhanVien nv1 = new NhanVien("alex ferguson", 50, "nu", "America", "Thu ky");
//		list.add(nv1);
//		
////		------------------------------------------------------------------------------------
//		
//		System.out.println("\nAloha, I am an employee manager. May I help you?");
//		int choice = 0;
//		while (true && choice != 4)
//		{
//			System.out.println("\n********** Main Menu ***********");
//			System.out.println("\nPress 1 to add a new employee to the list.\n"
//					+ "Press 2 to search employees based on their names.\n"
//					+ "Press 3 to display the information of all employees.\n"
//					+ "Press 4 to say goodbye to me.");
//			choice = Utilities.getInteger("\nYour choice: ", sc);
//			switch (choice)
//			{
//			case 1: 
//				//				Call the addItem method to add an object to the list
//				addItems();				
//				break;
//			case 2:
//				//				Calls the find method to find a CanBo based on hoTen field
//				findBasedOnHoTen(list);
//				break;
//			case 3:
//				//				Calls the displayItems method to show the information in the list
//				displayItems(list);
//				break;
//			case 4:
//				System.out.println("\nI hope I were useful for you.\nGoobye. See you soon!");
//				break;
//			default:
//				System.out.println("\nWrong choice! Try again.");
//				break;
//			}
//		}
//	}
//	
//	private static void findBasedOnHoTen(ArrayList<CanBo> list)
//	{
//		String hoTen = Utilities.getString("Enter ho ten: ", sc);
//		
////		Call the getItems to get the list of CanBo meet the condition
//		ArrayList<CanBo> found = getItemsBasedOnHoTen(hoTen, list);
//		if (found.size() == 0)
//		{
//			System.out.println("\nResult: Not found.");
//			System.out.println("\nYou will be get back to the main menu...");
//		}
//		else
//		{
//			System.out.println("\nResult: Found!");
////			Call the displayItems method to show the result
//			displayItems(found);
//		}
//	}
//	
//	private static ArrayList<CanBo> getItemsBasedOnHoTen(String hoTen, ArrayList<CanBo> list) 
//	{
//		ArrayList<CanBo> result = new ArrayList<>();
//		for (CanBo cb: list)
//		{
//			if (cb.getHoTen().equalsIgnoreCase(hoTen))
//			{
//				result.add(cb);
//			}
//		}
//		
//		return result;
//	}
//	
//	private static void addItems()
//	{
//		System.out.println("\n----------- Enter a new employee to the list ------------------");
//		int choice = 0;
//		while (true && choice != 4)
//		{
//			
//			System.out.println("\nPress 1 to add a new CongNhan to the list.\n"
//					+ "Press 2 to add a new KySu to the list.\n"
//					+ "Press 3 to add a new NhanVien to the list.\n"
//					+ "Press 4 to exit.");
//			choice = Utilities.getInteger("\nWhich option do you want ?  ", sc);
//			switch(choice)
//			{
//			case 1:
//				System.out.println("\n***** Adding an CongNhan object to the list *****");
////					addItem(list, getCongNhan());				
//				addItem(list, getCanBo(new CongNhan()));				
//				break;
//				
//			case 2:
//				System.out.println("\n***** Adding an KySu object to the list *****");
////					addItem(list, getKySu());
//				addItem(list, getCanBo(new KySu()));	
//				break;
//			case 3:
//				System.out.println("\n***** Adding an NhanVien object to the list *****");
////					addItem(list, getNhanVien());
//				addItem(list, getCanBo(new NhanVien()));	
//				break;
//			case 4:
//				System.out.println("\nYou will be get back to the main menu...");
//				break;
//			default:
//				System.out.println("\nWrong choice. Try again.");
//				break;
//			}
//		}
//	}
//	
//	private static void addItem(ArrayList<CanBo> list, CanBo cb)
//	{
//		list.add(cb);
//	}
//	
//	private static void displayItems(ArrayList<CanBo> list)
//	{
//		System.out.println("\n----------- Information of employee(s) ------------------\n");
//		for (CanBo cb: list)
//		{
//			System.out.println(cb);
//		}
//		System.out.println("\nYou will be get back to the main menu...");
//	}
//	
//	public static CanBo getCanBo(CanBo cb)
//	{
//		cb.setInfo(sc);
//		return cb;
//	}
//}
//
////------------------------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo 
{
	public static ArrayList<CanBo> list = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
////		Dummy data
//		CongNhan cn1 =  new CongNhan("alex ferguson", 40, "nam", "England", 5);
//		list.add(cn1);
//		CongNhan cn2 = new CongNhan("Dennis Beckamp", 45, "nam", "Netherland", 0);
//		list.add(cn2);
//		CongNhan cn3 = new CongNhan("Alex Ferguson", 32, "nam", "Argentina", 100000);
//		list.add(cn3);
//		
//		KySu ks1 = new KySu("Bryan Adams", 50, "nam", "America", "Cong nghe thong tin"); 
//		list.add(ks1);
//		
//		NhanVien nv1 = new NhanVien("alex ferguson", 50, "nu", "America", "Thu ky");
//		list.add(nv1);
//		
//		displayItems(list);
			
//			---------------------------------------------------------------------------------
			
//		addItem(list, new CongNhan());
//		displayItems(list);
//		addItem(list, new KySu());
//		displayItems(list);
//		addItem(list, new NhanVien());
//		displayItems(list);
		
//		-------------------------------------------------------------------------------------
		
		System.out.println("\nAloha, I am an employee manager. May I help you?");
		int choice = 0;
		while (true && choice != 4)
		{
			System.out.println("\n********** Main Menu ***********");
			System.out.println("\nPress 1 to add a new employee to the list.\n"
					+ "Press 2 to search employees based on their names.\n"
					+ "Press 3 to display the information of all employees.\n"
					+ "Press 4 to say goodbye to me.");
			choice = Utilities.getInteger("\nYour choice: ", sc);
			switch (choice)
			{
			case 1: 
//				Calls the insertItemToList method to add an object to the list
				insertItemToList();				
				break;
			case 2:
//				Calls the find method to find a CanBo based on hoTen field
				findBasedOnHoTen(list);
				break;
			case 3:
//				Calls the displayItems method to show the information in the list
				displayItems(list);
				break;
			case 4:
				System.out.println("\nI hope I were useful for you.\nGoobye. See you soon!");
				break;
			default:
				System.out.println("\nWrong choice! Try again.");
				break;
			}
		}
	}
	
	private static void insertItemToList()
	{
		System.out.println("\n----------- Enter a new employee to the list ------------------");
		int choice = 0;
		while (true && choice != 4)
		{
			
			System.out.println("\nPress 1 to add a new CongNhan to the list.\n"
					+ "Press 2 to add a new KySu to the list.\n"
					+ "Press 3 to add a new NhanVien to the list.\n"
					+ "Press 4 to exit.");
			choice = Utilities.getInteger("\nWhich option do you want ?  ", sc);
			switch(choice)
			{
			case 1:
				System.out.println("\n***** Adding an CongNhan object to the list *****");
				addItem(list, new CongNhan());
				break;
				
			case 2:
				System.out.println("\n***** Adding an KySu object to the list *****");
				addItem(list, new KySu());
				break;
			case 3:
				System.out.println("\n***** Adding an NhanVien object to the list *****");
				addItem(list, new NhanVien());
				break;
			case 4:
				System.out.println("\nYou will be get back to the main menu...");
				break;
			default:
				System.out.println("\nWrong choice. Try again.");
				break;
			}
		}
	}
	
	private static void addItem(ArrayList<CanBo> list, CanBo cb)
	{
		cb.setInfo(sc);
		list.add(cb);
	}
	
	private static void findBasedOnHoTen(ArrayList<CanBo> list)
	{
		String hoTen = Utilities.getString("Enter ho ten: ", sc);
		
//		Call the getItems to get the list of CanBo meet the condition
		ArrayList<CanBo> found = getItemsBasedOnHoTen(hoTen, list);
		if (found.size() == 0)
		{
			System.out.println("\nResult: Not found.");
			System.out.println("\nYou will be get back to the main menu...");
		}
		else
		{
			System.out.println("\nResult: Found!");
			displayItems(found);
		}
	}
	
	private static ArrayList<CanBo> getItemsBasedOnHoTen(String hoTen, ArrayList<CanBo> list) 
	{
		ArrayList<CanBo> result = new ArrayList<>();
		for (CanBo cb: list)
		{
			if (cb.getHoTen().equalsIgnoreCase(hoTen))
			{
				result.add(cb);
			}
		}
		
		return result;
	}
	
	private static void displayItems(ArrayList<CanBo> list)
	{
		System.out.println("\n----------- Information of employee(s) ------------------\n");
		for (CanBo cb: list)
		{
			System.out.println(cb);
		}
		System.out.println("\nYou will be get back to the main menu...");
	}
	
	
}






















