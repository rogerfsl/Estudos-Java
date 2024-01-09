package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedWildcards2 {
	
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		
		List<Object> myObjs = new ArrayList<Object>();
		
		
		
		copy(myInts, myObjs);	
		print(myObjs);
		System.out.println();
		
		copy(myDoubles, myObjs);
		print(myObjs);
		
		
		
	}
	
	public static void copy(List<? extends Number> source,List<? super Number> destiny ) {
		for (Number number : source) {
			destiny.add(number)
;		}
	}
	
	public static void print(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}

/*
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		list.add(20); // Erro de compilação. Covariância
		
		
		List<Object> myObj = new ArrayList<Object>();
		myObj.add("Welson");
		myObj.add("Maria");
		
		List<? super Number> myNums = myObj;
		myNums.add(10);
		myNums.add(3.14);
		
		Number x = myNums.get(0); // Erro de compilação. Contravariância;
 */
