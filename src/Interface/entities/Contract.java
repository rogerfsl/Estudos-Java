package Interface.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	 
	private int number;
	private LocalDate date;
	private double value;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	
	public Contract() { }

	public Contract(int number, LocalDate date, double value) {
		this.number = number;
		this.date = date;
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	
}
