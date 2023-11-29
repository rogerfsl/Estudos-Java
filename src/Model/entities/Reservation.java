package Model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Model.excepitions.DomainException;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private int roomNumber;
	
	private Date checkIn;
	
	private Date checkOut;

	public Reservation(int roomNumber, Date checkIn, Date checkOut) {
		if(!checkOut.after(checkIn)) {
			throw new DomainException ("Error in reservation: Check-out date must be after check-in date.");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}


	public Date getCheckout() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		diff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return diff;
	}
	
	
	public void updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException (" Reservation dates for update must be future dates.");
		} 
		if(!checkOut.after(checkIn)) {
			throw new DomainException ("Error in reservation: Check-out date must be after check-in date.");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}

	@Override
	public String toString() {
		return "Reservation:  Room " + roomNumber + ", check - in: " + sdf.format(checkIn) 
		+ ", check-out: " + sdf.format(checkOut) + ", " + duration() + " nights.";
	}
	
	

}
