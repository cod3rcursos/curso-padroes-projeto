package br.com.cod3r.flyweight.map.model;

import java.util.HashMap;
import java.util.Map;

public class PixelFactory {
	private static PixelFactory instance = new PixelFactory();
	private static Map<Character, PixelType> pixelRepository;
	
	private PixelFactory() {
		pixelRepository = new HashMap<Character, PixelType>();
	}
	
	public static PixelFactory getInstance() {
		return instance;
	}
	
	public PixelType getPixelType(Character character, Integer treasureReward) {
		PixelType pt = pixelRepository.get(character);
		if(pt == null) {
			System.out.println("Creating new Flyweight for " + character);
			pt = new PixelType(character, treasureReward);
			pixelRepository.put(character, pt);
		}
		return pt;
	}
}
