package br.com.cod3r.mediator.swing.components;


public class State {
	private int counter;
	
	public State() {
		counter = 0;
	}
	
	public void addCount() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
