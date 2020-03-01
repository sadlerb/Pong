package Pong;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer; 
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener, KeyListener	{
	
	Ball ball = new Ball();
	Player player = new Player();
	Computer computer = new Computer(this);
	
	public GamePanel (){
		Timer timer= new Timer (30,this);//Creates a timer to refresh the screen
		timer.start();// Starts timer 
		
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	private void update(){
		player.update();
		computer.update();
		ball.update();
		ball.checkCollision(player);
		ball.checkCollisionComp(computer);
		
		
	}
	
	public void paintComponent(Graphics g ){// Code to paint the game
		g.setColor(Color.BLACK);// 
		g.fillRect(0,0,Pong.WINDOW_WIDTH,Pong.WINDOW_HEIGHT);
		ball.paint(g);
		player.paint(g);
		computer.paint(g);
		
		g.setColor(Color.WHITE);
		g.drawLine(0,30,Pong.WINDOW_WIDTH,30);
		g.drawLine(Pong.WINDOW_WIDTH/2,30,Pong.WINDOW_WIDTH/2,Pong.WINDOW_HEIGHT);
		g.setFont(g.getFont().deriveFont(20.0F));
		g.setColor(Color.white);
		g.drawString("Player: " + Pong.getPlayerScore(), 0, 23);
		g.drawString("Computer: " + Pong.getCompScore(), Pong.WINDOW_WIDTH -140, 23);
		
	}
	
	public void actionPerformed (ActionEvent e){// 
		
		update();
		repaint();	
		
	}
	
	public Ball getBall (){
		return ball;
		
		
	}
	
	public void keyPressed(KeyEvent e){
		
		if (e.getKeyCode() == KeyEvent.VK_UP){
			
			player.setYVelocity(-4);
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			
			player.setYVelocity(4);
		}
		
		
		
		
	}
	
	public void keyReleased(KeyEvent e){
		
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN){
			
			player.setYVelocity(0);
			
		}
	}
	
	public void keyTyped(KeyEvent e){
		
		
		
	}
	
	
}