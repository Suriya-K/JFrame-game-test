package com.suriya.src;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public final static int WIDTH = 640, HEIGHT = 480;
	public static JFrame frame = null;

	public static void main(String args[]) {
		frame = new JFrame("Test game");
		frame.pack();
		frame.setSize(WIDTH, HEIGHT);
		frame.add(new Game());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Object
		//
		frame.setVisible(true);
	}
}
