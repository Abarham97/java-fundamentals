package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class shopTest {

    @Test
    public void testToString() {
        shop shop = new shop("Example Shop", "10.00");
        shop.setName("Example Shop");
        shop.setPrice("10.00");

        String expected = "shop{name='Example Shop', price='10.00'}";
        String actual = shop.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testAddReviewToShop() {
        shop shop = new shop("Example Shop", "10.00");
        Review review = new Review("Good shop!", "John", 4);

        shop.addReview(review);

        assertEquals(1, shop.getReviews().size());
        assertEquals(review, shop.getReviews().get(0));
    }
}
