package br.com.cod3r.mediator.swing.after.components;

import java.awt.Font;

import javax.swing.JLabel;

import br.com.cod3r.mediator.swing.after.mediator.Mediator;

public class Label extends JLabel {
	private static final long serialVersionUID = 4136663121512778435L;
	private Mediator mediator;
	
	public Label(Mediator mediator) {
		super("Times Clicked: 0");
		setFont(new Font(getFont().getName(), Font.BOLD, 30));

		this.mediator = mediator;
	}

	public void refresh() {
		super.setText("Times Clicked: " + mediator.getCounterValue());
	}
}
