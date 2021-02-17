package br.com.cod3r.observer.party.characters;

public class Wife {
	private Doorman doorman;
	
	public Wife(Doorman doorman) {
		this.doorman = doorman;
	}

	public void startPartyIfPossible() {
		if(doorman.getStatus()) {
			partyTime();
		} else {
			System.out.println("Hold!");
		}
	}
	
	public void partyTime() {
		System.out.println("Let´s Party! :D");
	}
}