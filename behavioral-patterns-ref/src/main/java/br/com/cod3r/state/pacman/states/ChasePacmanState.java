package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class ChasePacmanState implements GhostState {
	private static final ChasePacmanState instance = new ChasePacmanState();
	private ChasePacmanState() {};
	
	public static ChasePacmanState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("I know, I'm already chasing him...");
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println("The Pacman ran away, let's find him again");
		ghost.setState(WanderMazeState.getInstance());
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		System.out.println("Oh no! We have a Super PacMan now, better hide!");
		ghost.setState(FleePacmanState.getInstance());
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		System.out.println("But he was normal already...");
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		System.out.println("Are you joking? It's impossible to be eaten by a normal PacMan...");
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("I wasn't going to the base...");
	}
}
