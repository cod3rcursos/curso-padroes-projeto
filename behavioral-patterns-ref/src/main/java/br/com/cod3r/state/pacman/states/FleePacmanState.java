package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class FleePacmanState implements GhostState {
	private static final FleePacmanState instance = new FleePacmanState();
	private FleePacmanState() {};
	
	public static FleePacmanState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("I don't wanna see him, turn back...");
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println("Actually, he loses ME...");
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		System.out.println("I know! I'm already running...");		
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		System.out.println("That was close, I'll find him again!");
		ghost.setState(WanderMazeState.getInstance());
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		System.out.println("Oh no! I'll be back!");
		ghost.setState(ReturnToBaseState.getInstance());
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("I wasn't going to the base... yet!");
	}
}
