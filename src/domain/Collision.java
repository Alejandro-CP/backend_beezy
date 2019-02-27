package domain;

public class Collision {
	private GameObject participantA;
	private GameObject participantB;
	
	public Collision(GameObject participantA, GameObject participantB) {
		this.participantA = participantA;
		this.participantB = participantB;
	}
	
	public GameObject getParticipantA() {
		return participantA;
	}
	
	public GameObject getParticipantB() {
		return participantB;
	}
}
