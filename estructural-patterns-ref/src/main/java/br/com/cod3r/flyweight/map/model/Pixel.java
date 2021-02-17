package br.com.cod3r.flyweight.map.model;

public class Pixel {
	private PixelType type;
	private boolean oppened;
	
	public Pixel(PixelType type, boolean oppened) {
		this.type = type;
		this.oppened = oppened;
	}

	public PixelType getType() {
		return type;
	}

	public void setType(PixelType type) {
		this.type = type;
	}

	public boolean isOppened() {
		return oppened;
	}

	public void setOppened(boolean oppened) {
		this.oppened = oppened;
	}
}
