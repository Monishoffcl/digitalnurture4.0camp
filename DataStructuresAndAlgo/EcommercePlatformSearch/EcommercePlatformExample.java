import java.util.Arrays;

public class EcommercePlatformExample {
    static class Product {
        int id;
        String name;
        String category;

        Product(int id, String name, String category) {
            this.id = id;
            this.name = name;
            this.category = category;
        }
    }
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.id == targetId) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].id == targetId) {
                return products[mid];
            } else if (products[mid].id < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
     public static void main(String[] args){
        Product[] products = {
            new Product(100, "Laptop", "Electronics"),
            new Product(200, "Smartphone", "Electronics"),
            new Product(300, "T-Shirt", "Clothing"),
            new Product(400, "Headphones", "Electronics"),
            new Product(150, "Running Shoes", "Footwear")
        };
        Arrays.sort(products, (a, b) -> Integer.compare(a.id, b.id));

        int searchId = 400;
        System.out.println("Searching for product ID: " + searchId);

        Product linearResult = linearSearch(products, searchId);
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult.name : "Not found"));

        Product binaryResult = binarySearch(products, searchId);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult.name : "Not found"));
    }
}

    


