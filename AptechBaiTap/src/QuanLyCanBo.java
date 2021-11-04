import java.util.*;

public class QuanLyCanBo 
{
	public static ArrayList<CanBo> list = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while (true)
		{
//			System.out.println("\n----------- Enter data------------------\n");
//			System.out.println("Enter 1 for adding a CongNhan object\n"
//								+ "Enter 2 for adding a KySu object\n"
//								+ "Enter 3 for adding a NhanVien object");
//			System.out.print("You choice: ");								
//			int choice = sc.nextInt();
			
			int choice = 1;
			switch(choice)
			{
				case 1:
					System.out.println("Case 1");
	//				addItem(list, getCongNhan(sc));
					addItem(list, getCongNhan());				
					break;
				
				case 2:
	//				addItem(list, getKySu(sc));
					addItem(list, getKySu());
					break;
				case 3:
	//				addItem(list, getNhanVien(sc));
					addItem(list, getNhanVien());
					break;
				default:
					System.out.println("Wrong choice.");
					break;
			}
			
			displayItems(list);
		}
	}
	
	private static void displayItems(ArrayList<CanBo> list)
	{
		CanBo canBo;
		Iterator<CanBo> e = list.iterator();
		while (e.hasNext())
		{
			canBo = e.next();
			System.out.println(canBo);
		}
	}
	
	private static void addItem(ArrayList<CanBo> list, CanBo cb)
	{
		list.add(cb);
	}
	
//	public CongNhan getCongNhan(Scanner sc) 
//	public static CongNhan getCongNhan(Scanner sc) 
	public static CongNhan getCongNhan() 
	{
//		Lay thong tin tu user
		System.out.print("Ho Ten ? ");
		String hoTen = sc.nextLine();
		System.out.print("Tuoi ? ");
		int tuoi = sc.nextInt();
		sc.nextLine(); // Consume newline left-over
		System.out.print("Gioi Tinh ? ");
		String gioiTinh = sc.nextLine();
		System.out.print("Dia Chi ? ");
		String diaChi = sc.nextLine();
		System.out.print("Bac ? ");
		int bac = sc.nextInt();
		
		return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
	}
	
//	public KySu getKySu(Scanner sc) 
//	public static KySu getKySu(Scanner sc) 
	public static KySu getKySu() 
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
	
//	public NhanVien getNhanVien(Scanner sc) 
//	public static NhanVien getNhanVien(Scanner sc) 
	public static NhanVien getNhanVien() 
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
		System.out.print("Cong viec ? ");
		String congViec = sc.nextLine();
		
		return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
	}
	
	
}




















