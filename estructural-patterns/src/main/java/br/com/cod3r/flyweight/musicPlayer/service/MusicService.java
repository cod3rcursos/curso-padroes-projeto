package br.com.cod3r.flyweight.musicPlayer.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.cod3r.flyweight.musicPlayer.model.Music;

public class MusicService {
	private Map<String, Map<String, Music>> memory;
	
	public MusicService() {
		memory = new HashMap<String, Map<String, Music>>();
	}
	
	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = memory.get(user);
		if(userPlayList == null) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}
		
		Music song = userPlayList.get(desc);
		if(song == null) {
			song = getMusicByString(desc);
			userPlayList.put(desc, song);
		}
		System.out.println(String.format("%s is listenning '%s'", 
				user, song.getName()));
		song.listenning();
	}
	
	private Music getMusicByString(String desc) {
		String[] musicData = desc.split(";");
		return new Music(musicData[0], musicData[1], new Integer(musicData[2]));
	}
	
	public void report() {
		int musicInMemory = 0;
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			System.out.println("---------");
			System.out.println(user + " has listen...");
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				System.out.println(String.format("%s/%s %d times", 
						music.getArtist(), music.getName(), music.getPlayerQty()));
				timeCounter += (music.getPlayerQty() * music.getDurationInSeconds());
				musicInMemory++;
			}
			System.out.println(String.format("%s has listen music for %d seconds", user, timeCounter));
		}
		System.out.println("Total of musics in memory: " + musicInMemory);
	}
}
