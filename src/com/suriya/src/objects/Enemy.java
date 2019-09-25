package com.suriya.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.suriya.src.GlobalPositions;
import com.suriya.src.Main;

public class Enemy extends GlobalPositions {
	private String EnemyURL = "/img/test.png";
	int spd = 5;

	public Enemy(int x, int y) {
		super(x, y);
	}

	public void start() {

	}

	public void update() {
		x += spd;
		if (x > Main.WIDTH - 32) {
			spd = -5;
		}
		if (x < 0) {
			spd = 5;
		}
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getImageEnemy(), x, y, null);
	}

	public Image getImageEnemy() {
		ImageIcon i = new ImageIcon(getClass().getResource(EnemyURL));
		return i.getImage();
	}

}
