package session15;

public class Car {

	int year;
	String make;
	String model;
	double price;
	String color;
	static int inventoryNumber = 211;

	// constructor
	// default Constructor
	// by default Java provides it for us
	// aka no-args Constructor
	public Car() {
		
		inventoryNumber += 5;
	}

	// custom Constructor
	// parameterized Constructor
	public Car(int year, String make, String model, double price, String color) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
		this.color = color;
		inventoryNumber += 5;
	}

	public Car(double price) {
		inventoryNumber += 5;
	}
	
	
	
	public String toString() {
		return "Year:" + year + ", make:" + make
				+ ", model:" + model + ", price:" + price
				+ ", color:" + color 
				+ ", inventoryNumber:" + inventoryNumber + ".";
	}

}
