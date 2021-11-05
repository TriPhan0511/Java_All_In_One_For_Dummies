//
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
//		System.out.println("\nAloha, I am an employee manager. May I help you?");
//		int choice = 0;
//		while (choice != 4)
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
////				Calls the insertItemToList method to add an object to the list
//				insertItemToList();				
//				break;
//			case 2:
////				Calls the find method to find a CanBo based on hoTen field
//				findBasedOnHoTen(list);
//				break;
//			case 3:
////				Calls the displayItems method to show the information in the list
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
//	private static void insertItemToList()
//	{
//		System.out.println("\n----------- Enter a new employee to the list ------------------");
//		int choice = 0;
//		while (choice != 4)
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
//				addItem(list, new CongNhan());
//				break;
//				
//			case 2:
//				System.out.println("\n***** Adding an KySu object to the list *****");
//				addItem(list, new KySu());
//				break;
//			case 3:
//				System.out.println("\n***** Adding an NhanVien object to the list *****");
//				addItem(list, new NhanVien());
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
//		cb.setInfo(sc);
//		list.add(cb);
//	}
//	
//	private static void findBasedOnHoTen(ArrayList<CanBo> list)
//	{
//		String hoTen = Utilities.getString("Enter ho ten: ", sc);
//		
////		Calls the getItemsBasedOnHoTen to get the list of CanBo meet the condition
//		ArrayList<CanBo> found = getItemsBasedOnHoTen(hoTen, list);
//		if (found.size() == 0)
//		{
//			System.out.println("\nResult: Not found.");
//			System.out.println("\nYou will be get back to the main menu...");
//		}
//		else
//		{
//			System.out.println("\nResult: Found!");
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
//	private static void displayItems(ArrayList<CanBo> list)
//	{
//		System.out.println("\n----------- Information of employee(s) ------------------\n");
//		if (list.size() == 0)
//		{
//			System.out.println("Nothing to show.");
//		}
//		else
//		{
//			for (CanBo cb: list)
//			{
//				System.out.println(cb);
//			}
//		}
//		System.out.println("\nYou will be get back to the main menu...");
//	}
//	
//	
//}

//-----------------------------------------------------------------------------------------------------------------

import java.util.*;

public class QuanLyCanBo
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		CongNhan cn = new CongNhan();
		cn.setInfo(sc);
		System.out.println(cn);
	}
}






















