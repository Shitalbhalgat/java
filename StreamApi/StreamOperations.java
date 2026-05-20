import java.util.ArrayList;
import java.util.List;
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
	

		}
}