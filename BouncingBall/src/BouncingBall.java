import java.awt.*;
import javax.swing.*;

public class BouncingBall
{
	private int width = 300;
	private int height = 250;
	private int diameter = 40;
	private int delay = 10;
	private int x,y;
	private Color c;
	
	public Color randomColor()
	{
		int r = (int)(256*Math.random());
		int g = (int)(256*Math.random());
		int b = (int)(256*Math.random());
		
		return new Color(r,g,b);	
	}

	public void animate()
	{
		JFrame frame = new JFrame("Bouncing Ball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(width,height);
		frame.setVisible(true);
						
		boolean movingRight = Math.random()<0.5;
		boolean movingDown  = Math.random()<0.5;
		
		x = (int)((drawPanel.getWidth()-diameter)*Math.random());
		y = (int)((drawPanel.getHeight()-diameter)*Math.random());
		c = randomColor();
		
		while (true)
		{
			if (x<0)  							  {movingRight=true;  c=randomColor();}
			if (x+diameter>drawPanel.getWidth())  {movingRight=false; c=randomColor();}
			if (y<0) 							  {movingDown=true;   c=randomColor();}
			if (y+diameter>drawPanel.getHeight()) {movingDown=false;  c=randomColor();}
			
			if (movingRight) x++; else x--;
			if (movingDown)  y++; else y--;
			
			drawPanel.repaint();
			try
			{
				Thread.sleep(delay);
			} catch(Exception ex) {}
		}
	}
	
	public static void main(String[] args)
	{
		BouncingBall ball = new BouncingBall();
		ball.animate();
	}
	
	class MyDrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			g.setColor(c);
			g.fillOval(x,y,diameter,diameter);
		}
	}
}