package session15;

public class Computer {
	
	double CPU;
	double screenSize;
	String manufacturer;
	double price;
	static int serialNumber;
	
		
	public static void assignSN() {
		serialNumber++;
	}
	
	public void characteristics(double processor, double screen, String producer, double priceTag) {
		CPU = processor;
		screenSize = screen;
		manufacturer = producer;
		price = priceTag;
		serialNumber++;
	}
	
	public void start() {
		System.out.println("Starting " + manufacturer + " computer.");
		this.startEclipse();
	}
	
	public static void shutDown() {
		System.out.println("Shutting this computer down.");
	}
	
	public static void startEclipse() {
		System.out.println("Eclipse is starting up.");
	}
	
	public void displayCharacteristics() {
		System.out.println("Manufacturer: " + manufacturer
				   + "\nprice: " + price
				   + "\nCPU power: " + CPU
				   + "\nscreen size: " + screenSize
				   + "\nserial number: " + serialNumber);
	}

}
