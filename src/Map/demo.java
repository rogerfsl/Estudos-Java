package Map;

import java.util.Map;
import java.util.TreeMap;

public class demo {

	public static void main(String[] args) {
		
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "999771122");
		
		cookies.remove("email");
		cookies.put("phone", "99977-1133");
		
		System.out.println("Contains 'phone' key? " + cookies.containsKey("phone"));
		System.out.println("phone number: " + cookies.get("phone"));
		System.out.println("email: " + cookies.get("email"));
		System.out.println("size: " + cookies.size());
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
