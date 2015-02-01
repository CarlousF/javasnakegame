package thesnakegame;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TAdapter implements KeyListener {

	private TheBoard theBoard;
	
	public TAdapter(TheBoard theBoard) {
		this.theBoard = theBoard;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		
		if((key == KeyEvent.VK_LEFT ) && (!theBoard.getRight())){
			theBoard.setLeft(true);
			theBoard.setUp(false);
			theBoard.setDown(false);
		}
		
		if((key == KeyEvent.VK_RIGHT ) && (!theBoard.getLeft())){
			theBoard.setRight(true);
			theBoard.setUp(false);
			theBoard.setDown(false);
		}
		
		if((key == KeyEvent.VK_UP ) && (!theBoard.getDown())){
			theBoard.setLeft(false);
			theBoard.setUp(true);
			theBoard.setRight(false);
		}
		
		if((key == KeyEvent.VK_DOWN ) && (!theBoard.getUp())){
			theBoard.setLeft(false);
			theBoard.setRight(false);
			theBoard.setDown(true);
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




}
