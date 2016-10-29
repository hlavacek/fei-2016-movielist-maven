package sk.fei.ci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sk.fei.ci.Movies;

public class MoviesTest {

	@Test
	public void shouldReturnTwoMovies() {
		Movies movies = new Movies();
		assertEquals(2, movies.size());
	}
}
