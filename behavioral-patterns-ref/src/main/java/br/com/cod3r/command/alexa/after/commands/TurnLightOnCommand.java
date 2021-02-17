package br.com.cod3r.command.alexa.after.commands;

import br.com.cod3r.command.alexa.after.lights.GenericLight;

public class TurnLightOnCommand implements Command {
	private GenericLight light;
	
	
	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
