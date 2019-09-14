package session19;

public class Circle extends Shape {

	private double radius;
	
	
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// this method here is optional because it is
	// 	already implemented inside the Parent class
	//  however, you can override it as necessary
	public String getShapeName() {
		return "Showing off: " + super.getShapeName();
	}
	
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
