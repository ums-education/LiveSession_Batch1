package session19;

public abstract class Square extends Shape {

	private double side;
	
//	public double getArea() {
//		return side * side;
//	}
	
	public abstract double perimeter();
	
	public double getSide() {
		return this.side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
