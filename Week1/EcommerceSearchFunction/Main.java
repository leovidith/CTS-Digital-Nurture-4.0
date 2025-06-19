import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Book", "Education"),
            new Product(4, "Phone", "Electronics")
        };

        // Sort for binary search
        Arrays.sort(products, (a, b) -> a.productName.compareTo(b.productName));

        Product found1 = Search.linearSearch(products, "Book");
        Product found2 = Search.binarySearch(products, "Phone");

        System.out.println("Linear: " + (found1 != null ? found1.productName : "Not found"));
        System.out.println("Binary: " + (found2 != null ? found2.productName : "Not found"));
    }
}
