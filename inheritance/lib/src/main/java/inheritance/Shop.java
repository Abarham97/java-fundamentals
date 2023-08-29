package inheritance;

public class Shop extends Store{

    private String description;
    private int dollarSigns;

    public Shop(String name, String description, int dollarSigns) {
        super(name);
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    @Override
    public String toString() {
        return String.format("Shop: %s\nDescription: %s\nDollar Signs: %d", name, description, dollarSigns);
    }
}
