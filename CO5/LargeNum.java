import java.awt.*;
import java.applet.*;
/* <applet code="LargeNum.class" height=400 width=400>
<param name="fnum" value=5>
<param name="snum" value=9>
<param name="tnum" value=4>
</applet>
*/
public class LargeNum extends Applet
{
    String num;
    int n1,n2,n3;
    public void init()
    {
        num=getParameter("fnum");
        n1 = Integer.parseInt(num);
        num=getParameter("snum");
        n2 = Integer.parseInt(num);
        num = getParameter("tnum");
        n3=Integer.parseInt(num);
        
    }
    public void paint(Graphics g)
    {
        g.drawString(" numbers are "+n1+" "+n2+" "+n3+" ",20,40);
        if (n1>n2 && n1>n3)
        {
            g.drawString("Largest number = "+n1,50,80);
        }
        else if(n2 > n3)
        {
            g.drawString("Largest number = "+n2,50,80);
        }
        else
        {
            g.drawString("Largest number = "+n3,50,80);
        }
    }
}


