package workingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import HerancaPolimorfismo.Product;

public class ex {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner scan = new Scanner(System.in);
		
		List<Products> listProd = new ArrayList<Products>();
		
		System.out.println("Enter a folder path: ");
		String strPath = scan.nextLine();
		
		File sourceFile = new File(strPath);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean Sucess = new File (sourceFolderStr + "/out").mkdir();
		
		String targetFileStr = sourceFolderStr + "/out/summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String itemCsv = br.readLine();
			
			while(itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int qtd = Integer.parseInt(fields[2]);
				
				listProd.add(new Products(name, price, qtd));
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for (Products item : listProd) {
					bw.write(item.getName() + "," + String.format("%.2f", item.totalPrice()));
				}
				
			}catch( IOException e) {
				System.out.println("Error. " + e.getMessage());
			}
		}catch(IOException e) {
			System.out.println("Error. " + e.getMessage());
		}
		
		
	}

}
