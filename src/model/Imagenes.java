package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Imagenes {
	
	private int posX, posY;
	private PApplet app;
	private PImage[] allImage;
	
	public Imagenes(int posX, int posY, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;

		for (int i = 0; i < allImage.length; i++) {
			this.allImage[i] = app.loadImage("../data/img/"+i+".jpg");
		}
	}
	
	public void draw(int posX,int posY) {
		for (int j = 0; j < allImage.length; j++) {
			app.image(allImage[j],posX,posY);
		}
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

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

}
