import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Key.class" width=400 height=400>
</applet>
*/
public class Key extends Applet implements KeyListener {
	String msg = "";
	int X = 10, Y = 20; 
	public void init() {
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke) {
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent ke) {
		showStatus("Key relesed");
	}
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg, X, Y);
	}
}
