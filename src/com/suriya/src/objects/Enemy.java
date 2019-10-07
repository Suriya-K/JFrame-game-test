package com.suriya.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.suriya.src.GlobalPositions;
import com.suriya.src.Main;
import com.suriya.src.inputs.Ammo;
import com.suriya.src.inputs.Spawner;

public class Enemy extends GlobalPositions {
	private String EnemyURL = "/img/enemy.png";
	int spd = 2, vspd = 33;

	public Enemy(int x, int y) {
		super(x, y);
	}

	public void start() {

	}

	public void update() {
		x += spd;
		if (x > Main.WIDTH - 32) {
			spd = -2;
			y += vspd;
			
		}
		if (x < 0) {
			spd = 2;
			y += vspd;
		}
		if(y > Main.HEIGHT) {
			Spawner.removeEnemy(this);
		}
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getImageEnemy(), x, y, null);
//		g2d.drawRect(32,32,32,32);
	}

	public Image getImageEnemy() {
		ImageIcon i = new ImageIcon(getClass().getResource(EnemyURL));
		return i.getImage();
	}
	
	public Rectangle getBorder() {
		return new Rectangle(x, y, 32, 32);
	}

}
