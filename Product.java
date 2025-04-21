public class Product {
    private String productId;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    public Product() {}

    public Product(String productId, String name, String category, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}


 class ProductUtility {

    public List<Product> retrieveProductsByCategory(Stream<Product> productStream, String category) {
        return productStream
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<Product> retrieveProductsByPriceBelow(Stream<Product> productStream, double maxPrice) {
        return productStream
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Product> retrieveLowStockProducts(Stream<Product> productStream, int threshold) {
        return productStream
                .filter(p -> p.getStockQuantity() < threshold)
                .collect(Collectors.toList());
    }
}
 class ProductStreamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        ProductUtility utility = new ProductUtility();

        System.out.println("Enter the number of products:");
        int numProducts = scanner.nextInt();

        System.out.println("Enter product details (productId, name, category, price, stockQuantity) separated by commas:");
        for (int i = 0; i < numProducts; i++) {
            String[] details = scanner.nextLine().split(",");
            Product product = new Product(
                details[0],
                details[1],
                details[2],
                Double.parseDouble(details[3]),
                Integer.parseInt(details[4])
            );
            productList.add(product);
        }

        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Retrieve products by category");
            System.out.println("2. Retrieve products by max price");
            System.out.println("3. Retrieve products with low stock");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter category:");
                    String category = scanner.nextLine();
                    List<Product> categoryList = utility.retrieveProductsByCategory(productList.stream(), category);
                    displayProducts(categoryList);
                    break;
                case 2:
                    System.out.println("Enter max price:");
                    double price = Double.parseDouble(scanner.nextLine());
                    List<Product> priceList = utility.retrieveProductsByPriceBelow(productList.stream(), price);
                    displayProducts(priceList);
                    break;
                case 3:
                    System.out.println("Enter stock threshold:");
                    int threshold = Integer.parseInt(scanner.nextLine());
                    List<Product> lowStockList = utility.retrieveLowStockProducts(productList.stream(), threshold);
                    displayProducts(lowStockList);
                    break;
                case 4:
                    continueMenu = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    private static void displayProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product p : products) {
                System.out.println("Product ID: " + p.getProductId());
                System.out.println("Name: " + p.getName());
                System.out.println("Category: " + p.getCategory());
                System.out.println("Price: $" + p.getPrice());
                System.out.println("Stock: " + p.getStockQuantity() + "\n");
            }
        }
    }
}
