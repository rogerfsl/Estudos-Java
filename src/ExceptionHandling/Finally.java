package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		File file = new File("/home/rogerfsl/Documents/in.txt");
		Scanner scan = null;
		
		try {
			scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.out.println("Error openning file: " + e.getMessage());
		}finally {
			if(scan != null) {
				scan.close();
			}
			System.out.println("Finally block executed");
		}
	}
}
