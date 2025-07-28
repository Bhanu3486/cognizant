package ProductSearch;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSearch {
	static List<String> products = new ArrayList<>();

    // Method to search products
    public static List<String> search(String keyword) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Sample products
        products.add("Apple iPhone 15");
        products.add("Samsung Galaxy S24");
        products.add("OnePlus Nord 3");
        products.add("Realme Narzo 60");
        products.add("Apple AirPods Pro");
        products.add("Sony Headphones");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();

        List<String> matches = search(keyword);

        System.out.println("\nSearch Results:");
        if (matches.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (String match : matches) {
                System.out.println("- " + match);
            }
        }
    }
}
