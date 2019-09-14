package session23;

import session18.*;
import java.util.*;

public class ManagerNameComparator implements Comparator<Manager> {

	@Override
	public int compare(Manager m1, Manager m2) {
//		if ( m1.getFirstName().compareTo( m2.getFirstName() ) == 0 ) {
//			return 0;
//		} else if ( m1.getFirstName().compareTo( m2.getFirstName() ) < 0  ) {
//			return -1;
//		} else {
//			return 1;
//		}
		
		return m1.getFirstName().compareTo( m2.getFirstName() );
	}

}
