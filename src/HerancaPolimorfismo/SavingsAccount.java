package HerancaPolimorfismo;

public class SavingsAccount extends Account{
	
	private double interestRate;
	
	public SavingsAccount () {
		super();
	}

	public SavingsAccount(int accountNumber, String holder, double balance, double interestRate) {
		super(accountNumber, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public boolean withdraw(double withdrawValue) {
		if(balance >= withdrawValue){
			balance -= withdrawValue;
			return true;
		}
		return false;
	}
	

}
	
	
