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
	
	private void setBac(int bac)
	{
//		The value of the "bac" field must be between 1 and 10.
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
		int bac = validateBac(sc);
		setBac(bac);
	}
	
	private int validateBac(Scanner sc)
	{
		int bac;
		while (true)
		{
			bac = Utilities.getInteger("Bac (between 1 and 10): ", sc);
			if (bac < 1 || bac > 10)
			{
				System.out.println("You should enter a number between 1 and 10. Try again.");
			}
			else 
			{
				return bac;
			}
		}
	}
	
//	Override the toString method
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Cong Nhan: \n");
		builder.append(super.toString());
		builder.append(",\n  bac: ");
		builder.append(this.bac);
		builder.append(".");
		
		return builder.toString();
	}

}
























