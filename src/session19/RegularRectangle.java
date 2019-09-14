package session19;

public class RegularRectangle extends Square {
	private double otherSide;
	
	public double getArea() {
		return this.otherSide * super.getSide();
	}
	
	public double perimeter() {
		return super.getSide()*2 + otherSide*2;
	}

	public double getOtherSide() {
		return this.otherSide;
	}
	public void setOtherSide(double otherSide) {
		this.otherSide = otherSide;
	}
}
