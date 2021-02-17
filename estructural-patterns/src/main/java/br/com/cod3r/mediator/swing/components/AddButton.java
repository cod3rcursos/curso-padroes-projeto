package br.com.cod3r.mediator.swing.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AddButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;
	
	public AddButton(State state, Label label) {
		super("Click me!");
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				state.addCount();
				label.refresh();
				if(state.getCounter() == 10) {
					setEnabled(false);
				}
			}
		});
	}
}
