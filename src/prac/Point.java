package prac;

public class Point {

	
	private int x = 0, y = 0;
	
	Point(){
		this(1, 2);	
	}
	
	Point(int x){
		
	}
	
	Point(int x, int y){
	
		this.setX(x);
		this.setY(y);
	
	}
	
	
	
	Point(int x, int y, int Z){
		
	}
	
	
	public void addX(int x) {
		this.setX(x + 1);
	}
	
	public void subtractX(int x) {
		this.setX(x + 1);
	}
	
	public void addY(int y) {
		this.setY(y + 1);
	}
	
	public void subtractY(int y) {
		this.setY(y - 1);
	}
	
	
	public boolean compare(int x, int y) {
		if(x == y) { return true; }
		return false;
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
