package workingWithFiles;

import java.io.File;
import java.util.Scanner;

public class ManipulatingFolders {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);

		System.out.println("Files: ");
		for(File f: files) {
			System.out.println(f);
		}
		
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory created successully. " + success);
		
		scan.close();
	}

}
