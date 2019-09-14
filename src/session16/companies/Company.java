package session16.companies;

//import java.util.Scanner;
import java.util.*;

import session16.Employee;

import static java.lang.Math.*;
import static java.util.Arrays.sort;
import static java.util.Arrays.binarySearch;


public class Company {
	
	public static void main(String[] args) {
		run();
		
	}
	
	public static void run() {
		// starting Employee ID should be 100
//		Employee.id = 100;	// you can't access it any more - it is private
		
		Employee SDET = new Employee("John Doe", "SDET", 120000);
		System.out.println( SDET.toString() );
		
		Employee developer = new Employee("Jane Doe", "Dev", -125000);
		developer.title = "Devop Engineer";
		developer.salary = 125000;
		System.out.println(developer.toString());
		
		
//		Employee.id = 5;
		
		Employee temp = new Employee("Moby Dick");
		System.out.println(temp.toString());
		
		
		
//		System.out.println("Last ID issued: " + Employee.id);
	}
	
	public static void demoStaticImport() {
		Scanner scan = new Scanner(System.in);
		sort( new int[] {1, 5, 3} );
		binarySearch(new int[] {1, 2, 5}, 2);
		
		min(3, 5);
		max(3, 5);
		abs(3 - 5);
	}

}
