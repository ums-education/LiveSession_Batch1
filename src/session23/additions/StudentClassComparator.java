package session23.additions;

import java.util.Comparator;
import session23.Student;

public class StudentClassComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getClassName().compareTo(o2.getClassName());
	}

	
}
