class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    Product(String id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }
}

class Inventory {
    HashMap<String, Product> products = new HashMap<>();

    void addProduct(Product p) {
        products.put(p.productId, p);
    }

    void updateProduct(String id, String name, int qty, double price) {
        if (products.containsKey(id)) {
            Product p = products.get(id);
            p.productName = name;
            p.quantity = qty;
            p.price = price;
        }
    }

    void deleteProduct(String id) {
        products.remove(id);
    }
}
