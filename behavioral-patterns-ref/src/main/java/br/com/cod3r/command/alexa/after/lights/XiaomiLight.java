package br.com.cod3r.command.alexa.after.lights;

public class XiaomiLight implements GenericLight {
	
	public void turnOn() {
		System.out.println("The XiaomiLight is On");
	}
	
	public void turnOff() {
		System.out.println("The XiaomiLight is Off");
	}
}
