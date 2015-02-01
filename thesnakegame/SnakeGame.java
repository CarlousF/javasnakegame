package thesnakegame;


import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SnakeGame extends JFrame{

	public SnakeGame(){
		
		add(new TheBoard());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320,340);
		
		setLocationRelativeTo(null);
		setTitle("Snake");
		
		
		setResizable(false);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args){
	
		
		new SnakeGame();
		
		
		
	}


}
