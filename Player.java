
public class Player extends Character{
	boolean moveRight;
	boolean moveLeft;
	int speed;
	
	public Player (int x, int y, int s) {
		super(x,y,s);
		
		moveLeft=false;
		moveRight=false;
		speed = 5;
	}
}
