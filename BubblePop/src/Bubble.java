import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Bubble
{
	private int x,y,d;
	private Color c;
	private boolean movingRight,movingDown;
	
	public Bubble(int w, int h)
	{		
		d = (int)((80)*Math.random() + 20);
		x = (int)((w-d)*Math.random());
		y = (int)((h-d)*Math.random());
		c = randomColor();	

		boolean movingRight = Math.random()<0.5;
		boolean movingDown  = Math.random()<0.5;
	}
	
	private Color randomColor()
	{
		int r,g,b;
		
		do 
		{
			r = (int)(256*Math.random());
			g = (int)(256*Math.random());
			b = (int)(256*Math.random());
			
		} while (r<100 && g<100 & b<100);
		
		return new Color(r,g,b);	
	}
	
	public int getX() {return x;};
	public int getY() {return y;};
	public int getD() {return d;};
	public boolean getRight() {return movingRight;}
	public boolean getDown()  {return movingDown;}
	
	public void setDirectionToRight() { movingRight = true; }
	public void setDirectionToLeft()  { movingRight = false;}
	public void setDirectionToDown()  { movingDown = true; }
	public void setDirectionToUp()    { movingDown = false;}
	public void reverseX() { movingRight = !movingRight; }
	public void reverseY() { movingDown = !movingDown;	}
	
	public void move()
	{		
		if (movingRight) x++; else x--;
		if (movingDown)  y++; else y--;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.fillOval(x,y,d,d);
	}
}