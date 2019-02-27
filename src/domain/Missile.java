package domain;

public class Missile extends GameObject{
	
	// Missile speed to be modified as required
	private final int MISSILE_SPEED = 1;
	//Missile direction path: 1 upwards (player's missile), -1 downwards (enemy's missile)
	private int direction;
	
	public Missile(int x, int y, int direction) {
		super(x,y);
		this.direction = direction;
	}

	@Override
	public void move() {
		//Missiles can only advance vertically
		this.positionY += direction*MISSILE_SPEED;
	}
	
	public boolean touchingScreenBorder(GameSetting setting) {
		// Controls if the missile reaches the screen borders.
		return this.positionY == 0 || this.positionY == setting.getScreenMaxY()-1;
	}
	
	
}
