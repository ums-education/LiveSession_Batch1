package session15;

public class ComputerStore {
	
	public static void main(String[] args) {
		
		Computer.serialNumber = 102_453;
		
		Computer laptop = new Computer();
		laptop.CPU = 2.3;
		laptop.manufacturer = "Dell";
		laptop.assignSN();
		laptop.price = 1299.0;
		laptop.screenSize = 15.4;
		laptop.start();
				

		laptop.displayCharacteristics();
		laptop.shutDown();
		
		
		Computer desktop = new Computer();
//		desktop.characteristics(3.0, 24.7, "HP", 899);
		desktop.start();

		desktop.displayCharacteristics();
		
		
		
		
		
	}

}
