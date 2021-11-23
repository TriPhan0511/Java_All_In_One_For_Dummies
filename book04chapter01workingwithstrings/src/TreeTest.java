/**
 * THE IMMUTABLE PATTERN
 * 
 * An immutable object is an object that, once created, can never be changed.
 * The String class is the most common example of an immutable object. After
 * you create a String object, you can't change it.
 * 
 * Follow these three simple rules for creating an immutable object:
 * 
 * 		_ Provide one or more constructors that accept parameters to
 * 			set the initial state of the object.
 * 
 * 		_ Don't allow any methods to modify any instance variables in
 * 			the object. Set instance variables with constructors and
 * 			then leave them alone.
 * 
 * 		_ Any method that modifies the object should do so by ccreating 
 * 			a new object with the modified values. Then this method 
 * 			returns the new object as its return value.
 *
 */

public class TreeTest
{
	public static void main(String[] args) 
	{
		Tree t1 = new Tree(1, "Avocado", "Vietnam");
		Tree t2 = t1.increaseSize(100);
		
//		Prints out the result to the console.
		System.out.println("Tree 1: " + t1);
		System.out.println("Tree 2: " + t2);
	}
}

class Tree 
{
//	Instance variables
	private int size;
	private String type;
	private String location;
	
//	A constructor
	public Tree(int size, String type, String location)
	{
		this.size = size;
		this.type = type;
		this.location = location;
	}

//	A method which used to increase size of a tree.
	public Tree increaseSize(int increasingValue)
	{
		Tree newTree = new Tree(this.size + increasingValue, 
				this.type, this.location);
		return newTree;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Size: ");
		builder.append(this.size);
		builder.append(", type: ");
		builder.append(this.type);
		builder.append(", location: ");
		builder.append(this.location);
		builder.append(".");
		return builder.toString();
	}
}

























