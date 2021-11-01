// A class imitate a rectangle.
// This class consists of length, width of a rectangle.
// It also includes two methods which calculate the rectangle's area and perimeter.
class Rectangle 
{
//	Private fields
	private double length;
	private double width;
	
//	An empty constructor
	public Rectangle() {}
	
//	Another constructor
	public Rectangle(double length, double width) 
			throws Exception
		
	{
		if (length <= 0 || width <= 0)
		{
			throw new Exception();
		}
		this.length = length;
		this.width = width;
	}
	
//	Getters / Setters
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public void setLength(double length) 
			throws Exception
	{
		if (length <= 0)
		{
			throw new Exception();
		}
		this.length = length;
	}
	
	public void setWidth(double width) 
			throws Exception
	{
		if (width <= 0)
		{
			throw new Exception();
		}
		this.width = width;
	}
	
//	calcArea method: calculate the area of a rectangle
	public double calcArea()
	{
		return this.length * this.width;
	}
	
//	calcPerimeter method: calculate the perimeter of a rectangle
	public double calcPerimeter()
	{
		return 2 * (this.length + this.width);
	}
}
