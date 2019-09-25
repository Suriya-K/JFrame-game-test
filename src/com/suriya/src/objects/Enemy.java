package com.suriya.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.suriya.src.GlobalPositions;

public class Enemy extends GlobalPositions {
	private String EnemyURL = "/img/test.png";
	public Enemy(int x, int y) {
		super(x, y);
	}

	public void start() {

	}

	public void update() {

	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getImageEnemy(), x, y, null);
	}
	
	public Image getImageEnemy() {
		ImageIcon i = new ImageIcon(getClass().getResource(EnemyURL));
		return i.getImage();
	}

}
