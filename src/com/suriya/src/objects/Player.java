package com.suriya.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.suriya.src.Main;
import com.suriya.src.inputs.Ammo;
import com.suriya.src.inputs.Spawner;
import com.suriya.src.Game;
import com.suriya.src.GlobalPositions;

public class Player extends GlobalPositions {

	private String playerImgURL = "/img/test.png";
	private ArrayList<Enemy> e = Spawner.getEnemyBorder();
	Enemy en = new Enemy(50, 50);

	int xDir = 0, yDir = 0;
	int roomWidthBorder = 640 - 32;
	int roowHeightBorder = 480 - 32;

	public Player(int x, int y) {
		super(x, y);
	}

	public void update() {
//		System.out.println("coordinate [X "+x+" | "+"Y "+y+"]");
		x += xDir;
		y += yDir;

		// collision windows
		setWindowsdCollison();
		setEnemyCollision();

	}

	public void setEnemyCollision() {
		for (int i = 0; i < e.size(); i++) {
			if (getBorder().intersects(e.get(i).getBorder())) {
				System.out.println("Collison");
			}
		}

	}

	public void setWindowsdCollison() {
		if (x < 0) {
			x = 0;
		}
		if (x > roomWidthBorder) {
			x = roomWidthBorder;
		}

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
		case KeyEvent.VK_SPACE:
			Ammo.createBullet(new Bullet(x + 16, y-16));
			break;
		case KeyEvent.VK_UP:
			yDir = -2;
			break;
		case KeyEvent.VK_DOWN:
			yDir = 2;
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
		case KeyEvent.VK_UP:
			yDir = 0;
			break;
		case KeyEvent.VK_DOWN:
			yDir = 0;
		}
//		if (key == KeyEvent.VK_RIGHT) {
//			xDir = 0;
//		} else if (key == KeyEvent.VK_LEFT) {
//			xDir = 0;
//		}
	}

	public Rectangle getBorder() {
		return new Rectangle(x, y, 32, 32);
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);
	}

	public Image getPlayerImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(playerImgURL));
		return i.getImage();
	}
}
