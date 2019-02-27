package domain;

public class GameSetting {
	// Right now this class only holds a fixed screen settings, number of initial enemy objects, and enabling new random generated enemies
	// Possible upgrades: allowing variable speed for spaceships, changing screen resolution
	
	private int screenMaxX;
	private int screenMaxY;
	
	private int initialEnemies;
	
	private boolean allowRandomEnemies;
	
	public GameSetting(){
		setScreenMaxX(768);
		setScreenMaxY(1024);
		setInitialEnemies(10);
		setAllowRandomEnemies(false);
	}

	public int getScreenMaxX() {
		return screenMaxX;
	}

	public void setScreenMaxX(int screenMaxX) {
		this.screenMaxX = screenMaxX;
	}

	public int getScreenMaxY() {
		return screenMaxY;
	}

	public void setScreenMaxY(int screenMaxY) {
		this.screenMaxY = screenMaxY;
	}

	public int getInitialEnemies() {
		return initialEnemies;
	}

	public void setInitialEnemies(int initialEnemies) {
		this.initialEnemies = initialEnemies;
	}

	public boolean isAllowRandomEnemies() {
		return allowRandomEnemies;
	}

	public void setAllowRandomEnemies(boolean allowRandomEnemies) {
		this.allowRandomEnemies = allowRandomEnemies;
	}
	
}
