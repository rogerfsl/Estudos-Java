package Interface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Interface.entities.Vehicle;
import Interface.entities.carRental;
import Interface.services.BrazilTaxService;
import Interface.services.RentalService;

public class RentalTest {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter rental details: ");
		
		System.out.print("Car model: ");
		String carModel = scan.nextLine();
		
		System.out.print("Start date (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(scan.nextLine(), fmt);
		
		System.out.print("Final date (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), fmt);
		
		carRental cr1 = new carRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Price per Hour: ");
		double pricePerHour = scan.nextDouble();
		
		System.out.print("Price per Day: ");
		double pricePerDay = scan.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvouce(cr1);
		
		System.out.println("Invoice: ");
		System.out.println("Basic payment: " + String.format("%.2f", cr1.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f",cr1.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f",cr1.getInvoice().getTotalPayment()));
		
		
		scan.close(); 
	}

}
