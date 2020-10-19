package rucksack;

import java.awt.*;
import javax.swing.*;

public class GUI {
	
	public GUI() {
		
		JFrame frame = new JFrame();
		JButton button = new JButton("Test button");
		JLabel label = new JLabel("Test label");
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout());
		panel.add(button);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GUI();
	}

}
