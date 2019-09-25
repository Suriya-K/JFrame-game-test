package com.suriya.src;

import javax.swing.JFrame;

public class Main {
	public static JFrame frame = null;

	public static void main(String args[]) {
		frame = new JFrame("Test game");
		frame.pack();
		frame.setSize(640, 480);
		frame.add(new Game());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Object
		//
		frame.setVisible(true);
	}
}
