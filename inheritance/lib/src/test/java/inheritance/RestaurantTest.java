package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {

    @Test
    void testRestaurantConstructor() {
        String name = "Sample Restaurant";
        int Stars = 3;
        String Price = "40$";

        Restaurant restaurant = new Restaurant(name, Stars, Price);

        assertEquals(name, restaurant.getName());
        assertEquals(Stars, restaurant.getStars());
        assertEquals(Price, restaurant.getPrice());
    }
    @Test
    void testToString() {
        String name = "Sample Restaurant";
        int stars = 4;
        String price = "50$";

        Restaurant restaurant = new Restaurant(name, stars, price);

        String expectedString = "Restaurant{" +
                "name='" + name + '\'' +
                ", Stars=" + stars +
                ", Price='" + price + '\'' +
                '}';

        assertEquals(expectedString, restaurant.toString());
    }
    @Test
    void testAddReview() {
        Restaurant restaurant = new Restaurant("Sample Restaurant", '4', "$$");
        Review review = new Review("Great food!", "Alice", '5');

        restaurant.addReview(review);

        assertEquals(1, restaurant.getReviews().size());
        assertEquals(review, restaurant.getReviews().get(0));

}
    @Test
    void testAddReviewAndUpdateStarRating() {
        Restaurant restaurant = new Restaurant("Sample Restaurant", 4, "$$");
        Review review1 = new Review("Great food!", "ghofran", 5);
        Review review2 = new Review("Average experience.", "Rahaf", 3);

        restaurant.addReview(review1);
        assertEquals(5, restaurant.getStars());

        restaurant.addReview(review2);
        assertEquals(4, restaurant.getStars());
    }


}



