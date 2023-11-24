package HerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numEmployee = scan.nextInt();
		
		List<Employee> listEmployees = new ArrayList<>();
		
		for (int i = 0; i < numEmployee; i++ ) {
			System.out.println("Employee " + (i+1) + " data: ");
			
			System.out.print("Outsourced: [y / n] ");
			char resp = scan.next().charAt(0);
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			if (resp == 'n') {
				listEmployees.add(new Employee(name, hours, valuePerHour));	
			}else if(resp == 'y'){
				System.out.print("Additional charge: ");
				double additonal = scan.nextDouble();
				listEmployees.add(new OutsourcedEmployee(name, hours, valuePerHour, additonal));
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		
		for(Employee emp: listEmployees) {
			System.out.println("Name: " + emp.getName() + " - $ - " + String.format("%.2f", emp.payment()));
		}

	}

}
