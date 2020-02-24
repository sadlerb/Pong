import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class Pong extends JFrame{
	
	final static int WINDOW_WIDTH = 507;
	final static int WINDOW_HEIGHT = 533;
	private static int playerScore = 0;
	private static int compScore = 0;
	
	public Pong (){
		
		
		
		super.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);// Creating game window
		super.setResizable(false);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.add(new GamePanel());
		super.setVisible(true);
		
		
	}
	
	
	public static void main (String[] args){
	
		new Pong();
		
	}
	public static void updatePlayerScore(){
		playerScore++;
		
	}
	public static void updateCompScore(){
		compScore++;
	}
	public static  int getPlayerScore(){
		return playerScore;
		
	}
	public static int getCompScore(){
		return compScore;
	}
	
}