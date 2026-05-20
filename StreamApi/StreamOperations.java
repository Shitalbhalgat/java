import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Employee {
       
	 int id;
	 String name;
	 String city;
	 double salary;

	public Employee(int id, String name, double salary,String city) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}
 class StreamOperations {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(6, "Six",49500.0, "Pune"));
		employeeList.add(new Employee(7, "Seven",27000.0, "Nagar"));
		employeeList.add(new Employee(3, "Three", 18000.0, "Hyderabad"));
		employeeList.add(new Employee(6, "Eight", 34500.0, "Pune"));
		employeeList.add(new Employee(9, "Nine", 11500.0, "Hyderabad"));
	
		// Get all employee names as list
		System.out.println(employeeList.stream().map(emp -> emp.getName()) .toList());

		// Employee Names ,salary>25000
         System.out.println(employeeList.stream() .filter(emp -> emp.getSalary() >25000) 
                  .map(emp -> emp.getName()) 
				.toList());

		// Get Count of employees whose salary is > 20K
		    System.out.println(employeeList.stream() .filter(emp -> emp.getSalary() >20000)
				.count());

		// Get first 3 employee objects as a list
        System.out.println(employeeList.stream().limit(3).toList());

		//Unique ID 
        System.out.println(employeeList.stream().map(e->e.getId()).collect(Collectors.toSet()));

	    //collect employee IDs and their salaries as Map
System.out.println( employeeList.stream().distinct().collect(Collectors.toMap(Employee::getId, 
		                                             Employee::getSalary,(s1,s2)->s1)));

		// get avg salary of each emplyoeename
           System.out.println( employeeList.stream().collect(Collectors.groupingBy(
			Employee::getName,
			 Collectors.averagingDouble(Employee::getSalary))));

			
	// Summing All employees salaries 
	System.out.println(employeeList.stream()
			.collect(Collectors.summingDouble(Employee::getSalary)));


	// Get Count of employees name wise 
      System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.getName() ,
			 	Collectors.counting())));

		}
}
