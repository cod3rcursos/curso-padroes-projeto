package br.com.cod3r.state.pacman.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private boolean exit = false;
    private List<GameEventListener> listeners = new ArrayList<>();

    public void addListener(GameEventListener listener) {
        listeners.add(listener);
    }
    
    public void startLoop() throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hi! I'm a good ghost. Help me to catch that bad PacMan...");
		while(exit == false) {
			System.out.println("Choose what will happen next...\n1: Spot the PacMan\n"
					+ "2: Lose the PacMan\n3: PacMan turns special\n4: PacMan is regular again\n"
					+ "5: Eaten by PacMan\n6: Reach the base\n0: Exit");
			String option = buffer.readLine();
            System.out.println("\n\n");
            listeners.forEach(l -> l.onAction(option));
			System.out.println("\n\n");
		}
		System.out.println("Ok! Let's play again later?");
    }

    public void stopLoop() {
        exit = true;
    }
}
