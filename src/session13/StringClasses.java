package session13;

public class StringClasses {

	public static void main(String[] args) {
		speedTestString();
		speedTestStringBuffer();
	}
	
	public static void speedTestString() {
		long startTime = System.currentTimeMillis();
		
		String test = "Java";
		
		for (int i = 0; i < 100_000; i++) {
			test += "is fun"; // Javais fun // Javais funisfun // Javais funisfun isfun
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println( endTime - startTime );
	}
	
	public static void speedTestStringBuffer() {
		long startTime = System.currentTimeMillis();
		
		StringBuffer test = new StringBuffer("Java");
		
		for (int i = 0; i < 100_000; i++) {
			test.append("is fun");
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println( endTime - startTime );
	}

	public static void introduction() {
		String name = "John";

		StringBuffer nameBuffer = new StringBuffer("John Buffer");
//		nameBuffer = "John"; this does not compile

		System.out.println(name);
		System.out.println(nameBuffer);

		name.toUpperCase(); // this did NOT change the value of 'name'
							// it just created another String pool literal that is "JOHN"
		String nameUpper = name.toUpperCase();
		System.out.println(nameUpper + " vs " + name);

		nameBuffer.insert(nameBuffer.length(), 'y');

		nameBuffer.append(nameBuffer);

		boolean isTrue = nameBuffer.equals(nameBuffer);
		System.out.println(isTrue);

		System.out.println(nameBuffer);
	}

}
