package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
		
	}

}
