package br.com.cod3r.prototype.animation.model;

import java.util.HashMap;
import java.util.Map;

public class PersonSamples {
	private Map<String, Person> samples;
	
	public PersonSamples() {
		samples = new HashMap<>();
		loadSamples();
	}
	
	public Person get(String type) {
		return samples.get(type);
	}
	
	private void loadSamples() {
		samples.put("stickMan", new Person(
				"                   ",
				"        o          ",
				"       /|\\          ",
				"_______/_\\___________"	
				));
		samples.put("fatMan", new Person(
				"                   ",
				"       (^ ^)          ",
				"       <)  )\\         ",
				"_______/__\\___________"	
				));
	}
}
