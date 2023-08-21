package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private int Stars;

    private String Price;
    private List<Review> reviews;

    public Restaurant(String name, int Stars, String Price) {
        this.name = name;
        this.Price = Price;
        this.Stars = Stars;
        this.reviews = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public int getStars() {

        return Stars;
    }

    public String getPrice() {

        return Price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", Stars=" + Stars +
                ", Price='" + Price + '\'' +
                '}';
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            updateStarRating();
        }
    }
    private void updateStarRating() {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getStars();
        }
        Stars = totalStars / reviews.size();
    }


    public List<Review> getReviews() {
        return reviews;
    }

}
