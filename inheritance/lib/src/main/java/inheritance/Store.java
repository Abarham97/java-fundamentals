package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Store {
    protected String name;
    protected List<Review> reviews;

    public Store(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public String getName() {
        return name;
    }
}
