package session18;

public abstract class Employee {
	public static final String COMPANY_NAME; // aka CONSTANTS
	public static final String HOME_PAGE_ADDRESS;
	public final String email;
	private String firstName;
	private String lastName;
	private static int idCounter;
	private int id;
	
	// is executed EVERY time an object of the class is created
	// is executed BEFORE the Constructor
	// best uses are for cases where you need special conditions
	//	to be executed before the object is created
	//  e.g. establish connection to database, to website, or 
	//		 load a file and assign its data to instance fields
	{
		firstName = "TBD";
		lastName = "n/a";
		idCounter++; 
		this.id = idCounter;
	}
	
	// is executed ONLY-and-ONLY ONCE
	// the very first time the class is MENTIONED
	// e.g. establish static connection with a network
	static {
		COMPANY_NAME = "UMS";
		HOME_PAGE_ADDRESS = "https://ums.global";
		idCounter = 100;
	}
	
	public Employee() {
		super();
//		companyName = "UMS";
		email = firstName + "@ums.global";
	}
		
	public Employee(String firstName, String lastName) {
		super();
//		companyName = "Google";
//		id++; this becomes redundant due to id being incremented inside Init Block
		this.firstName = firstName;
		this.lastName = lastName;	
		email = firstName + "_" + lastName + "@ums.global";
	}
	
	public int getId() {
		return id;
	}
	
	// the method below becomes redundant because since no-one can 
	// change the value of our CONSTANT field, we can make it public
	// and not worry about anything else
//	public static String getCompanyName() {
//		return companyName;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return "{id:" + id + ",firstName:" + firstName + ",lastName:" + lastName + "}";
	}
	
}
