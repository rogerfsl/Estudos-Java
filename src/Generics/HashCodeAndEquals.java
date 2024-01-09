package Generics;

import Generics.entities.Client;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		String s3 = new String("test");
		String s4 = new String("test");
		
		System.out.println(s1 == s2); //  Compilador entende como verdadeiro
		System.out.println(s3 == s4); // 
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // comparação por conteudo
		System.out.println(c1 == c2); // compareção por referencia
		
		
		
		/*String a = "Maria";
		String b = "Alex";
		 
		System.out.println(a.equals(b));
		 
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());*/
	}

}
