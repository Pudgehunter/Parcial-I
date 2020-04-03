package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	
	private PApplet app;
	private LinkedList<Movies> movies;
	private LinkedList<Imagenes> imagenes;
	private a�oMovies moviesA�o;
	private rateMovies moviesRate;
	private tipoMovies moviesTipo;
	String[] txtUno, txtUnoSplit;
	private String tipo, nombre;
	private int rate, a�o;
	
	
	public Logica(PApplet app) {
		this.app = app;
		this.movies = new LinkedList<Movies>();
		this.moviesRate = new rateMovies();
		this.moviesTipo = new tipoMovies();
		this.moviesA�o = new a�oMovies();
		
		
		
		//Agregar los textos importados de perros
		txtUno = app.loadStrings("../data/imports/netflix.txt");
		
		//se crean los fors para poder imprimirlo
		for (int i = 0; i < txtUno.length; i++) {
			txtUnoSplit = txtUno[i].split(",");
			
//			if(txtUnoSplit[0].equals("Breaking Bad")) {
//				imagenes.add(New Imagenes);
//			}
			
			System.out.println(txtUnoSplit[2]);
			System.out.println(txtUnoSplit[0]);
			nombre = txtUnoSplit[0];
			a�o = Integer.parseInt(txtUnoSplit[1]);
			tipo = txtUnoSplit[3];
			rate = Integer.parseInt(txtUnoSplit[2]);
			movies.add(new Movies(a�o, nombre, tipo, rate, app));
			
			}
		}

	public void sortList(char c) {
		switch (c) { 
		case 'a':
				Collections.sort(movies);
				System.out.println("Si funciono p");
			break;
		case 's':
				Collections.sort(movies,moviesA�o);
				System.out.println("Si funciono e");
			break;
		case 'd':
				Collections.sort(movies, moviesRate);
				System.out.println("Si funciono r");
			break;
		case 'f':
			Collections.sort(movies, moviesTipo);
			System.out.println("Si funciono n");
		break;
		default:
			break;
		}
	}
	
	public void guardarMetodos() {
		
		String[] guardarTxt;
		guardarTxt = new String [movies.size()];
		
		for (int i = 0; i < movies.size(); i++) {
			
			String moviess =  movies.get(i).getNombreMovies();
			int moviesss = movies.get(i).getA�oMovies();
			int moviessss = movies.get(i).getRateMovies();
			String moviesssss = movies.get(i).getTipoMovies();
			
			guardarTxt[i] = moviess
					+ moviesss
					+ moviessss
					+ moviesssss;
		}
		app.saveStrings("../data/exports", guardarTxt);
	}
	

	public LinkedList<Movies> getMovies() {
		return movies;
	}

	public void setPerros(LinkedList<Movies> movies) {
		this.movies = movies;
	}

}

