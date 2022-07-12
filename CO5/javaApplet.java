import java.awt.*;
import java.applet.*;
public class javaApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(150,20,100,90);
		g.fillOval(150,150,120,120);
		g.drawLine(180,20,100,100);
	}
}
/* <applet code="javaApplet.class" width=400 height=400></applet> */

