package HerancaPolimorfismo;

public class TestPoli {

	public static void main(String[] args) {

		Account x = new Account(1020, "Welsob", 1000);
		
		Account y = new SavingsAccount(1023,"Maria", 1000, 0.01);
		
		x.withdraw(50);
		y.withdraw(50);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
