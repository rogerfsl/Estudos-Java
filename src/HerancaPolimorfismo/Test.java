package HerancaPolimorfismo;

public class Test {
	
	public static void main(String[] args) {
		
		
		Account acc = new Account(101,"Alex", 0);
		
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0, 500);
		
		//upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003,"Bob", 0, 200);
		Account acc3 = new SavingsAccount(1004, "Ana", 0, 0.1);

		
		
		//downcasting
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		//BusinessAcount acc5 = (BusinessAcount) acc3; só vai dar problema quando executar a aplicação 
		if(acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount) acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
	}

}
