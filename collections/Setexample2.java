import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

 class Setexample2  
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of orders to be added:");
        int n = sc.nextInt();
        

        
        PizzaOrderInfo p = new PizzaOrderInfo();


        System.out.println("Enter the orders (Order Id: Pizza Type):");
        for (int i = 0; i < n; i++) {
            String s = sc.next();  
            p.addPizzaOrderDetails(s); 
        }

    
        System.out.print("Enter pizza type to find the number of orders: ");
        String pizzaType = sc.next();
        int totalOrders = p.findTheNumberOfOrdersBasedOnThePizzaType(pizzaType);

        if (totalOrders == -1) {
            System.out.println("No orders found for pizza type: " + pizzaType);
        } else {
            System.out.println("Total number of orders for pizza type " + pizzaType + ": " + totalOrders);
        }

        System.out.print("Enter pizza type to list all order details: ");
        String pizzaTypeForDetails = sc.nextLine();
        List<String> orders = p.findOrderDetailsBasedOnPizzaType(pizzaTypeForDetails);

        if (orders.isEmpty()) {
            System.out.println("No orders found for pizza type: " + pizzaTypeForDetails);
        } else {
            System.out.println("Order details for pizza type " + pizzaTypeForDetails + ":");
            for (String order : orders) {
                System.out.println(order);  // Print each order detail
            }
        }

  
    }
}


 class PizzaOrderInfo {
    
    private Set<String> orderSet = new TreeSet<String>();


    public Set<String> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<String> orderSet) {
        this.orderSet = orderSet;
    }

   
    public void addPizzaOrderDetails(String orderDetail) {
        orderSet.add(orderDetail);  
    }

    public int findTheNumberOfOrdersBasedOnThePizzaType(String pizzaType) {
        int count = 0;
        for (String orderDetail : orderSet) {
           
            String[] parts = orderDetail.split(":");
            if (parts.length == 2 && parts[1].equalsIgnoreCase(pizzaType)) {
                count++;  
            }
        }
        return count > 0 ? count : -1;  
    }


    public List<String> findOrderDetailsBasedOnPizzaType(String pizzaType) {
        List<String> orders = new ArrayList<>();
        for (String orderDetail : orderSet) {
            String[] parts = orderDetail.split(":");
            if (parts.length == 2 && parts[1].equalsIgnoreCase(pizzaType)) {
                orders.add(orderDetail); 
            }
        }
        return orders;  
    }
}
