package session19;

public class ShapeTester {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(5);
//		System.out.println(circle.getArea());
		circle.setShapeName("Circle 1");
		
//		Square square = new Square();
//		square.setSide(5);
//		System.out.println(square.getArea());
//		square.setShapeName("Square 1");
		
		RegularRectangle rectangle = new RegularRectangle();
		SquareRectangle square = new SquareRectangle();
		
		rectangle.setOtherSide(5);
		rectangle.setSide(3);
		System.out.println( rectangle.getArea() );
		
		square.setSide(4);
		System.out.println( square.getArea() );
		
		System.out.println( rectangle.perimeter() );
		System.out.println( square.perimeter() );
		
		
//		System.out.println(circle.getShapeName() + square.getShapeName());
		
	}
}
