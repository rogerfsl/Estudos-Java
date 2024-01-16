package FunctionalProgramming.util;

import java.util.function.Predicate;

import FunctionalProgramming.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		// TODO Auto-generated method stub
		return p.getPrice() >= 100;
	}
	
	

}
