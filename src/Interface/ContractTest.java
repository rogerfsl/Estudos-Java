package Interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Interface.entities.Contract;
import Interface.entities.Installment;
import Interface.services.ContractService;
import Interface.services.PaypalService;


public class ContractTest {

	public static void main(String[] args) {
		

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the contract details ");
		
		System.out.print("Number: ");
		int number = scan.nextInt();
		
		System.out.print("Date (DD/MM/YYYY): ");
		LocalDate date = LocalDate.parse(scan.next(), fmt);
		
		System.out.print("Contract value: ");
		double contractValue = scan.nextDouble();
		
		Contract obj = new Contract(number, date, contractValue);
		
		System.out.print("Enter the number of installments: ");
		int num = scan.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, num);
		
		System.out.println("Installments: ");
		for( Installment installment: obj.getInstallments()) {
			System.out.println(installment);
		}
		
		
		
		scan.close();
	}

}
