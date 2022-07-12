import java.awt.*;
import java.applet.*;
/* <applet code="Mark.class" height=400 width=400>
<param name="sub1" value=45>
<param name="sub2" value=5>
<param name="sub3" value=52>
<param name="sub4" value=42>
<param name="sub5" value=62>
</applet>
*/
public class Mark extends Applet
{
	String num;
	int s1,s2,s3,s4,s5,sum;
	double avg;
	public void start()
	{
		num=getParameter("sub1");
		s1 = Integer.parseInt(num);
		num=getParameter("sub2");
		s2 = Integer.parseInt(num);
		num = getParameter("sub3");
		s3=Integer.parseInt(num);
		num=getParameter("sub4");
		s4 = Integer.parseInt(num);
		num = getParameter("sub5");
		s5=Integer.parseInt(num);
		sum = s1+s2+s3+s4+s5;
		avg = ((sum*100)/500);
		
	}
	public void paint(Graphics g)
	{
		g.drawString(" marks  are "+s1+" "+s2+" "+s3+" "+s4+" "+s5,20,40);
		g.drawOval(50,100,250,250);
		g.setColor(Color.black);
		g.fillOval(100,180,50,50);
		g.fillOval(200,180,50,50);
		if ( avg > 50 )
		{	
			g.drawArc(120,280,120,40,180,180);
		}
		else
		{
			g.drawArc(120,280,120,40,180,-180);
		}
	}
}
