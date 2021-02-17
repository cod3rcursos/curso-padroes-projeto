package br.com.cod3r.mediator.swing.after.components;

import br.com.cod3r.mediator.swing.after.mediator.Mediator;

public class State {
	private Mediator mediator;
	private int counter;
	
	public State(Mediator mediator) {
		this.mediator = mediator;
		counter = 0;
	}
	
	public void addCount() {
		counter++;
		if(counter == 10) {
			mediator.stop();
		}
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
