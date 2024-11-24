public abstract class Shape
{
	public double dim1, dim2;
	
	Shape(double d1, double d2)
	{
		System.out.println("Inside Shape.");
		dim1=d1;
		dim2=d2;
	}
	
	public abstract double area();
}

class Rectangle extends Shape
{
	Rectangle(double l, double w)
	{
		super(l, w);
		System.out.println("Inside Rectangle.");

	}
	
	public double area()
	{
		return dim1*dim2;
	}
}

class Triangle extends Shape
{
	Triangle(double h, double b)
	{
		super(h, b);
		System.out.println("Inside Triangle.");
	}
	
	public double area()
	{
		return 0.5*dim1*dim2;
	}
}

class ShapeDemo
{
	public static void main(String args[])
	{
		// Shape sp = new Shape(10.5, 20.5);
		Rectangle rt = new Rectangle(10.0, 20.5);
		Triangle tr = new Triangle(6.0, 8.25);
		Shape sh;
		sh=rt;
		System.out.println("The area of Rectangle is:"+sh.area());
		
		sh=tr;
		System.out.println("The area of Triangle is:"+sh.area());
	}
}