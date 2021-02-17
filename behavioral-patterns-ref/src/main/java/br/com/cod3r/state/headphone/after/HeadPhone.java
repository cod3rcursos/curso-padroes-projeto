package br.com.cod3r.state.headphone.after;

import br.com.cod3r.state.headphone.after.states.HPState;
import br.com.cod3r.state.headphone.after.states.OffState;

public class HeadPhone {
	private HPState state;
	private boolean isOn;
	private boolean isPlaying;
	
	public HeadPhone() {
		this.isOn = false;
		this.isPlaying = false;
		state = OffState.getInstance();
	}
	
	public void onLongClick() {
		System.out.println("Long Click Pressed...");
		state.longClick(this);
	}
	
	public void onClick() {
		System.out.println("Click Pressed...");
		state.click(this);
	}

	public HPState getState() {
		return state;
	}

	public void setState(HPState state) {
		System.out.println(String.format("Changing from %s to %s", 
				this.state.getClass().getSimpleName(), 
				state.getClass().getSimpleName()));
		this.state = state;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
}
