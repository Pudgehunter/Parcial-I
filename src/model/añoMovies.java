package model;

import java.util.Comparator;

public class aņoMovies implements Comparator<Movies> {

	public int compare(Movies o1, Movies o2) {
		return o1.getAņoMovies() - o2.getAņoMovies();
	}
	
}
