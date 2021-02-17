package br.com.cod3r.flyweight.musicPlayer.after.musicFlyweigth;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private static FlyWeightFactory instance = new FlyWeightFactory();
	private static Map<String, MusicFlyweight> musicFlyRepository;
	
	private FlyWeightFactory() {
		musicFlyRepository = new HashMap<String, MusicFlyweight>();
	}
	
	public static FlyWeightFactory getInstance() {
		return instance;
	}
	
	public MusicFlyweight getMusic(String desc) {
		MusicFlyweight mf = musicFlyRepository.get(desc);
		if(mf == null) {
			System.out.println("Creating new Flyweight for " + desc);
			mf = getMusicByString(desc);
			musicFlyRepository.put(desc, mf);
		}
		return mf;
	}
	
	private MusicFlyweight getMusicByString(String desc) {
		String[] musicData = desc.split(";");
		return new MusicFlyweight(musicData[0], musicData[1], new Integer(musicData[2]));
	}

	public Integer getSize() {
		return musicFlyRepository.size();
	}
}
