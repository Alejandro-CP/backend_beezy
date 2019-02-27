package domain;

public abstract class GameObject {
	protected int positionX;
	protected int positionY;
	
	public GameObject(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
	
	// Abstract methods to be implemented at each GameObject child class
	public abstract void move();
	
}
