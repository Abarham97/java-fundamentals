package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {
    @Test
    void testReviewConstructor() {
        String body = "Sample Restaurant";
        String author = "abed";
        int Stars = 3;


        Review review = new Review(body, author, Stars);

        assertEquals(body, review.getBody());
        assertEquals(author, review.getAuthor());
        assertEquals(Stars, review.getStars());

    }

    @Test
    void testToString() {
        String body = "Great restaurant!";
        String author = "Alice";
        int stars = 5;

        Review review = new Review(body, author, stars);

        String expectedString = "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", Stars=" + stars +
                '}';

        assertEquals(expectedString, review.toString());
    }
}
