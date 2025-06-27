package B07Lab5;

public class Square { 
	double side;

	public Square(double side) {
	    
	    this.side = side;
	}
	
	public double getSide() {
	    return side;
	}
	
	public double getArea() {
	    return side * side;
	}
	
	public double getPerimeter() {
	    return 4 * side;
	}

}
