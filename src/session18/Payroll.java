package session18;

public class Payroll {
	public static void main(String[] args) {
		
		/* Employee is an ABSTRACT class now.
		 * It is just an IDEA out there, therefore we can't
		 * create its object. 
		 * If we want to create an object of an idea, we need
		 * to use the concrete classes that extend this idea
		 * into a realizable concept.
 
		Employee emp1 = new Employee("John", "Doe");
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee();
		System.out.println( emp2.toString() );
		*/
		
//		Employee.companyName = "Google";
		
//		System.out.println( Employee.COMPANY_NAME );
//		System.out.println( emp1.COMPANY_NAME );
//		
//		System.out.println(emp1.email);
		
		SDET sdet = new SDET("Jane", "Doe", "Java");
		System.out.println( sdet.toString() );
//		tester.setProgrammingLang("Java");
		sdet.setFirstName("Jane");
//		System.out.println( tester.getProgrammingLang() );
		
		
		Project boeing757 = new Project();
		boeing757.setBudget(12_000_000_000.0);
		boeing757.setName("Next Generation Boeing airplanes: A757");
		boeing757.employee = sdet;
		
		ProjectManager pm = new ProjectManager("Moby", "Dick", boeing757);
//		pm.setProject( boeing757 );
		
		System.out.println( pm.getProject().getName() );
		System.out.println( pm.getProject().employee.getFirstName() );
		
		System.out.println( pm.toString() );
		
		System.out.println(pm.email);
//		pm.email = "Testing@gmail.com";
	}

}
