package com.suriya.src.inputs;
import java.awt.Graphics2D;
import java.util.ArrayList;

import com.suriya.src.objects.Enemy;
public class Spawner {

	ArrayList<Enemy> spawnerE = new ArrayList<Enemy>();
	Enemy tempEnemy;
	
	public Spawner() {
		addedEnemy(new Enemy(100,50));
	}
	public void draw(Graphics2D g2d ) {
		for (int i = 0; i < spawnerE.size(); i++) {
			tempEnemy = spawnerE.get(i);
			tempEnemy.draw(g2d);
			System.out.println(spawnerE.size());
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
}
