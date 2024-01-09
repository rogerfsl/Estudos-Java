package Generics;

import java.util.ArrayList;
import java.util.List;

import Generics.entities.Circle;
import Generics.entities.Rectangle;
import Generics.entities.Shape;

public class BoundedWildcards {
	
	
	public static void main(String[] args) {
		
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3, 2));
		myShapes.add(new Circle(2));
		
		List<Circle> myCircles = new ArrayList<Circle>();
		myCircles.add(new Circle(2));
		myCircles.add(new Circle(3));
		
		
		System.out.println("Total Area: " + totalArea(myShapes));
		
		System.out.println("Total Area: " + totalArea(myCircles));
	}
	

	private static double totalArea(List<? extends Shape> list) {
		double sum = 0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
