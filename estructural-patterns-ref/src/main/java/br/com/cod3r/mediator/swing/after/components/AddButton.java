package br.com.cod3r.mediator.swing.after.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import br.com.cod3r.mediator.swing.after.mediator.Mediator;

public class AddButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;
	
	public AddButton(Mediator mediator) {
		super("Click me!");
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mediator.buttonClicked();
			}
		});
	}
}
