package model;

import processing.core.PApplet;

public class Movies implements Comparable<Movies>  {

	private String nombreMovies, tipoMovies;
	private PApplet app;
	private int a�oMovies, rateMovies, posY, posX;
	
	public Movies(int a�oMovies,String nombreMovies,String tipoMovies, int rateMovies,PApplet app) {
		this.a�oMovies = a�oMovies;
		this.nombreMovies = nombreMovies;
		this.tipoMovies = tipoMovies;
		this.rateMovies = rateMovies;
		this.app = app;
		this.posX = 50;
	}
	
	public void drawLetras(int posY, PApplet app) {
		app.fill(255);
		app.text(nombreMovies, posX, posY);
		app.text(a�oMovies, posX+150, posY);
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

	public int getA�oMovies() {
		return a�oMovies;
	}

	public void setA�oMovies(int a�oMovies) {
		this.a�oMovies = a�oMovies;
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
