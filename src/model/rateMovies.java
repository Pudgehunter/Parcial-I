package model;

import java.util.Comparator;

public class rateMovies implements Comparator<Movies> {

	public int compare(Movies o1, Movies o2) {
		return o1.getRateMovies() - o2.getRateMovies();
	}
}