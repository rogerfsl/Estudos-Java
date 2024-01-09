package Generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Generics.entities.Products;
import Generics.services.CalculationService;

public class TestCalculation {
	
	public static void main(String[] args) {
		
		List <Products> list = new ArrayList<>();
		
		String path = "/tmp/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null){
				String[] fields = line.split(",");
				list.add(new Products(fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();	
			}
			
			Products x = CalculationService.max(list);
			System.out.println("Most expensive: " + x);
			
		}catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
