package Set;

import java.util.Set;
import java.util.TreeSet;

import Set.entities.Product;

public class Demo4 {
	
	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<Product>();
		
		set.add(new Product("Tv", 900));
		set.add(new Product("Notebook", 1200));
		set.add(new Product("Table", 400));
		
		for(Product p: set) {
			System.out.println(p);
		}
		
	}

}
