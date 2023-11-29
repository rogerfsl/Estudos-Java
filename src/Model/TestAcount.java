package Model;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

import Model.entities.Account;

public class TestAcount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Account acc1 = new Account(123, "Welson", 500, 300);
		
		System.out.println(acc1);
		
		System.out.print("Enter the amount to withdraw: ");
		double withdrawValue = scan.nextDouble();
		
		
		try {
			acc1.withdraw(withdrawValue);
			System.out.println(acc1);
		} catch (AccountException e) {
			System.out.println("Withdrawal error: " + e.getMessage());
		}
		
	}

}
