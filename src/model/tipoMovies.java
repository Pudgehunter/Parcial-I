package model;

import java.util.Comparator;

public class tipoMovies implements Comparator<Movies> {

	public int compare(Movies o1, Movies o2) {
		return o1.getTipoMovies().compareTo(o2.getTipoMovies());
	}
}
