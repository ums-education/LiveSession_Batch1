package session17;

public class EncapsulationTest {
	
	public static void main(String[] args) {
		MessagingApp textMsg1 = new MessagingApp();
//		System.out.println( textMsg1.toString() );
		
		MessagingApp textMsg2 = new MessagingApp("John", 715551122L, "Jane", 5712225555L, "Hi!");
		
//		System.out.println( textMsg2.getMessage() );
		textMsg2.setMessage("Do you want to meet and talk?");
//		System.out.println(textMsg2.getMessage());
		
		System.out.println( textMsg2.toString() );
	}

}
