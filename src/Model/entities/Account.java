package Model.entities;

import javax.security.auth.login.AccountException;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawlimit;

	public Account(int number, String holder, double balance, double withdrawlimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawlimit = withdrawlimit;
	}

	

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
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


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getWithdrawlimit() {
		return withdrawlimit;
	}


	public void setWithdrawlimit(double withdrawlimit) {
		this.withdrawlimit = withdrawlimit;
	}

	public double deposit (double depositAmout) {
		return balance += depositAmout;
	}
	
	public void withdraw(double withdrawValue) throws AccountException{
		
		if (withdrawlimit < withdrawValue) {
			throw new AccountException("The amount exceeds the withdrawal limit");
		} else if (balance < withdrawValue) {
			throw new AccountException("Insufficient funds.");
		}else {
			balance -= withdrawValue;
		}
	}


	@Override
	public String toString() {
		return "Account: Number: " + number + ", Holder: " + holder + ", Balance: $ " 
	+ String.format("%.2f", balance);
	}
	
	
	

}
