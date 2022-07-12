import java.util.*;
class userd extends Exception
{}
class passd extends Exception{}
class UserAuth
{
	public static void main(String a[])
	{
		Scanner k =new Scanner(System.in);
		String u1,u2,p1,p2;
		System.out.println("enter username = ");
		u1=k.next();
		System.out.println("enter again the username=");
		u2=k.next();
		try
		{
			if(!u1.equals(u2))
			{
				throw new userd();
			}
			System.out.println("enter password=");
			p1=k.next();
			System.out.println("confirm password = ");
			p2=k.next();
			if(!p1.equals(p2))
			{
				throw new passd();
			}
		}
		catch(userd r)
		{
			System.out.println("wrong username");
		}
		catch(passd i)
		{
			System.out.println("Wrong password");
		}
	}
}
