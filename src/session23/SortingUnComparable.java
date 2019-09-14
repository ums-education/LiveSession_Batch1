package session23;

import session18.Manager;
import java.util.*;

public class SortingUnComparable {
	public static void main(String[] args) {
		
		Manager man1 = new Manager("John", "Doe");
		Manager man2 = new Manager("Jane", "Simpson");
		Manager man3 = new Manager("Jonas", "Johnson");
		
		ArrayList<Manager> managers = new ArrayList<Manager>();
		managers.add(man1);
		managers.add(man2);
		managers.add(man3);
		
		//              take a list 
		//						   use the logic inside the ManagerComparator
		// sort accordingly...
		Collections.sort(managers, new ManagerNameComparator());
		
		System.out.println(managers);
		
		Collections.sort(managers, new ManagerLastNameComparator());
		
		System.out.println( managers );
		
		Comparator<Manager> comparingIds = Comparator.comparing(Manager :: getId);
		Collections.sort(managers, comparingIds);
		System.out.println( managers );
		
		Comparator<Manager> comparingLastNames = Comparator.comparing(Manager :: getLastName);
		Collections.sort(managers, comparingLastNames);
		System.out.println( managers );
		
	}
}
