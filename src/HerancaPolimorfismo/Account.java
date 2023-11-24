package HerancaPolimorfismo;

public class Account {
	
	private int accountNumber;
	private String holder;
	protected double balance;
	
	public Account() {
		
	}
	
	public Account(int accountNumber, String holder, double balance) {
		
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	
	public double getBalance() {
		return balance;
	}

	public double deposit(double value) {
		return this.balance += value;
				
	}
	
	
	public boolean withdraw(double withdrawValue) {
		if(balance >= withdrawValue + 5){
			balance -= withdrawValue + 5;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Account Number: " + accountNumber + ", Holder: " + holder + ", Amount: R$ " 
	+ String.format("%.2f", balance) ;
	}
	
	
	

}
