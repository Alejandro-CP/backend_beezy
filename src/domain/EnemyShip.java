package domain;

import java.util.List;

public class EnemyShip extends GameObject{

	private int speed = 2;
	private int direction;
	
	public EnemyShip(int x, int y, int direction) {
		super(x, y);
		// direction must be 1 (move towards the right part of the screen) or -1 (move towards the right part of the screen)
		this.direction = direction;
	}

	@Override
	public void move() {
		// This method controls the EnemyShip movement.
		// It moves horizontally until reaching one of the horizontal borders, if so it goes down and it changes its direction
	}
	public void attack(GameObject player, List<GameObject> playingObjects) {
		if(player.positionX == this.positionX && player.positionY < this.positionY) {
			playingObjects.add(new Missile(this.positionX, this.positionY-1, -1));
		}
	}
	public boolean crossingInferiorBorder() {
		// This method controls if the enemy ship is trying to go through the inferior border.
		// return statement must be changed with correct logic condition
		return false;
	}
}
