package br.com.cod3r.state.pacman;

import java.io.IOException;

import br.com.cod3r.state.pacman.game.Game;

public class Client {

	public static void main(String[] args) throws IOException {
		Ghost ghost = new Ghost();

		Game game = new Game();
		game.addListener(option -> {
			switch (option) {
				case "1": ghost.spotPacman(); break;
				case "2": ghost.losePacman(); break;
				case "3": ghost.pacmanTurnsSpecial(); break;
				case "4": ghost.pacmanTurnsNormal(); break;
				case "5": ghost.eatenByPacman(); break;
				case "6": ghost.reachTheBase(); break;
				case "0": game.stopLoop(); break;
				default: System.out.println("Invalid Option"); break;
			}
		});

		game.startLoop();
	}
}
