package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import FunctionalProgramming.entities.Product;
import FunctionalProgramming.services.ProductService;

public class TestFunction2 {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
	
		ProductService ps = new ProductService();
		
		//double sum  = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
