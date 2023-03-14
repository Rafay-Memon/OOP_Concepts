class Shape
{
	final double PI = 3.14;
	
	double area(double side)
	{
		return side * side;
	}
	double area(double length, double width)
	{
		return length * width;
	}
	double area(int radius)
	{
		return PI * radius * radius;
	}
	
	public static void main(String[] args)
	{
		Shape s = new Shape();
		System.out.println("Area of square is: " + s.area(5.0));
		System.out.println("Area of rectangle is: " + s.area(10.0,5.0));
		System.out.println("Area of circle is: " + s.area(2));
	}
}