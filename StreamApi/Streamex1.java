import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 class ShoeDetails  {
    private String shoeId;
    private String shoeName;
    private String brandName;
    private LocalDate arrivalDate;
    private int size;

    public ShoeDetails () {
    }

    public ShoeDetails (String shoeId, String shoeName, String brandName, LocalDate arrivalDate, int size) {
        this.shoeId = shoeId;
        this.shoeName = shoeName;
        this.brandName = brandName;
        this.arrivalDate = arrivalDate;
        this.size = size;
    }

    public String getShoeId() {
        return shoeId;
    }

    public void setShoeId(String shoeId) {
        this.shoeId = shoeId;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getBrandName() {                                                 
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public int hashCode() {
       return Objects.hash(arrivalDate, brandName, shoeId, shoeName, size);
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj)
          return true;
       if (obj == null)
          return false;
       if (getClass() != obj.getClass())
          return false;
       ShoeDetails other = (ShoeDetails) obj;
       return Objects.equals(arrivalDate, other.arrivalDate) && Objects.equals(brandName, other.brandName)
             && Objects.equals(shoeId, other.shoeId) && Objects.equals(shoeName, other.shoeName)
             && size == other.size;
    }


    
    @Override
    public String toString() {
       return "ShoeDetails [shoeId:" + shoeId + ", shoeName:" + shoeName + ", brandName:" + brandName
             + ", arrivalDate:" + arrivalDate + ", size:" + size + "]";
    }
}
                                                   




class ShoeUtility {
    public Stream<ShoeDetails> fetchShoesByBrand(List<ShoeDetails> shoeList, String brandName) {
        return shoeList.stream()
                       .filter(shoe -> shoe.getBrandName().equalsIgnoreCase(brandName));
    }

    public Stream<ShoeDetails> fetchShoesInAscendingOrderBySize(List<ShoeDetails> shoeList) {
        return shoeList.stream()
                       .sorted((s1, s2) -> Integer.compare(s1.getSize(), s2.getSize()));
    }

    public Stream<String> fetchUniqueShoes(List<ShoeDetails> shoeList) {
        return shoeList.stream()
                       .distinct()
                       .map(ShoeDetails::toString);
    }
}


 class Streamex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ShoeDetails> shoedetails = new ArrayList<>();
        ShoeUtility su = new ShoeUtility();

        System.out.println("Enter the number of Shoe details:");
        int numberOfShoes = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the Shoe details:");
        for (int i = 0; i < numberOfShoes; i++) {
            String details = scanner.nextLine();
            String[] parts = details.split(":");

            ShoeDetails shoe = new ShoeDetails(
                    parts[0],
                    parts[1],
                    parts[2],
                    LocalDate.parse(parts[3]),
                    Integer.parseInt(parts[4])
            );

            shoedetails.add(shoe);
        }

        // Menu
        System.out.println("Choose an option:");
        System.out.println("1. Fetch shoes by brand");
        System.out.println("2. Fetch shoes in ascending order by size");
        System.out.println("3. Fetch unique shoes");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Enter brand name to search:");
                String brand = scanner.nextLine();
                Stream<ShoeDetails> shoesByBrand = su.fetchShoesByBrand(shoedetails, brand);
                shoesByBrand.forEach(System.out::println);
                break;

            case 2:
                Stream<ShoeDetails> sortedShoes = su.fetchShoesInAscendingOrderBySize(shoedetails);
                sortedShoes.forEach(System.out::println);
                break;

            case 3:
                Stream<String> uniqueShoes = su.fetchUniqueShoes(shoedetails);
                uniqueShoes.forEach(System.out::println);
                break;

            default:
                System.out.println("Invalid option selected.");
        }

        scanner.close();
    }
}
