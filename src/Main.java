import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PropertyManager manager = new PropertyManager();
        Scanner scanner = new Scanner(System.in);

        // Preload sample data
        manager.addProperty(new Property("Luxury Villa", "Los Angeles", 1500000, 4));
        manager.addProperty(new Property("Cozy Apartment", "New York", 750000, 2));
        manager.addProperty(new Property("Beach House", "Miami", 1250000, 3));

        while (true) {
            System.out.println("\n==== Real Estate Property Search ====");
            System.out.println("1. Add New Property");
            System.out.println("2. View All Properties");
            System.out.println("3. Search by City");
            System.out.println("4. Search by Max Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // clear newline
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a number.");
                scanner.nextLine(); // consume invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Property Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();

                    double price;
                    int bedrooms;

                    try {
                        System.out.print("Enter Price: ");
                        price = scanner.nextDouble();
                        System.out.print("Enter Number of Bedrooms: ");
                        bedrooms = scanner.nextInt();
                        scanner.nextLine(); // clear newline
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Invalid input. Price and Bedrooms must be numbers.");
                        scanner.nextLine(); // clear input
                        continue;
                    }

                    manager.addProperty(new Property(title, city, price, bedrooms));
                    System.out.println("✅ Property added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- All Properties ---");
                    manager.viewAllProperties();
                    break;

                case 3:
                    System.out.print("Enter city to search: ");
                    String searchCity = scanner.nextLine();
                    System.out.println("\n--- Properties in " + searchCity + " ---");
                    manager.searchByCity(searchCity);
                    break;

                case 4:
                    System.out.print("Enter maximum price: ");
                    try {
                        double maxPrice = scanner.nextDouble();
                        scanner.nextLine(); // clear newline
                        System.out.println("\n--- Properties under $" + maxPrice + " ---");
                        manager.searchByMaxPrice(maxPrice);
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Please enter a valid number for price.");
                        scanner.nextLine(); // clear input
                    }
                    break;

                case 5:
                    System.out.println("👋 Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid option, please try again.");
            }
        }
    }
}
