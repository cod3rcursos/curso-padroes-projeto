package br.com.cod3r.template.sales.model;

public class Buyer {
	private String name;
	private Integer distance; 
	private boolean specialClient;
	
	public Buyer(String name, Integer distance, boolean specialClient) {
		this.name = name;
		this.distance = distance;
		this.specialClient = specialClient;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public boolean isSpecialClient() {
		return specialClient;
	}

	public void setSpecialClient(boolean specialClient) {
		this.specialClient = specialClient;
	}	
}