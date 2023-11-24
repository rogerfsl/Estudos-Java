package AbstractClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int numShape = scan.nextInt();
		
		List<Shape> listShapes = new ArrayList<Shape>();
		
		for(int i = 1; i <= numShape; i++) {
			
			System.out.println("SHapr n° " + i + " data: ");
			System.out.print("Retangle or Circle: (r / c)");
			char resp = scan.next().charAt(0);
			
			if(resp == 'r') {
				System.out.print("Color (BLACK/ BLUE/ RED) ");
				Color color = Color.valueOf(scan.next().toUpperCase());
				
				System.out.print("Width: ");
				double width = scan.nextDouble();
				
				System.out.print("Height: ");
				double height = scan.nextDouble();
				
				listShapes.add(new Rectangle(color, width, height));
			} else if(resp == 'c') {
				System.out.print("Color (BLACK/ BLUE/ RED) ");
				Color color = Color.valueOf(scan.next().toUpperCase());
				
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				
				listShapes.add(new Circle(color, radius));
			}else {
				System.out.println("Invalid option.");
			}
		}
		System.out.println();
		System.out.println("Shape Area: ");
		for(Shape shape: listShapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
	}

}
