package session19;

public class RightTriangle extends Shape {

	private double hypotenuse;
	private double sideA;
	private double sideB;
	
	
	
	public double getArea() {
		return sideA * sideB / 2;
	}
	
	
	public double getHypotenuse() {
		return hypotenuse;
	}
	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}	
}
