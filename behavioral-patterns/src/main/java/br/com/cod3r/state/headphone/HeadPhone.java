package br.com.cod3r.state.headphone;

public class HeadPhone {
	private boolean isOn;
	private boolean isPlaying;
	
	public HeadPhone() {
		this.isOn = false;
		this.isPlaying = false;
	}
	
	public void onLongClick() {
		System.out.println("Long Click Pressed...");
		if(isOn) {
			System.out.println("> Turning Off");
			isOn = false;
		} else {
			System.out.println("> Turning On");
			isOn = true;
		}
	}
	
	public void onClick() {
		System.out.println("Click Pressed...");
		if(isOn) {
			if(isPlaying) {
				System.out.println("> Stop Player");
				isPlaying = false;
			} else {
				System.out.println("> Resume Player");
				isPlaying = true;
			}
		}
	}
}
