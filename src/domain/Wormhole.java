package domain;

public class Wormhole extends GameObject{
	private int atractionRadius;
	private int atractionForce = 1;

	public Wormhole(int x, int y, int atractionRadius) {
		super(x, y);
		this.atractionRadius = atractionRadius;
	}

	@Override
	public void move() {
		// Wormholes do not move		
	}

	public void attack(GameObject player) {
		// A wormhole attracts towards its center any object within its pulling radius with a certain pulling force 
		// modifying its trajectory.
		
		// Modification of flying objects X coordinate
		if((player.positionX >= this.positionX - atractionRadius) && (player.positionX < this.positionX)){
			player.positionX += atractionForce;
		}
		if((player.positionX <= this.positionX + atractionRadius) && (player.positionX > this.positionX)){
			player.positionX -= atractionForce;
		}
		
		// Modification of flyingObject Y coordinate
		if((player.positionY >= this.positionY - atractionRadius) && (player.positionY < this.positionY)){
			player.positionY += atractionForce;
		}
		if((player.positionY <= this.positionY + atractionRadius) && (player.positionY > this.positionY)){
			player.positionY -= atractionForce;
		}

	}
}
