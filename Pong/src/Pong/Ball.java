package Pong;
import java.awt.Graphics;
import java.awt.Color;

public class Ball {
	final int size = 15;
	private int x = Pong.WINDOW_WIDTH /2;
	private int y = Pong.WINDOW_HEIGHT/ 2;
	private int xVelocity = -4;
	private int yVelocity = 0;
	
	
	
	public void update(){
		
		x = x + xVelocity;
		y = y + yVelocity;
		if (x < 0) {
			compScore();
			
		}
		if (y < 30) {
			yVelocity = 4;
			
		}
		if (x > Pong.WINDOW_WIDTH - (size + 8)) {
			playerScore();

			
			
		}
		if (y > Pong.WINDOW_HEIGHT  - (size + 35)) {
			yVelocity = -4;
			
		}
		
	}
	
	public void paint (Graphics g){// Paints the ball 
		g.setColor(Color.WHITE);
		g.fillOval(x,y,size,size);
		
	}
	
	private void reverse(int y){
		
		xVelocity = -xVelocity;
		yVelocity = y;
		
		
		
		
	}
	 
	public void checkCollision(Player player){
		
		if (this.x  > player.getX() && this.x < player.getX() + player.getWidth()){
			
			if (this.y > player.getY() && this.y < player.getY()+ player.getHeight() )

				reverse(player.getYVelocity());
		}
		
	}
	
	public void checkCollisionComp(Computer comp){
		
		if (this.x  > comp.getX() && this.x < comp.getX() + comp.getWidth()){
			
			if (this.y > comp.getY() && this.y < comp.getY()+ comp.getHeight() )

				reverse(comp.getYVelocity());
		}
		
	}
	
	public int  getX (){
		return x;
	}
	
	public int getY (){
		return y;
	}
	
	public void playerScore (){
			Pong.updatePlayerScore();
			System.out.println ("Player Point !!");
			x = Pong.WINDOW_WIDTH /2;
			y = Pong.WINDOW_HEIGHT/ 2;
			xVelocity = 4;
			yVelocity = 0;
			
			
		}
	public void compScore (){
		
		Pong.updateCompScore();
		System.out.println ("Computer Point !!");
		x = Pong.WINDOW_WIDTH /2;
		y = Pong.WINDOW_HEIGHT/ 2;
		xVelocity = -4;
		yVelocity = 0;
	}
			
		
		
		
	
}