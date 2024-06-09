package eedd.ut3.ejerc33.A;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void tearDown() {
        fibonacci = null;
    }

    @Test
    public void testFibonacciTo5() {
        assertEquals(0, fibonacci.fib(0), "Se esperaba 0");
        assertEquals(1, fibonacci.fib(1), "Se esperaba 1");
        assertEquals(1, fibonacci.fib(2), "Se esperaba 1");
        assertEquals(2, fibonacci.fib(3), "Se esperaba 2");
        assertEquals(3, fibonacci.fib(4), "Se esperaba 3");
        assertEquals(5, fibonacci.fib(5), "Se esperaba 5");
    }

    @Test
    public void testFibonacciToOthers() {
        assertEquals(21, fibonacci.fib(8), "Se esperaba 21");
        assertEquals(55, fibonacci.fib(10), "Se esperaba 55");
        assertEquals(233, fibonacci.fib(13), "Se esperaba 233");
        assertEquals(610, fibonacci.fib(15), "Se esperaba 610");
        assertEquals(6765, fibonacci.fib(20), "Se esperaba 6765");
    }
}
