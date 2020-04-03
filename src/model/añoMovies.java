package model;

import java.util.Comparator;

public class añoMovies implements Comparator<Movies> {

	public int compare(Movies o1, Movies o2) {
		return o1.getAñoMovies() - o2.getAñoMovies();
	}
	
}
