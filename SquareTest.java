
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    public void testGetSide() {
    	double side = 5.0;
    	Square square = new Square(side);
        assertEquals(5.0, square.getSide());
    }

    @Test
    public void testGetArea() {
    	double side = 5.0;
    	Square square = new Square(side);
        assertEquals(25.0, square.getArea());
    }

    @Test
    public void testGetPerimeter() {
    	double side = 5.0;
    	Square square = new Square(side);
        assertEquals(20.0, square.getPerimeter());
    }
}
