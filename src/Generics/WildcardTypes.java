package Generics;

import java.util.Arrays;
import java.util.List;

public class WildcardTypes {

	public static void main(String[] args) {
		
		List<Integer> myItns = Arrays.asList(5,2,10);
		printList(myItns);
		
		List<String> myStrs = Arrays.asList("Welson", "Maria", "Bob");
		printList(myStrs);

	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
