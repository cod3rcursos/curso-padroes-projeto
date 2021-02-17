package br.com.cod3r.flyweight.map.game;

import java.util.Random;

import br.com.cod3r.flyweight.map.model.Pixel;
import br.com.cod3r.flyweight.map.model.PixelFactory;

public class Map {
	private static final Integer TRYS = 10;
	private static final Integer MAP_ROWS = 10;
	private static final Integer MAP_COLUMNS = 10;
	
	private Pixel[][] map;
	private Integer trysRemaining;
	
	public Map() {
		map = createMap();
		trysRemaining = TRYS;
	}
	
	private Pixel[][] createMap() {
		Pixel[][] map = new Pixel[MAP_ROWS][MAP_COLUMNS];
		for(int row = 0; row < map.length; row++) {
			for(int column = 0; column < map[row].length; column++) {
				int pix = sort();
				Pixel pixel = null;
				switch (pix) {
				case 0: 
					pixel = new Pixel(PixelFactory.getInstance().getPixelType('$', 100), false);
					break;
				case 1: 
					pixel = new Pixel(PixelFactory.getInstance().getPixelType('%', 50), false);
					break;
				case 2: 
					pixel = new Pixel(PixelFactory.getInstance().getPixelType('X', -50), false);
					break;
				case 3: 
					pixel = new Pixel(PixelFactory.getInstance().getPixelType('@', -100), false);
					break;
				default:
					pixel = new Pixel(PixelFactory.getInstance().getPixelType(' ', 0), false);
					break;
				}
				map[row][column] = pixel; 
			}
		}
		return map;
	}
	
	public void drawMap() {
		System.out.println("----------------");
		System.out.print(" ");
		for(int title = 0; title < MAP_COLUMNS; title++) 	
			System.out.print(" " + title);
		for(int row = 0; row < map.length; row++) {
			System.out.print("\n" + row);
			for(int column = 0; column < map[row].length; column++) {
				Pixel cell = map[row][column];
				System.out.print(' ');
				System.out.print(cell.isOppened()? cell.getType().getCharacter() : '#');
			}
		}
		System.out.println(String.format("\nYou have %d trys left", trysRemaining));
	}
	
	public Integer openCell(String coord) {
		if(coord.length() != 2) return 0;
		Integer row = null;
		Integer column = null;
		try {
			row = new Integer(coord.substring(0,1));
			column = new Integer(coord.substring(1,2));			
		} catch(NumberFormatException e) {
			return 0;
		}
		Pixel choosen = map[row][column];
		if(!choosen.isOppened()) {
			choosen.setOppened(true);
			trysRemaining--;
			return choosen.getType().getTreasureReward();
		}
		return 0;
	}
	
	public boolean isGameOver() {
		return trysRemaining == 0;
	}
	
	private int sort() {
		Random r = new Random();
		return r.nextInt(10);
	}
}
