package session23;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<String>();
		aList.add("Moby");
		aList.add("Jonas");
		aList.add("John");
		aList.add("Jane");
		aList.add("Jane");
		// 1st printout
		System.out.println( aList );
		
		Set<String> hSet = new HashSet<String>();
		hSet.add("Jane");
		hSet.add("Jonas");
		hSet.add("John");
		hSet.add("Moby");
		hSet.add("Jane");
		hSet.add("Janet");
		// 2nd printout
		System.out.println( hSet );		
		
		/*// how to iterate Set objects
		for (String each : hSet) {
			System.out.println( each );
		}
		
		Iterator<String> hSetIterator = hSet.iterator();
		while (hSetIterator.hasNext()) {
			System.out.println(hSetIterator.next());
		}
		*/
		Set<String> uniqueAList = new HashSet<String>( aList );
		// 3rd printout
		System.out.println( uniqueAList );
		
		Set<String> lhSet = new LinkedHashSet<String>( aList );
		// 4th printout
		System.out.println( lhSet );
		
		Set<String> tSet = new TreeSet<String> ( aList );
		// 5th printout
		System.out.println( tSet );
		
		Student s1 = new Student(109, "John", "IT", "Emerging IT");
		Student s2 = new Student(202, "Jane", "CS", "Computer Hardware");
		Student s3 = new Student(95, "Moby", "Math", "Applied Mathematics");
		Student s4 = new Student(203, "Jonas", "IT", "Communications in IT");
		Student s5 = new Student(204, "Jane", "CS", "Computer Hardware");
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		TreeSet<Student> treeOfStudents = new TreeSet<Student> ( students );
		System.out.println(treeOfStudents);
		
		// TODO -> Homework
		// See if you can add Circle elements to a TreeSet
		
		// TODO -> Homework
		// Practice with null values added to Lists and Sets
	}
}
