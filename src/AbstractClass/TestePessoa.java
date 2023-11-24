package AbstractClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayer = scan.nextInt();
		
		List<Pessoa> listTax = new ArrayList<>(); 
		
		for(int i =1; i <= taxPayer; i++) {
			System.out.println("Tax n° " + i + " data: ");
			System.out.print("Individual or Company: ");
			char resp = scan.next().toLowerCase().charAt(0);
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = scan.nextDouble();
			
			if(resp == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpen = scan.nextDouble();
				listTax.add(new PessoaFisica(name, anualIncome, healthExpen));
			
			}else if(resp == 'c') {
				System.out.print("Number of employees: ");
				int numEmployee = scan.nextInt();
				listTax.add(new PessoaJuridica(name, anualIncome, numEmployee));
			}else {
				System.out.println("Invalid option");
			}
			
		}
		double totalTaxes = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for (Pessoa p: listTax) {
			System.out.println(p.getNome() + " $ " + String.format("%.2f", p.impostoRenda()));
			totalTaxes += p.impostoRenda();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

	}

}
