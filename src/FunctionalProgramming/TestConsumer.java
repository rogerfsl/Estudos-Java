package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import FunctionalProgramming.entities.Product;
import FunctionalProgramming.util.PriceUpdate;

public class TestConsumer {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
	
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1;
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		
		//list.forEach(new PriceUpdate());
		//list.forEach(Product::staticPriceUpdate);
		//list.forEach(Product::nonStaticPriceUpdate);
		//list.forEach(cons);
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		

	}

}
