package session24;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> students = new HashMap<Integer, String>();
			students.put(1019, "Moby Dick");
			students.put(102, "Jane Doe");
			students.put(101, "John Doe");
			students.put(99, "Jonas Johnson");
			
			
		Map<String, String> countriesCapitals = new TreeMap<String, String>();
			countriesCapitals.put("USA", "Washington, DC");
			countriesCapitals.put("Canada", "Ottawa");
			countriesCapitals.put("Mexico", "Mexico city");
			
		/*		ID 		Name		LastName		Course
		 * 		25		John		Doe				IT
		 * 		38		Jane		Doe				CS
		 */
		Map<String, String> student1 = new HashMap<String, String>();
			student1.put("ID", "25");
			student1.put("Name", "John");
//			student1.put("ID", "29");
			student1.put("LastName", "Doe");
			student1.put("Course", "CS");
			
		Map<String, String> student2 = new HashMap<String, String>();
			student2.put("ID", "38");
			student2.put("Name", "Jane");
			student2.put("LastName", "Doe");
			student2.put("Course", "IT");
			
			System.out.println(student1);
			System.out.println(student2);
			
		System.out.println("Show me student2's name: " + student2.get("Name"));
		Set<String> student2Keys = student2.keySet();
		System.out.println(student2Keys);
		
			
		// EVERY TIME we print an object, compiler by default uses that object's toString()
		student2.putAll( countriesCapitals );
		System.out.println("New student2: " + student2);
		
		
		System.out.println( students );
		System.out.println( countriesCapitals );
	}
}
