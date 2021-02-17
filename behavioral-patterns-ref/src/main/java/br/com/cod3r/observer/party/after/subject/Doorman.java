package br.com.cod3r.observer.party.after.subject;

public class Doorman extends Subject {
	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		this.status = newStatus;
		notifyObservers(newStatus);
	}
}
