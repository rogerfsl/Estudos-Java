package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		method1();
		
	
		
		System.out.println("The End.");
	}
	
	public static void method1() {
		System.out.println("-=-METHOD 1 START-=-");
		method2();
		System.out.println("-=-METHOD 1 END-=-");


	}
	public static void method2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-=-METHOD 2 START-=-");
		try {
			String[] vect = scan.nextLine().split(" ");
			int position = scan.nextInt();
			System.out.println(vect[position - 1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid position");
			e.printStackTrace();
			scan.next();
			
		}catch (InputMismatchException e) {
			
			System.out.println("Imput Error.");
		}
		System.out.println("-=-METHOD 2 END-=-");
	}

}
