package session25;

public class ThrowingExceptions {
	public static void main(String[] args) {
		System.out.println("In this method we are intentionally throwing an error");
		
		try {
			isDone();
		} catch (Exception e1) {
			// let's say user leaves password field empty
			throw new JavaNotCompleteException(JavaNotCompleteException.PASSWORD_IS_EMPTY);
		}
		
		try {
			System.out.println( isDivisible(5, 3) );
			System.out.println( isDivisible(5, 0) );
		} catch (Exception e) {
//			e.printStackTrace();
			throw new RuntimeException( e.toString() );
		}
			
		System.out.println("end of main");
	}
	
	
	
	// sample method
	public static boolean isDivisible(int a, int b)  throws Exception  {
		if (b == 0) {
			throw new Exception("You can't divide by zero");
		}
		
		return true;
	}
	
	//
	public static boolean isDone() throws Exception {
		throw new JavaNotCompleteException();
	}
}
