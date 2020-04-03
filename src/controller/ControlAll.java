package controller;

import java.util.LinkedList;
import model.Logica;
import model.Movies;
import processing.core.PApplet;

public class ControlAll {
	
	//private PApplet app;
	private Logica logica;
	
	public ControlAll(PApplet app) {
		//this.app = app;
		this.logica = new Logica(app);
	}
	
	public void sortMovies(char c) {
		logica.sortList(c);
	}
	
//	public void guardarMetodos() {
//		logica.guardarMetodos();
//	}
	
	public LinkedList<Movies> listMovies() {
		return logica.getMovies();
	} 

}