package br.com.cod3r.mediator.swing.components;

import javax.swing.JLabel;

public class Label extends JLabel {
	private static final long serialVersionUID = 4136663121512778435L;
	private State state;
	
	public Label(State state) {
		super("Times Clicked: 0");
		this.state = state;
	}

	public void refresh() {
		super.setText("Times Clicked: " + state.getCounter());
	}
}
