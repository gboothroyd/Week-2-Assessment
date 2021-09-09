package model;

/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Sep 6, 2021
 */
public class Movie {
	private String name;
	private String Genre;
	private int yearReleased;
	private int reviewScore;

	
	public Movie() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param name
	 * @param genre
	 * @param yearReleased
	 * @param reviewScore
	 */
	public Movie(String name, String genre, int yearReleased, int reviewScore) {
		super();
		this.name = name;
		Genre = genre;
		this.yearReleased = yearReleased;
		this.reviewScore = reviewScore;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the genre
	 */
	public String getGenre() {
		return Genre;
	}


	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		Genre = genre;
	}


	/**
	 * @return the yearReleased
	 */
	public int getYearReleased() {
		return yearReleased;
	}


	/**
	 * @param yearReleased the yearReleased to set
	 */
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}


	/**
	 * @return the reviewScore
	 */
	public int getReviewScore() {
		return reviewScore;
	}


	/**
	 * @param reviewScore the reviewScore to set
	 */
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	
	

}
