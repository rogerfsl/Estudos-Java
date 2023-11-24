package HerancaPolimorfismo;

public class BusinessAcount extends Account{
	
	private double loanLimit;


	public BusinessAcount() {
		super();
	}

	public BusinessAcount(int accountNumber, String holder, double balance, double loanLimit) {
		super(accountNumber, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
	}

	@Override
	public boolean withdraw(double withdrawValue) {
		// TODO Auto-generated method stub
		return super.withdraw(withdrawValue + 2);
	}
	
	
	

}
