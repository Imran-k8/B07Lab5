package B07Lab5
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    public void testGetSide1() {
    	double side = 5.0;
    	Square square = new Square(side);
        assertEquals(5.0, square.getSide());
    }
    
    @Test
    public void testGetSide2() {
    	double side = 0.0;
    	Square square = new Square(side);
        assertEquals(0.0, square.getSide());
    }
    
    @Test
    public void testGetArea1() {
    	double side = 5.0;
    	Square square = new Square(side);
        assertEquals(25.0, square.getArea());
    }

    @Test
    public void testGetArea2() {
    	double side = 0.0;
    	Square square = new Square(side);
        assertEquals(0.0, square.getArea());
    }
    
    @Test
    public void testGetPerimeter1() {
    	double side = 5.0;
    	Square square = new Square(side);
        assertEquals(20.0, square.getPerimeter());
    }

    @Test
    public void testGetPerimeter2() {
    	double side = 0.0;
    	Square square = new Square(side);
        assertEquals(0.0, square.getPerimeter());
    }
}
