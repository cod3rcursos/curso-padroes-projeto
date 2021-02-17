package br.com.cod3r.command.alexa.after.lights;

public class PhillipsHueLight implements GenericLight {
	
	public void turnOn() {
		System.out.println("The PhillipsHueLight is On");
	}
	
	public void turnOff() {
		System.out.println("The PhillipsHueLight is Off");
	}
}
