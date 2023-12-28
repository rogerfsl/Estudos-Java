package Interface;

import Interface.entities.AbstractShape;
import Interface.entities.Circle;
import Interface.entities.Retangle;
import Interface.enums.Color;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Retangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}

}
