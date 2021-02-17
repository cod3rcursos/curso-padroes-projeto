package br.com.cod3r.mediator.swing.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResetButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;
	
	public ResetButton(State state, Label label, AddButton button) {
		super("Reset");
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				state.setCounter(0);
				button.setEnabled(true);
				label.refresh();
			}
		});
	}

}
