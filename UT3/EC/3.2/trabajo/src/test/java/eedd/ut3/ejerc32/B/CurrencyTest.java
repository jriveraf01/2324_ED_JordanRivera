package eedd.ut3.ejerc32.B;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyTest {
	Currency SEK, DKK, NOK, EUR;

	@BeforeEach
	public void setUp() {
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
	}

	@Test
	@DisplayName("Test nombre de la moneda")
	public void testGetName() {
		assertEquals("SEK", SEK.getName());
		assertEquals("DKK", DKK.getName());
		assertEquals("EUR", EUR.getName());
	}

	@Test
	@DisplayName("Test ratio por moneda")
	public void testGetRate() {
		assertEquals(0.15, SEK.getRate(), 0.001);
		assertEquals(0.20, DKK.getRate(), 0.001);
		assertEquals(1.5, EUR.getRate(), 0.001);
	}

	@Test
	@DisplayName("Test asignar ratio moneda")
	public void testSetRate() {
		SEK.setRate(0.80);
		assertEquals(0.80, SEK.getRate(), 0.001);

		EUR.setRate(0.001);
		assertEquals(0.001, EUR.getRate(), 0.001);
	}

	@Test
	@DisplayName("Test universal valores monedas")
	public void testGlobalValue() {
		assertEquals(1500, SEK.universalValue(10000).intValue());
		assertEquals(2000, DKK.universalValue(10000).intValue());
		assertEquals(15000, EUR.universalValue(10000).intValue());
	}

	@Test
	@DisplayName("Test conversion entre monedas")
	public void testValueInThisCurrency() {
		assertEquals(10000, SEK.valueInThisCurrency(1000, EUR).intValue());
		assertEquals(10000, SEK.valueInThisCurrency(7500, DKK).intValue());
	}
}
