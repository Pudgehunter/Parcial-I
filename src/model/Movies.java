package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Movies implements Comparable<Movies>  {

	private String nombreMovies, tipoMovies;
	private PApplet app;
	private int aņoMovies, rateMovies, posY, posX;
	private PImage[] allImage;
	
	public Movies(int aņoMovies,String nombreMovies,String tipoMovies, int rateMovies,PApplet app) {
		this.aņoMovies = aņoMovies;
		this.nombreMovies = nombreMovies;
		this.tipoMovies = tipoMovies;
		this.rateMovies = rateMovies;
		this.app = app;
		this.posX = 50;
//	
	}
	
	public void drawLetras(int posY, PApplet app) {
		app.fill(255);
		app.text(nombreMovies, posX, posY);
		app.text(aņoMovies, posX+150, posY);
		app.text(rateMovies+"%", posX+250, posY);
		app.text(tipoMovies, posX+350, posY);
	}

	public String getNombreMovies() {
		return nombreMovies;
	}

	public void setNombreMovies(String nombreMovies) {
		this.nombreMovies = nombreMovies;
	}

	public String getTipoMovies() {
		return tipoMovies;
	}

	public void setTipoMovies(String tipoMovies) {
		this.tipoMovies = tipoMovies;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getAņoMovies() {
		return aņoMovies;
	}

	public void setAņoMovies(int aņoMovies) {
		this.aņoMovies = aņoMovies;
	}

	public int getRateMovies() {
		return rateMovies;
	}

	public void setRateMovies(int rateMovies) {
		this.rateMovies = rateMovies;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	@Override
	public int compareTo(Movies o) {
		// TODO Auto-generated method stub
		return this.nombreMovies.compareTo(o.getTipoMovies());
	}
	
}
