import java.util.*;
import java.lang.*;
class fibo implements Runnable
{
	public void run()
	{
		try
		{
			Scanner fi = new Scanner(System.in);
			System.out.println("enter a number");
			int n = fi.nextInt();
			int i;
			int first=0,second=1,next;
			System.out.println(first+"\n"+second);
			for(i=0;i<n;i++)
			{
				next=first+second;
				first=second;
				second=next;
				System.out.println(next);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class even implements Runnable
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			Scanner ev= new Scanner(System.in);
			System.out.println("enter the limit=");
			int d= ev.nextInt();
			for(int i=1;i<=d;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Fibo
{
	public static void main(String a[])
	{
		fibo k=new fibo();
		even d=new even();
		Thread t1 = new Thread(k);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}
}
