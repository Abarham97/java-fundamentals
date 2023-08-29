package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Store{
    private List<String> movies;

    public Theater(String name) {
        super(name);
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return String.format("Theater: %s\nMovies: %s", name, movies.toString());
    }
}
