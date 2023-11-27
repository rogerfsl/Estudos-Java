package Model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private int roomNumber;
	
	private Date checkin;
	
	private Date checkout;

	public Reservation(int roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}


	public Date getCheckout() {
		return checkout;
	}

	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		diff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return diff;
	}
	
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkin = checkIn;
		this.checkout = checkOut;
		
	}

	@Override
	public String toString() {
		return "Reservation:  Room " + roomNumber + ", check - in: " + sdf.format(checkin) 
		+ ", check-out: " + sdf.format(checkout) + ", " + duration() + " nights.";
	}
	
	

}
