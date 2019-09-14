package session16;

public class Employee {
	
	private static int id;
	public String fullName;
	public String title;
	public double salary;
	
	// Java allows you to create classes without no-args Constructor
	// and if you define any parameterized Constructor, Java will NOT create a no-arg Constructor for you
	// reason is you may want MAKE the user who created your class objects to define certain values
	
//	public Employee() {
//		this("NONAME");
//	}
	
	public Employee(String fullName) {
		this( fullName, "TBD", -1 );
//		this.title = "TBD";
//		this.salary = -1;
//		id++;
		
		this.fullName = fullName;
	}
	
	public Employee(String fullName, String title, double salary) {
		id++;
		this.fullName = fullName;
		this.title = title;
		this.salary = salaryChecker(salary);
	}
	
	private double salaryChecker(double salary) {
		if (salary < -1) {
			System.out.println("Salary cannot be negative. You entered: " + salary);
			System.out.println("ERROR: Check employee with id: " + id);
			return 0.0;
		}
		
		return salary;
	}

	
	public String toString() {
		return "{id:" + id +",fullName:" + fullName + ",title:" + title + ",salary:" + salary + "}";
	}
}
