package Interface.entities;

import Interface.enums.Color;

public class Retangle extends AbstractShape{
	
	public double width;
	private double height;
	
	
	public Retangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	

}
