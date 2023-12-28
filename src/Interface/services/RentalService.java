package Interface.services;

import java.time.Duration;

import Interface.entities.carRental;
import Interface.entities.invoice;

public class RentalService {
	
	private double pricePerHour;
	private double pricePerDay;
	private TaxService taxService;
	
	public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	
	public void processInvouce(carRental carRental) {
		
		double diff = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = diff / 60;  
		double days = hours /24;
		
		double basicPayment;
		if (hours <= 12) {
			basicPayment = pricePerHour * Math.ceil(hours);
			
		}else {
			basicPayment = pricePerDay* Math.ceil(days);

		}
		double tax  = taxService.tax(basicPayment);
		
		carRental.setInvoice(new invoice(basicPayment, tax));
	}
	
	
}
