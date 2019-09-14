package session25;

public class JavaNotCompleteException extends RuntimeException {
	public static final String PASSWORD_IS_EMPTY = "password needs to be 8 chars long";
	public static final String PASSWORD_IS_INCORRECT = "please re-enter your password";
	
	public JavaNotCompleteException() {
		super();
	}
	
	public JavaNotCompleteException(String message) {
		super(message);
	}
	
}
