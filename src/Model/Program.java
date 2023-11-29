package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.entities.Reservation;
import Model.excepitions.DomainException;

public class Program {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Room number: ");
			int number = scan.nextInt();
			
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date chekIn = sdf.parse(scan.next());
			
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date chekOut = sdf.parse(scan.next());
			
			Reservation reservation = new Reservation(number, chekIn, chekOut);
			System.out.println(reservation);
			
			System.out.print("Want update reservation? [ Y / N ] ");
			char resp = scan.next().toUpperCase().charAt(0);
			
			if(resp == 'Y') {
				System.out.println("Enter data to update the reservation: ");
				System.out.print("Check-in date (dd/mm/yyyy): ");
				chekIn = sdf.parse(scan.next());
				
				System.out.print("Check-out date (dd/mm/yyyy): ");
				chekOut = sdf.parse(scan.next());
				
				reservation.updateDates(chekIn, chekOut);
				System.out.println("Reservation successfully updated.");
				System.out.println(reservation);
				
			} else if( resp == 'N') {
				System.out.print("Reservation made successfully.");
			}else {
				System.out.println("Invalid Option.");
			}
		} catch (ParseException e) {
			System.out.println("Invalid date format. ");
		} catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Unexpected error.");
		}
			
		
		
	}

}
