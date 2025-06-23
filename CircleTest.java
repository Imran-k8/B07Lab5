package lab4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testDiameter() {
        Circle circle = new Circle(new Point(0.0, 0.0), 5.0);
        assertEquals(10.0, circle.diameter());
    }

    @Test
    public void testCircumference() {
        Circle circle = new Circle(new Point(1.0, 1.0), 2.0);
        assertEquals(4 * Math.PI, circle.circumference());
    }

    @Test
    public void testArea() {
        Circle circle = new Circle(new Point(-2.0, 3.5), 3.0);
        assertEquals(9 * Math.PI, circle.area());
    }

    @Test
    public void testConstructorSetsFields() {
        Point center = new Point(4.0, -1.0);
        Circle circle = new Circle(center, 7.0);
        assertSame(center, circle.centre);
        assertEquals(7.0, circle.radius);
    }
}
