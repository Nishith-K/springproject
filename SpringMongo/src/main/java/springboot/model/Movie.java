/**
 * 
 */
package springboot.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Nishith
 *
 */
@Document(collection = "trIndian")
public class Movie {

	private String title;
	private String movieId;
	private String year;
	private String imdbRating;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String title, String movieId, String year, String imdbRating) {
		super();
		this.title = title;
		this.movieId = movieId;
		this.year = year;
		this.imdbRating = imdbRating;
	}
	
}
