package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import FunctionalProgramming.entities.Product;

public class TestProduct {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Desk", 120.00));

		/*Comparator <Product> comp = new Comparator<Product>() { // método anonimo

			@Override
			public int compare(Product p1, Product p2) {
				
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
				
			}
			
		};*/
		
		//Comparator <Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		
		//list.sort(new MyComparator());
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
