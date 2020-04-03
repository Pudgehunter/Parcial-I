package view;


import controller.ControlAll;
import processing.core.PApplet;

public class Main extends PApplet {
	
	ControlAll control;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}

	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		control = new ControlAll(this);
	}
	
	public void draw() {
		background(0);
		
		text("Nombre",50,20);
		text("Año",200,20);
		text("Rate",300,20);
		text("Tipo",400,20);
		
		text("Para ordenar de orden alfabeto del nombre oprima a",50,250);
		text("Para ordenar de orden descedente el año oprima s",50,300);
		text("Para ordenar de orden descedente el rate alfabeto oprima d",50,350);
		text("Para ordenar de orden alfabeto el tipo oprima f",50,400);
		
		for (int i = 0; i < control.listMovies().size(); i++) {
			control.listMovies().get(i).drawLetras(50+(i*20), this);
		}
		
	}
	

	public void keyPressed() {
		control.sortMovies(key);
		//control.guardarMetodos();
	}
	
}

