package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;



import model.Movie;
import model.MovieLogic;

/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Sep 6, 2021
 */
public class TestMovieLogic {
MovieLogic mL = new MovieLogic();
Movie movie = new Movie();

@Before
public void setUp() throws Exception {
}

@Test
public void testGenreIsHorror() {
movie.setGenre("Horror");
assertTrue(mL.isHorrorMovie(movie));
}

@Test
public void testGenreIsNotHorror() {
movie.setGenre("Comedy");
assertFalse(mL.isHorrorMovie(movie));
}

@Test
public void testCalculateGradeScoreC() {
movie.setReviewScore(70);
String grade = mL.calculateGradeScore(movie);
assertEquals("C", grade);
}

@Test
public void testCalculateGradeScoreA() {
movie.setReviewScore(100);
String grade = mL.calculateGradeScore(movie);
assertEquals("A", grade);
}

}
