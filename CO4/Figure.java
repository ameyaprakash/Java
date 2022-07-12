package Graphics;
import java.util.*;
interface FindArea
{
	public void circle();
	public void square();
	public void rectangle();
	public void triangle();
}
public class Figure implements FindArea
{
	public void circle()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("enter radius of circle =");
		int r = c.nextInt();
		double a = 2*3.14*(r*r);
		System.out.println("Area = "+a);
	}
	public void square()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("enter side of square=");
		int r = c.nextInt();
		double a = r*r;
		System.out.println("Area = "+a);
	}
	public void rectangle()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("enter legth and breadth of rectangle =");
		int r = c.nextInt();
		int b =c.nextInt();
		double a = r*b;
		System.out.println("Area = "+a);
	}
	public void triangle()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("enter legth and breadth of triangle =");
		int r = c.nextInt();
		int b = c.nextInt();
		double a = (b*r)/2;
		System.out.println("Area = "+a);
	}
} 
