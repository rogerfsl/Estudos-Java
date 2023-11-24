package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listaPessoa = new ArrayList<>();
		 
		listaPessoa.add("Welson");
		listaPessoa.add("Ricardo");
		listaPessoa.add("Leo");
		listaPessoa.add("Victor");
		listaPessoa.add(2, "Luis");
		
		System.out.println(listaPessoa.size());
		
		
		for(String pessoa: listaPessoa) {
			System.out.println(pessoa);
		}
		
		System.out.println("-----------------");
		//listaPessoa.remove("Leo");
		//listaPessoa.remove(1);
		
		listaPessoa.removeIf(x ->  x.charAt(0) == 'R');
		
		for(String pessoa: listaPessoa) {
			System.out.println(pessoa);
		}
		System.out.println("-----------------");
		System.out.println("Index of Leo: " + listaPessoa.indexOf("Leo"));
		System.out.println("Index of Ricardo: " + listaPessoa.indexOf("Ricardo"));
		

		System.out.println("-----------------");
		List<String> result = listaPessoa.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for(String pessoa: result) {
			System.out.println(pessoa);
		}
		System.out.println("-----------------");
		
		String name = listaPessoa.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
		
		System.out.println(name);
		
		
	}

}
