package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class ReturnToBaseState implements GhostState {
	private static final ReturnToBaseState instance = new ReturnToBaseState();
	private ReturnToBaseState() {};
	
	public static ReturnToBaseState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("I'll haunt him, now that I'm a ghost of a ghost...");
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println("I was hopping this before...");
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		System.out.println("I saw!");
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		System.out.println("Too late!");
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		System.out.println("Again? No!");
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("It's clear now! I want my Revenge!");
		ghost.setState(WanderMazeState.getInstance());
	}
}
