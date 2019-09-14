package session19;

//TODO
//HOMEWORK
// Create a wire-diagram (aka wire-frame, aka framework) of
// our ShapeTester program.
public abstract class Shape {
	private String shapeName;
	
	public abstract double getArea();

	
	public String getShapeName() {
		return this.shapeName;
	}
	
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
}
