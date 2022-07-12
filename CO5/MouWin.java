import java.awt.*;  
import java.awt.event.*;

public class MouWin extends Frame implements WindowListener, MouseListener,MouseMotionListener{  
    MouWin(){  
        addWindowListener(this);  
        addMouseListener(this);
	addMouseMotionListener(this);
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
      
public static void main(String[] args) {  
    new MouWin();  
}  
public void windowActivated(WindowEvent we) {  
    System.out.println("activated");  
}  
public void windowClosed(WindowEvent we) {  
    System.out.println("closed");  
}  
public void windowClosing(WindowEvent we) {  
    System.out.println("closing");  
    dispose();  
}  
public void windowDeactivated(WindowEvent we) {  
    System.out.println("deactivated");  
}  
public void windowDeiconified(WindowEvent we) {  
    System.out.println("deiconified");  
}  
public void windowIconified(WindowEvent we) {  
    System.out.println("iconified");  
}  
public void windowOpened(WindowEvent we) {  
    System.out.println("opened");  
} 
public void mouseEntered(MouseEvent me)
	{
		    System.out.println("Mouse Entered");  
	}
	
	public void mouseExited(MouseEvent me)
	{
		    System.out.println("Mouse Exited");  
	}
	public void mousePressed(MouseEvent me)
	{
		    System.out.println("Mouse Pressed");  
	}
	public void mouseReleased(MouseEvent me)
	{
		    System.out.println("Mouse Released");  
	}
	public void mouseMoved(MouseEvent me)
	{
		    System.out.println("Mouse Moved");  
	}
	public void mouseDragged(MouseEvent me)
	{
		    System.out.println("Mouse Dragged");  
	}
	public void mouseClicked(MouseEvent me)
	{
		    System.out.println("Mouse Clicked");  
	} 
}
