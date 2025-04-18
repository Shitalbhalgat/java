import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
		employeeList.add(new Employee(8, "Eight", 34500.0, "Pune"));
		employeeList.add(new Employee(9, "Nine", 11500.0, "Hyderabad"));
	

	// Get all employee names as list
		Stream<Employee> employeesStream = employeeList.stream();
		System.out.println(employeesStream.map(emp -> emp.getName()) .toList());

	
		// Employee Names ,salary>25000
		List<String> empNames2 =employeeList.stream() .filter(emp -> emp.getSalary() >25000) 
                  .map(emp -> emp.getName()) 
				.toList(); 
		System.out.println(empNames2);

		// Get Count of employees whose salary is > 20K
		long countOfEmp = employeeList.stream().filter(emp -> emp.getSalary() > 20000).count();

		System.out.println(countOfEmp);

		
		// Get first 3 employee objects as a list
		List<Employee> first3Employees = employeeList.stream().limit(3).toList();
        System.out.println(first3Employees);
	
	
	// Collect All EMployees Names as a LISt, whose salary is greater than 25k
	List<String> names = employeeList.stream().filter(employee -> employee.getSalary()>20000)
					.map(e->e.getName())
					.collect(Collectors.toList());
	
	System.out.println(names);
	
	//Unique ID 
	Set<Integer> i = employeeList.stream().map(e->e.getId()).collect(Collectors.toSet());
	System.out.println(i);
	
	//collect employee IDs and their salaries as Map
	 Map<Integer, Double>  empIdAndSalaries = employeeList.stream().collect(Collectors.toMap(Employee::getId, 
		                                             Employee::getSalary));
	 System.out.println(empIdAndSalaries);

	
	 // get avg salary of each emplyoeename
	 Map<String, Double>  avgSalaryDeptWise = employeeList.stream().collect(Collectors.groupingBy( Employee::getName,
			 Collectors.averagingDouble(Employee::getSalary)));
	 
	 System.out.println(avgSalaryDeptWise);
	 
	 

	 // Get Count of employees gender wise 
	 Map<String, Long> countOfEmpGenderWise = employeeList.stream().collect(Collectors.groupingBy(e->e.getName() ,
			 	Collectors.counting()));
	System.out.println(countOfEmpGenderWise); 

	
	// Summing All employees salaries 
	System.out.println(employeeList.stream()
			.collect(Collectors.summingDouble(Employee::getSalary)));
	System.out.println(employeeList.stream()
			.collect(Collectors.summarizingDouble(Employee::getSalary)));

		}
}