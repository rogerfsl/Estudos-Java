package HerancaPolimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		List<Product> listProduct = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int numProd = scan.nextInt();
		
		for (int i = 1; i <= numProd; i++) {
			System.out.println("Product n° " + i + " data: ");
			System.out.print("Common, Used or Imported (c / i / u) ");
			char typeProd = scan.next().charAt(0);
			
			System.out.print("Name: ");
			String name = scan.next();
			
			System.out.print("Price: ");
			double price = scan.nextDouble();
			if(typeProd == 'c') {
				listProduct.add(new Product(name, price));
			}else if(typeProd == 'i') {
				System.out.print("Customs fee: ");
				double fee = scan.nextDouble();
				listProduct.add(new ImportedProduct(name, price, fee));
			}else if(typeProd == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY) ");
				LocalDate date = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				listProduct.add(new UsedProduct(name, price, date));
			}
		}
		
		System.out.println();
		System.out.println("Price Tags: ");
		for(Product prod: listProduct) {
			System.out.println(prod.priceTag());
		}
		
	}

}
