package br.com.cod3r.observer.swing;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		Label labelB1 = new Label("Button 1");
		Label labelB1B2 = new Label("Button 1/2");
		Label labelB2 = new Label("Button 2");
		labelPanel.add(labelB1);
		labelPanel.add(labelB1B2);
		labelPanel.add(labelB2);

		frame.add(labelPanel, BorderLayout.CENTER);

		Button b1 = new Button("Button #1", labelB1, labelB1B2);
		Button b2 = new Button("Button #2", labelB1B2, labelB2);

		frame.add(b1, BorderLayout.WEST);
		frame.add(b2, BorderLayout.EAST);

		frame.setSize(800, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
