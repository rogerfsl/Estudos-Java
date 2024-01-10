package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentPortal {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<Integer>();
		Set<Integer> courseB = new HashSet<Integer>();
		Set<Integer> courseC = new HashSet<Integer>();
		
		System.out.print("How many students for a course A: ");
		int n = scan.nextInt();
		
		for(int i = 0; i< n; i++) {
			System.out.print((i+1) + "°  student registration number: ");
			int number = scan.nextInt();
			courseA.add(number);
		}
		
		System.out.print("How many students for a course B: ");
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + "°  student registration number: ");
			int number = scan.nextInt();
			courseB.add(number);
		}
		
		System.out.print("How many students for a course B: ");
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + "°  student registration number: ");
			int number = scan.nextInt();
			courseC.add(number);
		}
		
		Set<Integer> alexTotal = new HashSet<Integer>(courseA);
		alexTotal.addAll(courseB);
		alexTotal.addAll(courseC);
		
		System.out.println("Alex total students: " + alexTotal.size());

	}

}
