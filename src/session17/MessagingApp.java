package session17;

public class MessagingApp {
	
	private String message;
	private String from;
	private String to;
	private Long fromNum;
	private Long toNum;
	
	public MessagingApp() {
		
	}
	
	public MessagingApp(String from, Long fromNum, String to, Long toNum, String message) {
		this.from = from;
		setFromNum( fromNum );
		this.to = to;
		this.toNum = toNum;
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		// ADD A LOGIC TO CUT MESSAGES LONGER THAN 160 CHARACTERS
		this.message = message;
	}
	
	public Long getFromNum() {
		return fromNum;
	}
	//"5715551122".length() == 10
	public void setFromNum(Long fromNum) {
		if (fromNum.toString().length() != 10) {
			System.out.println("WRONG NUMBER FORMAT");
			System.out.println(fromNum + " is NOT a correct 'from' number.");
			this.fromNum = 0L;
		} else {
			this.fromNum = fromNum;
		}
	}
	
	// HOMEWORK
	// define all getters and setters for the remaining fields
	// ADD LOGIC inside your setters
	
	public String toString() {
		return "Message from: " + from 
				+ "\nSent from: " + fromNum
				+ "\nMessage to: " + to
				+ "\nSent to: " + toNum
				+ "\nMessage body: " + message;
	}

}
