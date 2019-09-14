package session23;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("John");
		lList.add("Doe");
		lList.add(1, "Jane");
		lList.set(1, "Jonas");
		lList.addLast("Moby");
		
//		for (int i = 0; i < lList.size(); i++) {
//			System.out.println( lList.get(i) );
//		}
		
		
		System.out.println( lList );
	}
}
