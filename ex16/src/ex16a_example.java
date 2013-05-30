import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex16a_example extends Applet implements MouseListener {
int x, y;	//coordinates of mouse

//Demonstrates the use of mouse events using MouseListener  
    public void init() {
	addMouseListener(this);
    }

    //This applet responds to mousePressed.
    public void mousePressed (MouseEvent e) {
	x = e.getX();
	y = e.getY();
	repaint();
    }
    
    //The other interface methods used by MouseListener
    //must be defined in the program, even it they are not used.
    public void mouseClicked (MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered (MouseEvent e) {}
    public void mouseExited  (MouseEvent e) {}
    
    //Indicate position of mouse
    public void paint (Graphics g) {
	g.drawString("Mouse is at (" + x + "," + y + ")", x,y);
    }
}
