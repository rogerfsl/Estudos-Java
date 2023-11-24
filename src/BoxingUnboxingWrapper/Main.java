package BoxingUnboxingWrapper;

public class Main {
	
	public static void main(String[] args) {
		
		//Boxing
		//É o processo de conversão de um objeto tipo valor para um objeto tipo referencia compativel.
		
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		//Unboxing
		// É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível.
		
		int y = (int) obj;
		System.out.println(y);
		
		
				
	}
}
