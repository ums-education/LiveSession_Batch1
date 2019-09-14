package session10;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		 char[] a = {'h', 'e', 'l', 'l', 'o', '1'};
		 char[] b = {'h', 'e', 'l', 'o', 'l', '1'};
		 
		 System.out.println( areEqual(a, b) );
		 
	}

	// char[] a = {'h', 'e', 'l', 'l', 'o', '1'};
	// char[] b = {'h', 'a', 'l', 'l', 'o', '1'};
	public static boolean areEqual(char[] a, char[] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] != b[i]) {
				return false;
			}

		}

		return true;
	}

}
