package Generics;

import java.util.Scanner;

public class TestPrint {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int n  = scan.nextInt();
		
		for( int i = 0; i < n; i++) {
			System.out.print( (i +1) + "º number: ");
			int value = scan.nextInt();
			ps.addValue(value);
		}
		ps.print();
		System.out.println("First: " + ps.first());
		

	}

}
