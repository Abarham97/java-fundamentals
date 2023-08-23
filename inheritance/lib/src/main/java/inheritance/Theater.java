package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    private String name;
    private String movie;
    private List<String> movies;
    private List<Review> reviews;

    public Theater(String name, String movie) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.movies.add(movie);
        this.reviews = new ArrayList<>();
    }

    public void addMovie(String newMovie) {
        movies.add(newMovie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
