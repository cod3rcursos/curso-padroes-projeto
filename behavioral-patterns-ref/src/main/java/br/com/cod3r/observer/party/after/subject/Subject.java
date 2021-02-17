package br.com.cod3r.observer.party.after.subject;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.observer.party.after.observers.Observer;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(boolean status) {
		for(Observer o: observers) {
			o.update(status);
		}
	}
}
