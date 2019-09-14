package session16;

public class DemoWrappers {
	
	public static void main(String[] args) {
		
		int iPri = 5;
		Integer i = new Integer(5);
		
		System.out.println( i.MAX_VALUE );
		System.out.println( i.MIN_VALUE );
		
		Long l = new Long("54729487");
		System.out.println( l );
		System.out.println(l.MAX_VALUE);
		System.out.println(l.MIN_VALUE);
		
		Character ch = new Character('a');
		
		String test = "djs894(*$lkjfa";
		for (char each: test.toCharArray()) { 
			if ( Character.isLetter(each) ) {
				System.out.println(each);
			}
		}
		
		char c = ch;
		
		int streetNumber = new Integer("3355");
		String str = Integer.valueOf(5533).toString();
		
		System.out.println(streetNumber);
		System.out.println(str);
	}

}
