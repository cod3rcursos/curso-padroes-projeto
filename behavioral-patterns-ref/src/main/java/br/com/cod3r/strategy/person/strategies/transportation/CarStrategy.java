package br.com.cod3r.strategy.person.strategies.transportation;

public class CarStrategy implements TransportationStrategy {

	@Override
	public void move() {
		System.out.println("I use a Car to go anywhere");
	}

}
