package Set.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestLog {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = scan.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> logInfo = new HashSet<LogEntry>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				
				String username = fields[0];
				
				Date moment = Date.from(Instant.parse(fields[1]));
				
				logInfo.add(new LogEntry(username, moment));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + logInfo.size());
			
		}catch( IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
