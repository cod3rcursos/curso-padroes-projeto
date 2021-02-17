package br.com.cod3r.observer.swing;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Client {

	public static void main(String[] args) {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JLabel title = new JLabel("Counter");
		frame.add(title, BorderLayout.NORTH);

		JButton b1 = new JButton("Button #1");
		JButton b2 = new JButton("Button #2");
		
		frame.add(b1, BorderLayout.WEST);
		frame.add(b2, BorderLayout.EAST);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		
		
		frame.add(labelPanel, BorderLayout.CENTER);
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
}
