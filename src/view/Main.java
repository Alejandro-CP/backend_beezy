package view;

import controller.GameController;
import domain.GameSetting;
import domain.PlayerShip;


public class Main {
	
	private static GameController controller = new GameController();
	private static GameSetting settings = new GameSetting();

	public static void main(String[] args) {
		
		// Welcome screen
		// Show settings screen to allow player choose screen size, number of initial enemies, and allowing random generated new enemies
		// Draw initial screen
		// Create new PlayerShip
		PlayerShip player = new PlayerShip(settings.getScreenMaxX()/2,settings.getScreenMaxY()/4);
		// Initialize game
		controller.initializeGame(player, settings);
		// Game flow
		while(!controller.endingGame()) {
			// Clear collisions list (resolved in previous step)
			// Randomly add new GameObject (enemies/obstacles), if possibility chosen by player
			// Draw GameObject collection 
			// Catch player interaction
			// Movement & attacks from all enemy GameObject
			// Update collision list
			// Remove objects involved in any collision
			
		}
		
		// Show GAME OVER screen

	}

}
