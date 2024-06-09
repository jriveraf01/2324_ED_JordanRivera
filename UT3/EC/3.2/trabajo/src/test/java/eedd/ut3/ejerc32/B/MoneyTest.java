package eedd.ut3.ejerc32.B;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    Currency SEK, DKK, NOK, EUR;
    Money SEK100, EUR10, SEK200, EUR20, SEK0, EUR0, SEKn100;

    @BeforeEach
    public void setUp() {
        SEK = new Currency("SEK", 0.15);
        DKK = new Currency("DKK", 0.20);
        EUR = new Currency("EUR", 1.5);
        SEK100 = new Money(10000, SEK);
        EUR10 = new Money(1000, EUR);
        SEK200 = new Money(20000, SEK);
        EUR20 = new Money(2000, EUR);
        SEK0 = new Money(0, SEK);
        EUR0 = new Money(0, EUR);
        SEKn100 = new Money(-10000, SEK);
    }

    @Test
    public void testGetAmount() {
        assertEquals(10000, SEK100.getAmount());
        assertEquals(1000, EUR10.getAmount());
        assertEquals(20000, SEK200.getAmount());
        assertEquals(2000, EUR20.getAmount());
    }

    @Test
    @DisplayName("Test moneda en los billetes es la correcta")
    public void testGetCurrency() {
        assertSame(SEK, SEK100.getCurrency());
        assertSame(EUR, EUR10.getCurrency());
        assertSame(SEK, SEK200.getCurrency());
        assertSame(EUR, EUR20.getCurrency());
        assertSame(SEK, SEK0.getCurrency());
        assertSame(EUR, EUR0.getCurrency());
        assertSame(SEK, SEKn100.getCurrency());

        assertEquals("SEK", SEK100.getCurrency().getName());
        assertEquals("EUR", EUR10.getCurrency().getName());
        assertEquals("SEK", SEK200.getCurrency().getName());
        assertEquals("EUR", EUR20.getCurrency().getName());
        assertEquals("SEK", SEK0.getCurrency().getName());
        assertEquals("EUR", EUR0.getCurrency().getName());
        assertEquals("SEK", SEKn100.getCurrency().getName());
    }

    @Test
    @DisplayName("Test toString billete es correcto")
    public void testToString() {
        assertEquals("100,00 SEK", SEK100.toString());
        assertEquals("10,00 EUR", EUR10.toString());
        assertEquals("200,00 SEK", SEK200.toString());
        assertEquals("20,00 EUR", EUR20.toString());
        assertEquals("0,00 SEK", SEK0.toString());
        assertEquals("0,00 EUR", EUR0.toString());
        assertEquals("-100,00 SEK", SEKn100.toString());
    }

    @Test
    public void testGlobalValue() {
        assertEquals(1500, SEK100.universalValue());
        assertTrue(EUR10.equals(SEK100));
    }

    @Test
    @DisplayName("Test equivalencias en dinero")
    public void testEqualsMoney() {
        assertTrue(SEK0.equals(EUR0));
        assertFalse(EUR10.equals(EUR20));
        assertFalse(SEK0.equals(EUR10));
        assertFalse(SEKn100.equals(EUR0));
        assertTrue(EUR10.equals(EUR10));
        assertTrue(EUR10.equals(SEK100));
    }

    //@Test
    //@DisplayName("Test sumar dinero")
    //public void testAdd() {
    //    assertEquals(new Money(0, SEK), SEK0.add(EUR0));
    //    assertEquals(new Money(20000, SEK), SEK100.add(EUR10));
    //    assertEquals(new Money(40000, SEK), SEK200.add(SEK200));
    //}

    //@Test
    //@DisplayName("Test restar dinero")
    //public void testSub() {
    //    assertEquals(new Money(0, SEK), SEK0.sub(EUR0));
    //    assertEquals(new Money(0, SEK), SEK100.sub(EUR10));
    //    assertEquals(new Money(0, SEK), SEK200.sub(SEK200));
    //    assertEquals(new Money(-20000, SEK), SEKn100.sub(SEKn100));
    //}

    @Test
    @DisplayName("Test es Zero")
    public void testIsZero() {
        assertFalse(SEK100.isZero());
        assertTrue(SEK0.isZero());
        assertTrue(EUR0.isZero());
        assertFalse(SEKn100.isZero());
    }

    //@Test
    //@DisplayName("Test negar dinero")
    //public void testNegate() {
    //    assertEquals(new Money(0, EUR), EUR0.negate());
    //    assertEquals(new Money(-10000, SEK), SEK100.negate());
    //    assertEquals(new Money(10000, SEK), SEKn100.negate());
    //    assertEquals(new Money(-20000, SEK), SEK200.negate());
    //}

    @Test
    @DisplayName("Test comparar")
    public void testCompareTo() {
        assertTrue(SEKn100.compareTo(EUR20) < 0);
        assertEquals(0, EUR0.compareTo(SEK0));
    }
}
