package inheritance;

public class Review {

    private String body;
    private String author;
    private int stars;
  private Store store;
    private String movie;

    public Review(String body, String author, int stars, Store store) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.store = store;
    }

    public Review(String body, String author, int stars, Theater theater, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.store = theater;
        this.movie = movie;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        String reviewInfo = String.format("Author: %s\nStars: %d\n%s", author, stars, body);
        if (store != null) {
            reviewInfo += "\nPlace: " + store.getName();
            if (store instanceof Theater && movie != null) {
                reviewInfo += "\nMovie: " + movie;
            }
        }
        return reviewInfo;
    }
}
