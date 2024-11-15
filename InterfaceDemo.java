import java.util.Scanner;

interface Drawable
{  
	void draw();  
	default void msg()
	{
		System.out.println("It's a drawable object");
	} 
}

interface Polygon
{
  double getArea();
}



// implement the Polygon interface
class Rectangle implements Drawable
{
	
	// implementation of abstract method of Drawable
  	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}  
}

class Square implements Drawable, Polygon
{

	// implementation of abstract method of Drawable interface
  	public void draw()
	{
		System.out.println("Drawing Square.");
	}  

	// implementation of abstract method of Polygon interface
  	public double getArea()
	{
    		System.out.print("Enter the length of the sides of the square:");
		Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();

		return length*length;
  	}
	
}

public class InterfaceDemo
{
	public static void main(String[] args)
	{
    		Rectangle r1 = new Rectangle();
    		r1.draw();
		
		Square sq1 = new Square();
		sq1.msg();
		sq1.draw();
		System.out.println("The area of the square is " + sq1.getArea()+" sq. unit.");
		sq1.msg();
 	}
}