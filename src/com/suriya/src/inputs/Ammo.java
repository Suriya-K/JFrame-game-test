package com.suriya.src.inputs;

import java.awt.Graphics2D;
import java.util.ArrayList;

import com.suriya.src.Main;
import com.suriya.src.objects.Bullet;
import com.suriya.src.objects.Player;

public class Ammo {
	static ArrayList<Bullet> Am = new ArrayList<Bullet>();
	Bullet tempBullet;
	Player p ;
	int roomWIDTH = Main.WIDTH - 32;
	
	public Ammo() {
//		createBullet(new Bullet(640/2, 480/2));
//		Am.add(new Bullet(640/2, 480/2));
//		Am.add(new Bullet(680/2, 480/2));
	}

	public void draw(Graphics2D g2d) {
		for (int i = 0; i < Am.size(); i++) {
			tempBullet = Am.get(i);
			tempBullet.draw(g2d);
		}
	}

	public void update() {
		for (int i = 0; i < Am.size(); i++) {
			tempBullet = Am.get(i);
			tempBullet.update();
		}
	}

	public static void createBullet(Bullet b) {
		Am.add(b);
	}

	public static void removeBullet(Bullet b) {
		Am.remove(b);
	}

	public static ArrayList<Bullet> getEnemyBorder() {
		return Am;
	}
}
