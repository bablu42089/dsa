public class Property {
    private String title;
    private String city;
    private double price;
    private int bedrooms;

    public Property(String title, String city, double price, int bedrooms) {
        this.title = title;
        this.city = city;
        this.price = price;
        this.bedrooms = bedrooms;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public String toString() {
        return String.format("Title: %s | City: %s | Price: $%.2f | Bedrooms: %d",
                title, city, price, bedrooms);
    }
}
