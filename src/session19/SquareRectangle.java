package session19;

public class SquareRectangle extends Square {

	
	public double getArea() {
		return super.getSide() * super.getSide();
	}
	
	public double perimeter() {
		return super.getSide()*4;
	}

}
