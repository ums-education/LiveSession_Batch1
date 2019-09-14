package session23;

import java.util.*;

import session23.additions.StudentClassComparator;

public class SortingStudents {
	public static void main(String[] args) {
		// TODO -> HOMEWORK
		// rewrite the compareTo() in the Student class so that
		// students are ordered based on their MAJORs first
		// and then on their ids
		// Scenario:
		// 	GIVEN the following students
		// 	WHEN I sort them
		// 	THEN I will see Jane 1st, John 2nd, Jonas 3rd, Moby 4th.
		Student s1 = new Student(109, "John", "IT", "Emerging IT");
		Student s2 = new Student(202, "Jane", "CS", "Computer Hardware");
		Student s3 = new Student(95, "Moby", "Math", "Applied Mathematics");
		Student s4 = new Student(203, "Jonas", "IT", "Communications in IT");
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Moby");
		studentNames.add("Jane");
		studentNames.add("Jonas");
		
		Collections.sort(studentNames);
		System.out.println(studentNames);
		
		Collections.sort( students );
		
		System.out.println( students );
		
		System.out.println( "Jane".compareTo("John") );
		
		Collections.sort(students, new StudentClassComparator() );
		System.out.println( students );
		
	}
}
