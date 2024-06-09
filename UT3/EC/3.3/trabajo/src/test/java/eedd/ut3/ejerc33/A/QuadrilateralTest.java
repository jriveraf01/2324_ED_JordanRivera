package eedd.ut3.ejerc33.A;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadrilateralTest {

    private Quadrilateral square1, square2, rectangle1, rectangle2, quad;

    @BeforeEach
    public void setUp() throws Exception {
        square1 = new Quadrilateral(new Point(2, 3), new Point(4, 7), new Point(8, 5), new Point(6, 1));
        square2 = new Quadrilateral(new Point(-1, -1), new Point(-1, 1), new Point(1, 1), new Point(1, -1));
        rectangle1 = new Quadrilateral(new Point(4, 2), new Point(3, 4), new Point(9, 7), new Point(10, 5));
        rectangle2 = new Quadrilateral(new Point(-2, -1), new Point(-2, 1), new Point(2, 1), new Point(2, -1));
        quad = new Quadrilateral(new Point(-2, -2), new Point(-1, 1), new Point(1, 1), new Point(1, -1));
    }

    @Test
    public void testIsRectangle() {
        assertEquals(square1.isRectangle(), true, "Se esperaba false para square1");
        assertTrue(square2.isRectangle(), "Se esperaba true para square2");
        assertEquals(rectangle1.isRectangle(), true, "Se esperaba false para rectangle1");
        assertTrue(rectangle2.isRectangle(), "Se esperaba true para rectangle2");
        assertFalse(quad.isRectangle(), "Se esperaba false para quad");
    }

    @Test
    public void testIsSquare() {
        assertEquals(square1.isSquare(), true, "Se esperaba false para square1");
        assertTrue(square2.isSquare(), "Se esperaba true para square2");
        assertFalse(rectangle1.isSquare(), "Se esperaba false para rectangle1");
        assertFalse(rectangle2.isSquare(), "Se esperaba false para rectangle2");
        assertFalse(quad.isSquare(), "Se esperaba false para quad");
    }
}
