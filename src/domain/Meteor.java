package domain;

public class Meteor extends GameObject{
	
	// Constants for generating a random angle for meteor movement.
	// Taking into account a 4-quadrant plane only angles between 181 and 359 degrees are allowed for a downwards trajectory.
	// Angles between 1 and 179 degrees would be acceptable for upwards trajectory (not our case).
	// Angles of 0 and 180 degrees will generate a horizontal trajectory (not our case)
	private final double MIN_ANGLE = 181;
	private final double MAX_ANGLE = 359;
	
	// Limits for generating a random speed for the meteor
	private final double MIN_SPEED = 1;
	private final double MAX_SPEED = 10;
	
	private double angle, speed;
	
	public Meteor(int x, int y) {
		super(x,y);
		angle = MIN_ANGLE + (MAX_ANGLE-MIN_ANGLE)*Math.random();
		speed = MIN_SPEED + (MAX_SPEED-MIN_SPEED)*Math.random();
	}

	@Override
	public void move() {
		// Using trigonometric functions movement in X-Y coordinates must be calculated according to the speed and angle of the meteor
		// For movement in coordinate X: speed*cos(angle). Values can be positive or negative (meteor can move right/left from its original position)
		// For movement in coordinate Y: speed*sin(angle). Values will always be negative (meteor can only move downwards)
		this.positionX += (int)(speed*Math.cos(Math.toRadians(angle)));
		this.positionY += (int)(speed*Math.sin(Math.toRadians(angle)));
	}
	
	public boolean touchingScreenBorder(GameSetting setting) {
		// Controls if the meteor reaches the screen borders.
		return this.positionX == 0 || this.positionX == setting.getScreenMaxX()-1 || this.positionY == 0;
	}
}
