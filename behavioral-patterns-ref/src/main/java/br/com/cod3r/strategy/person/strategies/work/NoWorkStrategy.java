package br.com.cod3r.strategy.person.strategies.work;

import br.com.cod3r.strategy.person.strategies.work.WorkStrategy;

public class NoWorkStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I have no job. Dou you have some money?");
	}

}
