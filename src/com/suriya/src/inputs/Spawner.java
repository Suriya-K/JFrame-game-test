package com.suriya.src.inputs;

import java.awt.Graphics2D;
import java.util.ArrayList;

import com.suriya.src.Main;
import com.suriya.src.objects.Enemy;

public class Spawner {

	static ArrayList<Enemy> spawnerE = new ArrayList<Enemy>();
	Enemy tempEnemy;
	int roomWIDTH = Main.WIDTH - 32;

	public int randomSpawnerPoint(int x) {
		int min = 0;
		int max = x;
		int range = (max - min) + 1;
		int rand = 0;
		rand = (int) (Math.random() * 32) * 100;
		return rand;
	}

	public Spawner() {

		for (int i = 0; i < 10; i++) {
			addedEnemy(new Enemy(0 + i * 48, 50));
		}

	}

	public void draw(Graphics2D g2d) {
		for (int i = 0; i < spawnerE.size(); i++) {
			tempEnemy = spawnerE.get(i);
			tempEnemy.draw(g2d);
		}
	}

	public void update() {
		for (int i = 0; i < spawnerE.size(); i++) {
			tempEnemy = spawnerE.get(i);
			tempEnemy.update();
		}
	}

	public void addedEnemy(Enemy enemy) {
		spawnerE.add(enemy);
	}

	public static void removeEnemy(Enemy enemy) {
		spawnerE.remove(enemy);
	}

	public static ArrayList<Enemy> getEnemyBorder() {
		return spawnerE;
	}
}
