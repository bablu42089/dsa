import java.util.ArrayList;
import java.util.List;

public class PropertyManager {
    private List<Property> propertyList = new ArrayList<>();

    public void addProperty(Property property) {
        propertyList.add(property);
    }

    public void viewAllProperties() {
        if (propertyList.isEmpty()) {
            System.out.println("No properties available.");
        } else {
            for (Property property : propertyList) {
                System.out.println(property);
            }
        }
    }

    public void searchByCity(String city) {
        boolean found = false;
        for (Property property : propertyList) {
            if (property.getCity().equalsIgnoreCase(city)) {
                System.out.println(property);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No properties found in " + city);
        }
    }

    public void searchByMaxPrice(double maxPrice) {
        boolean found = false;
        for (Property property : propertyList) {
            if (property.getPrice() <= maxPrice) {
                System.out.println(property);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No properties found under $" + maxPrice);
        }
    }
}
