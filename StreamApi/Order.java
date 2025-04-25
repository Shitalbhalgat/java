public class Order {
    private String orderId;
    private String customerName;
    private double amountSpent;

    public Order(String orderId, String customerName, double amountSpent) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amountSpent = amountSpent;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

 
    public String toString() {
        return "Order{" +"orderId='" + orderId + '\'' +", customerName='" + customerName + '\'' + ", amountSpent=" + amountSpent +'}';
    }
}

 class OrderGroupingExample {
    public static void main(String[] args) {
       
        List<Order> orders = Arrays.asList(
            new Order("O001", "ABC", 150.75),
            new Order("O002", "PQR", 200.50),
            new Order("O003", "ABC", 99.99),
            new Order("O004", "XYZ", 125.00),
            new Order("O005", "PQR", 75.25),
            new Order("O006", "XYZ", 180.00)
        );

        // Group orders by customer and calculate the total amount spent by each customer
        Map<String, Double> totalSpentByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,                     
                        Collectors.summingDouble(Order::getAmountSpent) 
                ));

        // Print the total amount spent by each customer
        totalSpentByCustomer.forEach((customer, totalSpent) -> {
            System.out.println("Customer: " + customer + ", Total Amount Spent: $" + totalSpent);
        });

        // Group orders by customer and count the number of orders for each customer
        Map<String, Long> orderCountByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,                    
                        Collectors.counting()                      
                ));

        // Print the number of orders per customer
        orderCountByCustomer.forEach((customer, count) -> {
            System.out.println("Customer: " + customer + ", Number of Orders: " + count);
        });


    }
}
