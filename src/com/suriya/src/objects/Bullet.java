package com.suriya.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.suriya.src.inputs.Ammo;
import com.suriya.src.inputs.Spawner;

public class Bullet extends Player {
	private ArrayList<Enemy> e = Spawner.getEnemyBorder();
	public Bullet(int x, int y) {
		super(x, y);
	}

	private String bulletImgURL = "/img/test_bullet.png";

	public void update() {
		y -= 5;
		checkEnemyCollision();
		checkOutofScreen();
	}
	
	public void checkEnemyCollision() {
		for (int i = 0; i < e.size(); i++) {
			if(getBorder().intersects(e.get(i).getBorder())) {
				Ammo.removeBullet(this);
				e.remove(i);
			}
		}
	}
	
	public void checkOutofScreen() {
		if(y < 0) {
			Ammo.removeBullet(this);
		}
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getbulletImages(), x, y, null);
	}

	public Image getbulletImages() {
		ImageIcon i = new ImageIcon(getClass().getResource(bulletImgURL));
		return i.getImage();
	}

	public Rectangle getBorder() {
		return new Rectangle(x, y, 4, 16);
	}
}
