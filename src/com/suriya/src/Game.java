package com.suriya.src;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.suriya.src.inputs.Ammo;
import com.suriya.src.inputs.Keyinput;
import com.suriya.src.inputs.Spawner;
import com.suriya.src.objects.Bullet;
import com.suriya.src.objects.Enemy;
import com.suriya.src.objects.Player;

public class Game extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private String backgroundImgURL = "/img/Background.png";
	Timer gameLoop;
	Player p;
	Spawner spawnEnemy;
	static Ammo playerAmmo;
	Bullet playerBullet;

	// init
	public Game() {
		setFocusable(true);
		gameLoop = new Timer(10, this);
		gameLoop.start();
		p = new Player(Main.WIDTH/2, Main.HEIGHT-70);
		playerAmmo = new Ammo();
		spawnEnemy = new Spawner();
		addKeyListener(new Keyinput(p));
	}

	public void paint(Graphics g) {
		super.paint(g);
		// cast Graphics g into Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(getBackgroundImage(), 0, 0, this);
		p.draw(g2d);
		spawnEnemy.draw(g2d);
		playerAmmo.draw(g2d);
		
	}

	public Image getBackgroundImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(backgroundImgURL));
		return i.getImage();
	}

	// Update
	@Override
	public void actionPerformed(ActionEvent ae) {
		repaint();
		p.update();
		spawnEnemy.update();
		playerAmmo.update();
	}
}
