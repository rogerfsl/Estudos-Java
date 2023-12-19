package workingWithFiles;

import java.io.File;
import java.util.Scanner;

public class PathInfo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
	}

}
