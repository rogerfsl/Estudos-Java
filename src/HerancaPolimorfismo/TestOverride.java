package HerancaPolimorfismo;

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account(1001, "Welson", 1000);
		acc1.withdraw(200);
		System.out.println(acc1.balance);
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAcount(1003,"Bob", 1000, 500);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());

	}

}
