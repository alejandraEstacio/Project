package model;

import java.io.Serializable;

public class Character implements Serializable {
	

	public static final String DER="data/userR.png";
	public static final String IZQ="data/userL.png";
	
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
	
	public void reloadP() {
		if(bala.getY()<5) {
			disparando=false;
			bala.reloadP();
		}
	}
	



}
