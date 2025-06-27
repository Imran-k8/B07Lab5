package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest2 {

	@Test
	void testSide() {
		Square s = new Square(2);
		assertEquals(2,s.getSide());
	}

	@Test
	void testArea() {
		Square s = new Square(2);
		assertEquals(4,s.getArea());
	}

	@Test
	void testPerimeter() {
		Square s = new Square(2);
		assertEquals(8,s.getPerimeter());
	}

}	
