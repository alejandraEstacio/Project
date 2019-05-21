package model;

import java.io.Serializable;

public class Character implements Serializable {
	

	public static final String RIGHT="data/userR.png";
	public static final String LEFT="data/userL.png";
	
	private String image;
		
	private int longer;
	private int width;
	
	private int posX;
	private int posY;
	
	private boolean shoot;
	
	private Shooting bullet;

	public Character(String image) {
		this.image=image;
		
		posX=(VideoGame.WIDTH_WIMDOW/2)-getWidth();
		posY=(VideoGame.LONG_WINDOW-100);
		
		longer=90;
		width=60;
		
		this.shoot= false;
		bullet=new Shooting(0);
		reloadP();
	}
	
	
	
	
	public String getImage() {
		return image;
	}




	public void setImage(String image) {
		this.image = image;
	}




	public int getLonger() {
		return longer;
	}




	public void setLonger(int longer) {
		this.longer = longer;
	}




	public int getWidth() {
		return width;
	}




	public void setWidth(int width) {
		this.width = width;
	}




	public int getPosX() {
		return posX;
	}




	public void setPosX(int posX) {
		this.posX = posX;
	}




	public int getPosY() {
		return posY;
	}




	public void setPosY(int posY) {
		this.posY = posY;
	}




	public boolean isShoot() {
		return shoot;
	}




	public void setShoot(boolean shoot) {
		this.shoot = shoot;
	}




	public Shooting getBullet() {
		return bullet;
	}




	public void setBullet(Shooting bullet) {
		this.bullet = bullet;
	}




	public static String getRight() {
		return RIGHT;
	}




	public static String getLeft() {
		return LEFT;
	}




	public void reloadP() {
		if(bullet.getY()<5) {
			Shoot=false;
			bullet.reloadP();
		}
	}
	



}
