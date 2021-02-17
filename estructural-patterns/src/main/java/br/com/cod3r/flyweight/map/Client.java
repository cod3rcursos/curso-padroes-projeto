package br.com.cod3r.flyweight.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.cod3r.flyweight.map.game.Map;

public class Client {

	public static void main(String[] args) throws IOException, InterruptedException {
		Map map = new Map();
		Integer score = 0;
		Integer reward;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while(!map.isGameOver()) {
			map.drawMap();
			System.out.println("Score: " + score);
			System.out.print("Enter a coord: ");
			String coord = buffer.readLine();
			reward = map.openCell(coord);
			score += reward;
			System.out.println(String.format("You won %d points on this move!", reward));
			Thread.sleep(1000);
		}
		System.out.println("\n\n\n\n\n\tGame Over!\n\n\tTotal Score: " + score + "\n\n\n\n\n");
	}
}
