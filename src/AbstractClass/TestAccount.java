package AbstractClass;

import java.util.ArrayList;
import java.util.List;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Account acc1 = new Account(01, "Alex", 1000);
		//Account acc2 = new SavingsAccount(02, "Maria", 1000, 0.01);
		//Account acc3 = new BusinessAcount(03, "Welson", 1000, 500);
		
		List<Account> listAccount = new ArrayList<Account>();
		
		listAccount.add(new SavingsAccount(02, "Maria", 1000, 0.01));
		listAccount.add(new BusinessAcount(03, "Welson", 20000, 1500));
		listAccount.add(new SavingsAccount(04, "Joel", 500, 0.01));
		listAccount.add(new BusinessAcount(05, "Victoria", 600, 300));
		
		double sum = 0;
		
		for(Account acc: listAccount) {
			sum += acc.getBalace();
		}
		System.out.println("Total Balance: $ " + String.format("%.2f", sum));
		
		for(Account acc: listAccount) {
			acc.deposit(10);
		}
		
		for(Account acc: listAccount) {
			System.out.printf("Updated balance for account %d: %.2f%n " , acc.getNumber(), acc.getBalace());
		}
			
			
	}

}
