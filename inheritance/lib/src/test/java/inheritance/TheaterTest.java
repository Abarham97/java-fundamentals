package inheritance;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {

    @Test
    public void testAddMovie() {
        Theater theater = new Theater("Example Theater", "Movie 1");
        theater.addMovie("Movie 2");
        theater.addMovie("Movie 3");

        List<String> expectedMovies = List.of("Movie 1", "Movie 2", "Movie 3");
        List<String> actualMovies = theater.getMovies();

        assertEquals(expectedMovies, actualMovies);
    }

    @Test
    public void testRemoveMovie() {
        Theater theater = new Theater("Example Theater", "Movie 1");
        theater.addMovie("Movie 2");
        theater.addMovie("Movie 3");

        theater.removeMovie("Movie 2");

        List<String> expectedMovies = List.of("Movie 1", "Movie 3");
        List<String> actualMovies = theater.getMovies();

        assertEquals(expectedMovies, actualMovies);
    }

    @Test
    public void testReviewSetMovie() {
        Theater theater = new Theater("Example Theater", "Movie 1");

        Review review = new Review("Good experience", "John", 4);
        theater.setMovie("Movie 1");

        theater.addReview(review);

        List<Review> expectedReviews = List.of(review);
        List<Review> actualReviews = theater.getReviews();

        assertEquals(expectedReviews, actualReviews);
    }
}
