import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class BubbleGame implements MouseListener, MouseMotionListener
{
	class MyDrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			
			if (!gameOver)
			{
				for(Bubble b: bubbles)
				{
					b.draw(g);
				}
			}
			else
			{		
				int w = drawPanel.getWidth();
				int h = drawPanel.getHeight();
				
				g.setColor(Color.WHITE);
				g.setFont(new Font("Serif", Font.BOLD, 25));
				g.drawString("Game statistics...",       w/2-120, h/2-120);
				g.drawString("Bubbles: " + numBubbles,   w/2-120, h/2-90);
				g.drawString("Pop points: " + popPoints, w/2-120, h/2-60);
				g.drawString("Misses: " + misses,        w/2-120, h/2-30);
				g.drawString("Penalty: -" + penalty,     w/2-120, h/2-0);
				g.drawString("Time: " + seconds, 	     w/2-120, h/2+30);
				g.drawString("Time Bonus: x" + bonus,    w/2-120, h/2+60);
				g.drawString("Total: " + total,          w/2-120, h/2+90);
			}
		}
	}

	private int numBubbles = 20;
	private int width = 1000;
	private int height = 720;
	private int delay = 7;
	private int popPoints = 0;
	private int misses = 0;
	private int bonus = 0;
	private int total = 0;
	private int penalty = 0;
	private long seconds = 0;
	private boolean gameOver = false;
	private ArrayList<Bubble> bubbles = new ArrayList();
	private ArrayList<Bubble> popList = new ArrayList();
	private JFrame frame = new JFrame("Bubbles!");
	private MyDrawPanel drawPanel = new MyDrawPanel();
	private Timer gameTime = new Timer();
	
	public BubbleGame()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(drawPanel);
		frame.setSize(width,height);
		frame.setVisible(true);

		drawPanel.addMouseListener(this);
		drawPanel.addMouseMotionListener(this);	
	}
	
	private double distance(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
	}

	public void wallCheck()
	{
		for (Bubble b: bubbles)
		{
			int w = drawPanel.getWidth();
			int h = drawPanel.getHeight();
			
			if (b.getX()<0)			 {b.setDirectionToRight();}
			if (b.getX()+b.getD()>w) {b.setDirectionToLeft();}
			if (b.getY()<0)			 {b.setDirectionToDown();}
			if (b.getY()+b.getD()>h) {b.setDirectionToUp();}
		}		
	}

	public void moveBubbles()
	{
		for(Bubble b: bubbles)
		{
			b.move();
		}
	}
	
	public void makePopList(int x1, int y1)
	{
		popList = new ArrayList();
		
		for (Bubble b: bubbles)
		{
			int r = b.getD()/2;
			int x2 = b.getX() + r;
			int y2 = b.getY() + r;
			
			if (distance(x1,y1,x2,y2) < r)
			{
				popList.add(b);
			}
		}
		
		if (popList.size() == 0) 
		{
			misses++;
		}
		else
		{
			addPopPoints();
		}
	}
	
	public void addPopPoints()
	{
		popPoints += 20 * popList.size() * popList.size();
	}
	
	public void removePopped()
	{
		for (Bubble p: popList)
		{
			bubbles.remove(p);
		}
	}
	
	public void calculateGameStats()
	{
		seconds = gameTime.getSeconds();
		penalty = misses * 10;
		bonus = (int)(3*numBubbles/seconds);
		total = (popPoints-penalty) * bonus;
	}
	
	public void mouseClicked(MouseEvent event){}
	
	public void mousePressed(MouseEvent event) 
	{
		int x = event.getX();
		int y = event.getY();
				
		makePopList(x,y);
	}
	
	public void mouseReleased(MouseEvent event) {}
	
	public void mouseEntered(MouseEvent event) {}

	public void mouseExited(MouseEvent event) {}
	
	public void mouseDragged( MouseEvent event ) {}
	
	public void mouseMoved( MouseEvent event ) {}  

	public void play()
	{
		for (int i=0; i<numBubbles; i++)
		{
			bubbles.add(new Bubble(drawPanel.getWidth(),drawPanel.getHeight()));
		}
		
		gameTime.start();

		while (bubbles.size()>0)
		{			
			if (bubbles.isEmpty())
			{
				gameOver = true;
			}
			else
			{
				removePopped();
				wallCheck();
				moveBubbles();
			}
			
			drawPanel.repaint();
			try
			{
				Thread.sleep(delay);
			} catch(Exception ex) {}
		}
		
		gameTime.stop();
		gameOver = true;
		calculateGameStats();
		drawPanel.repaint();
	}
	
}