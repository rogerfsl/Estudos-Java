package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.entities.Reservation;

public class Program {
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			
			System.out.print("Room number: ");
			int number = scan.nextInt();
			
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date chekIn = sdf.parse(scan.next());
			
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date chekOut = sdf.parse(scan.next());
			
			if(chekOut.after(chekIn)) {
				Reservation reservation = new Reservation(number, chekIn, chekOut);
				System.out.println(reservation);
				System.out.print("Want update reservation? [ Y / N ] ");
				char resp = scan.next().toUpperCase().charAt(0);
				if (resp == 'N') {
					System.out.print("Reservation made successfully.");
					break;
				}else if(resp == 'Y') {
					System.out.println("Enter data to update the reservation: ");
					System.out.print("Check-in date (dd/mm/yyyy): ");
					chekIn = sdf.parse(scan.next());
					
					System.out.print("Check-out date (dd/mm/yyyy): ");
					chekOut = sdf.parse(scan.next());
					
					Date now = new Date();
					if(chekIn.before(now) || chekOut.before(now)) {
						System.out.println("Error in reservation: Reservation dates for update must be future dates.");
					}else {
						if(chekOut.after(chekIn)) {
							reservation.updateDates(chekIn, chekOut);
							System.out.println("Reservation successfully updated.");
							System.out.println(reservation);
							break;
						}else {
							System.out.println("Error in reservation: Check-out date must be after check-in date.");
						}
					}
					
					
				}
			}else {
				System.out.println("Error in reservation: Check-out date must be after check-in date.");
				
			}	
			
		}
		
		
		
		
	}

}
