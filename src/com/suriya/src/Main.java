package com.suriya.src;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Test game");
		frame.pack();
		frame.setSize(640, 480);
		frame.add(new Game());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		// Object
		
		//
		frame.setVisible(true);
	}
}
