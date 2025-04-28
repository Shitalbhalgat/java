// import java.util.*;
// import java.util.stream.*;
// import java.util.function.*;
// import java.util.Comparator;
// 
// class Person1 {
//     private String name;
//     private int age;
// 
//     public Person1(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// 
//     public String getName() { return name; }
//     public int getAge() { return age; }
// 
// 
//     public String toString() {
//         return name + " (" + age + ")";
//     }
// }
// 
// class StreamExample2 {
//     public static void main(String[] args) {
//         List<Person1> people = Arrays.asList(
//             new Person1("ABC", 30),
//             new Person1("PQR", 20),
//             new Person1("XYZ", 25),
//             new Person1("LMN", 18),
//             new Person1("DMQ", 30)
//         );
// 
//         // 1. MAP: Get a list of names
//        
//         System.out.println(people.stream().map(Person1::getName).collect(Collectors.toList()));
// 
//         // 2. FILTER: People over 21
//         System.out.println( people.stream()
//             .filter(p -> p.getAge() > 21)
//             .collect(Collectors.toList()));
//         
// 
//         // 3. SORTED: Sort by age
//         List<Person1> sortedByAge = people.stream()
//             .sorted(Comparator.comparing(Person1::getAge))
//             .collect(Collectors.toList());
//         System.out.println("Sorted by age: " + sortedByAge);
// 
//         // 4. GROUPING BY AGE
//         System.out.println("Grouped by age: " + people.stream()
//             .collect(Collectors.groupingBy(Person1::getAge)));
//         
// 
//         // 5. Sum of all ages
//         int totalAge = people.stream().collect(Collectors.summingInt(Person1::getAge));
//         System.out.println("Total age: " + totalAge);
// 
//         // 6. FIND FIRST person over 25
//         System.out.println("First person over 25: " +people.stream()
//             .filter(p -> p.getAge() > 25)
//             .findFirst().get());
//  
//     }
// }
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return name + "" + price + " (" + category + ")";
    }
}

 class StreamExample2 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200.0, "Electronics"),
            new Product("Smartphone", 800.0, "Electronics"),
            new Product("Coffee", 5.0, "Groceries"),
            new Product("Notebook", 3.0, "Stationery"),
            new Product("Pen", 1.5, "Stationery"),
            new Product("Laptop", 1200.0, "Electronics")  
        );

        // 1. DISTINCT: Remove duplicates based on name (by using Set)
        List<String> uniqueProductNames = products.stream()
            .map(Product::getName)
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Unique Product Names: " + uniqueProductNames);

        // 2. GROUPING BY category
        System.out.println("\nGrouped by Category:" +products.stream()
            .collect(Collectors.groupingBy(Product::getCategory)));
        

        // 3. MAX: Most expensive product
        System.out.println("\nMost Expensive Product: " + products.stream()
            .max(Comparator.comparing(Product::getPrice)).get());
           

        // 4. MIN: Cheapest product
        System.out.println("\nMost Expensive Product: " +products.stream()
        .min(Comparator.comparing(Product::getPrice)).get());

        // 5. anyMatch / allMatch
         
        System.out.println("\nHas any cheap item : "+products.stream().anyMatch(p -> p.getPrice() <100));
        System.out.println("Are all electronics expensive: " + products.stream()
                                                      .filter(p -> p.getCategory().equals("Electronics"))
                                                       .allMatch(p -> p.getPrice() > 100));

    
    }
}
