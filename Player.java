import java.awt.Graphics;
import java.awt.Color;
public class Player {
	
	final private int x = 30; // sets the players x position
	
	private int y = Pong.WINDOW_HEIGHT /2 ;// sets player initial position to the middle of the window
	private int yVelocity = 0;
	private int width = 20;// player width
	private int height = 50;// player height
	
	
	public Player (){
		
		
		
	}
	
	public void update (){
		
		y = y + yVelocity; // adds the current velocity to player y position to create movement
		
		
	}
	
	public void paint (Graphics g){// creates player based on specified size and color
		g.setColor(Color.WHITE);
		g.fillRect(x, y , width,height);
		
	}
	
	public void setYVelocity(int speed){// sets player velocity
		
		yVelocity = speed;
	}
	
	public int getY(){
		return y;
	}
	
	public int getX(){
		return x;
		
	}
	
	public int getWidth(){
		return width;
		
	}
	
	public int getHeight(){
		
		return height;
		
	}
	public int getYVelocity(){
		return yVelocity;
		
	}
}
	
