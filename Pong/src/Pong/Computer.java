package Pong;
import java.awt.Graphics;
import java.awt.Color;
public class Computer {
	
	
	private GamePanel field;
	private int y = Pong.WINDOW_HEIGHT /2 ;
	private int yVelocity = 0;
	private int width = 20;
	private int height = 50;
	
	
	public Computer(GamePanel game){
		
		this.field = game;  
		
		
		
	}
	
	public void update (){
		if (field.getBall().getY() < this.y){
			
			// Ball is above computer 
			
			yVelocity = -3;
			
		}
		else if (field.getBall().getY() > this.y){
			// Ball is  Below computer
			
			yVelocity = 3;
			
			
		}
		y = y + yVelocity;
		
		
	}
	
	public void paint (Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(Pong.WINDOW_WIDTH - 7 - (30 + width) , y ,width,height);
		
		
	}
	
	
	
	
	
	
	public int getY(){
		return y;
	}
	
	public int getX(){
		return Pong.WINDOW_WIDTH - 7 - (30 + width); 
		
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

