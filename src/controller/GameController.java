package controller;

import java.util.ArrayList;
import java.util.List;

import domain.*;

public class GameController {
	
	private List<GameObject> playingObjects;
	private CollisionDetector detector;
	private List<Collision> collisionList;
	
	public GameController() {
		playingObjects = new ArrayList<>();
		detector = new CollisionDetector();
		collisionList = new ArrayList<>();
	}
	
	public void initializeGame(PlayerShip player, GameSetting settings) {
		// The player spaceship is added to the GameObject collection ate the beginning of the game
		// Its initial placement is defined in the bottom quarter of the screen, centered
		playingObjects.add(player);
		// Initial number of enemies are added to the GameObject collection
		addGameObjects(settings.getInitialEnemies());
		
	}
	
	public boolean endingGame() {
		// The player spaceship will always have the index 0 in the GameObject collection
		// The game will only end if the player spaceship collides with another object
		for(Collision collision : collisionList) {
			if((playingObjects.indexOf(collision.getParticipantA()) == 0) || 
				(playingObjects.indexOf(collision.getParticipantB()) == 0)) {
				return true;
			}
		}
		return false;
	}
	
	public void clearCollisions() {
		//This method clears the collision list;
	}
	
	public void updateCollisions() {
		//This method updates the collision list
		collisionList = detector.getCollisions(playingObjects);
	}
	
	public void removeGameObjects(){
		// This method updates the collision list every round and removes the objects involved in a collision form the GameObject collection.
		// It also takes care of removing from the GameObject collection any object which is trying to cross the screen borders
		// (meteors crossing any border and enemy ships trying to cross the bottom border)
	}
	
	public void addGameObjects(int quantity) {
		// This method add enemy GameObjects (EnemyShip, Meteor, or Wormhole) to the GameObject collection.
		// Attack created objects (Missile) are added to the GameObjects collection 
		// by the classes which create them (PlayerShip & EnemyShip).
		// New GameObjects are added at initialization and through the execution of the game (only if player chooses so)
		// Already added objects must be taken into account so a new GameObject does not collide with them 
		// or wormhole action radius dose no affect player spaceship
		// New wormholes can appear at any position in the screen, enemy ships and meteors must appear at the top of the screen
		// Taking into account all these restrictions, whose logic must be implemented, the instruction for adding new GameObjects
		// is similar to: playingObjects.add(new GameObject(positionX,positionY), 
		// GameObject must be exchanged with Meteor, Wormhole or EnemyShip
	}
	
	public void moveEnemies() {
		// A loop goes through the GameObject collection executing the move method for all of them, excluding index 0, which is the player ship
	}
	
	public void attackFromEnemies() {
		// A loop goes through the GameObject collection executing the attack method for all of them, excluding index 0, which is the player ship
	}
	
}
