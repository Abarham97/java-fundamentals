package inheritance;

import java.util.ArrayList;
import java.util.List;

public class shop {

    private List<Review> reviews;
    private String name;
    private String price;

    public shop(String name,String price) {
        this.name = name;
        this.price=price;
        this.reviews=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "shop{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getPrice() {
        return price;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
    public List<Review> getReviews() {
        return reviews;
    }
}
