
public class Alien extends Character{
	boolean moveRight;
	boolean moveLeft;
	boolean isVisible;
	int speed;
	
	public Alien (int x, int y, int s) {
		super(x,y,s);
		
		moveLeft=false;
		moveRight=false;
		speed = 1;
		isVisible=true;
	}
}
