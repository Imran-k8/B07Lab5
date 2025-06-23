package lab4;

public class Circle {
	Point centre;
	double radius;
	
	public Circle(Point centre)
	{
		this.centre = centre;
	}
	public double diameter() {
		return 2*radius;
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}

}
	
