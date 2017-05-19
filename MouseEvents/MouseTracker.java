/* First we declare packages we will be making use of during the program.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
 

 

/* Second we simply declare a public class MouseTracker in which MouseListener and
 * MouseMotionListener is implemented; Next a JLable with name Statusbar is declared.
 * Further, a public function MouseTracker is declared and its title is set.
 */

public class MouseTracker extends JFrame implements MouseListener, MouseMotionListener
{
	private JLabel statusbar;
	
	public MouseTracker()
	{
		super("Mouse Tracker");
		statusbar = new JLabel(); 
 
		/* Now we position the Jlabel statusbar to south (i.e. bottom of the application)
		 * and add MouseMotionListener and MouseListener. Than we set its size and its 
		 * visibility to true.
		 */
		getContentPane().add(statusbar, BorderLayout.SOUTH );
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(500,500);	
		setVisible(true);
   } 
 
	/* Now we just put in all the mouse events, and set different text for Jlabel 
	 * Statusbar for different mouse events through the statement "statusbar.setText". 
	 * In "statusbar.setText" we've also used getX() and getY() which gives us the 
	 * value of x and y coordinates where the event is taking place.
	 */
	public void mouseClicked( MouseEvent event )
	{
		statusbar.setText( "Clicked @ x" + event.getX() + " y" + event.getY() );
	}
	
	public void mousePressed( MouseEvent event)
	{
		statusbar.setText( "Pressed @ x" + event.getX() + " y" + event.getY() );
	}
	
	public void mouseReleased( MouseEvent event )
	{
		statusbar.setText( "Released @ x" + event.getX() + " y" + event.getY() );
	} 
	
	public void mouseEntered( MouseEvent event )
	{
		statusbar.setText( "Mouse Entered @ x" + event.getX() + " y" + event.getY() );
	}
	
	public void mouseExited( MouseEvent event )
	{
	statusbar.setText( "Mouse Exited @ x" + event.getX() + " y" + event.getY() );
	}
	
	public void mouseDragged( MouseEvent event )
	{
		statusbar.setText( "Mouse Dragged @ x" + event.getX() + " y" + event.getY() );
	}
	
	public void mouseMoved( MouseEvent event )
	{
		statusbar.setText( "Mouse Moved @ x" + event.getX() + " y" + event.getY() );
	}  


	/* Finally, in the lines below we have declared a MouseTracker class inside
	 * main and set it up to close the application:
	 */
	public static void main( String args[] )
	{
		MouseTracker application = new MouseTracker();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	} 

}