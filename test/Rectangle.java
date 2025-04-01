package test;

public class Rectangle {
	int width;
	int height;
	Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	public int area()
	{
	
	return width*height;	
	}
	public int perimeter()
	{
	return 2*(width*height);	
	}
	public static void main(String[] args)
	{
		Rectangle rect=new Rectangle(5,4);
		System.out.println("Area of the rectangle: "+rect.area());
		System.out.println("Perimeter of the rectangle: "+rect.perimeter());
	}
}
