package domain;

import java.util.List;

public class PlayerShip extends GameObject{
	
	private int speed = 2;
	
	public PlayerShip(int x, int y) {
		super(x, y);
	}

	@Override
	public void move() {
		// Here the movement of the player spaceship is computed taking into account 
		// the dimensions of the playing screen (so the object it is not allowed to go outside its borders)
		// and the directions the user inputs (captured by the Main class).	
	}
	
	public void attack(List<GameObject> playingObjects) {
		// Action triggered by the user in the Main class through the correct command
		// A new missile going upwards is created
		playingObjects.add(new Missile(this.positionX, this.positionY+1, 1));		
	}

}
