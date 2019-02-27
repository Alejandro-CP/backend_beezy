package domain;

import java.util.ArrayList;
import java.util.List;

public class CollisionDetector {
	private List<Collision> collisionList;
	
	public CollisionDetector() {
		collisionList = new ArrayList<>();
	}
	
	public List<Collision> getCollisions(List<GameObject> flyingObjects){
		// Second part
		for(int i = 0; i < flyingObjects.size(); i++) {
			for(int j = i; j < flyingObjects.size(); j++) {
				if(flyingObjects.get(i).positionX == flyingObjects.get(j).positionX &&
						flyingObjects.get(i).positionY == flyingObjects.get(j).positionY) {
					
					collisionList.add(new Collision(flyingObjects.get(i), flyingObjects.get(j)));
				}
			}
		}
		return collisionList;
	}
	
	

}
