package com.suriya.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;

import com.suriya.src.GlobalPositions;

public class Player extends GlobalPositions {

	private String playerImgURL = "/img/test.png";
	int xDir = 0, yDir = 0;

	public Player(int x, int y) {
		super(x, y);
	}

	public void update() {
		x += xDir;
		y += yDir;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		switch (key) {
		case KeyEvent.VK_RIGHT:
			xDir = 2;
			break;
		case KeyEvent.VK_LEFT:
			xDir = -2;
			break;
		}
//		if (key == KeyEvent.VK_RIGHT) {
//			xDir = 5;
//		} else if (key == KeyEvent.VK_LEFT) {
//			xDir = -5;
//		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		switch (key) {
		case KeyEvent.VK_RIGHT:
			xDir = 0;
			break;
		case KeyEvent.VK_LEFT:
			xDir = 0;
			break;
		}
//		if (key == KeyEvent.VK_RIGHT) {
//			xDir = 0;
//		} else if (key == KeyEvent.VK_LEFT) {
//			xDir = 0;
//		}
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);
	}

	public Image getPlayerImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(playerImgURL));
		return i.getImage();
	}
}
