import java.awt.Graphics;
import java.awt.Color;
public class Player {
	
	final private int x = 30;
	
	private int y = Pong.WINDOW_HEIGHT /2 ;
	private int yVelocity = 0;
	private int width = 20;
	private int height = 50;
	
	
	public Player (){
		
		
		
	}
	
	public void update (){
		
		y = y + yVelocity;
		
		
	}
	
	public void paint (Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y , width,height);
		
	}
	
	public void setYVelocity(int speed){
		
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
	