package Interface;

import java.util.Scanner;

import Interface.services.InterestService;
import Interface.services.UsalnterestService;

public class ServiceTest {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Amount: " );
		double amount = scan.nextDouble();
		System.out.print("Months: ");
		int months = scan.nextInt();
		
		InterestService is = new UsalnterestService(1);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months: " );
		System.out.println(String.format("%.2f", payment));
		

	}

}
