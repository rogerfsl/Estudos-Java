package Set;

import java.util.HashSet;
import java.util.Set;

import Set.entities.Product;

public class Demo3 {
	
	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<Product>();
		
		set.add(new Product("Tv", 900));
		set.add(new Product("Notebook", 1200));
		set.add(new Product("Table", 400));
		
		Product prod = new Product("Notebook", 1200);
		
		System.out.println(set.contains(prod));
		// pela referencia por ponteiros a comparação é falsa.
		// Implementando hashCode e Equals na classe product a comparação se torna verdadeira
		
	}

}
