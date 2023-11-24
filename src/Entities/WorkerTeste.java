package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.enums.WorkerLevel;

public class WorkerTeste {

	public static void main(String[] args) throws ParseException{
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter departmet's name: ");
		String departmentName = scan.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		
		System.out.print("Base Salary: ");
		double baseSalary = scan.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
		
		
		System.out.print("How many contracts to this worker? ");
		int numberContracts = scan.nextInt();
		
		for (int i = 1; i <= numberContracts; i++) {
			System.out.println("Enter contract " + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contratcDate = sdf.parse(scan.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = scan.nextInt();
		
			HourContract contract = new HourContract(contratcDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.println();
		System.out.print("Enter  month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Worker: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Infome for " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));
		

	}

}
