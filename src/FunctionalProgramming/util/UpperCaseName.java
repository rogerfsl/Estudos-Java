package FunctionalProgramming.util;

import java.util.function.Function;

import FunctionalProgramming.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
