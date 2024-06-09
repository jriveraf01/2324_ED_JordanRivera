package eedd.ut3.ejerc33.B;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
	Currency SEK, DKK;
	Bank SweBank, Nordea, DanskeBank;

	@BeforeEach
	public void setUp() throws Exception {
		DKK = new Currency("DKK", 0.20);
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		Nordea = new Bank("Nordea", SEK);
		DanskeBank = new Bank("DanskeBank", DKK);
		SweBank.openAccount("Ulrika");
		SweBank.openAccount("Bob");
		Nordea.openAccount("Bob");
		DanskeBank.openAccount("Gertrud");
	}

	@Test
	public void testGetName() {
		assertEquals("SweBank", SweBank.getName());
	}

	@Test
	public void testGetCurrency() {
		assertEquals(SEK, SweBank.getCurrency());
	}

	@Test
	public void testOpenAccount() throws AccountExistsException, AccountDoesNotExistException {
		SweBank.openAccount("Alice");
		assertTrue(SweBank.getBalance("Alice") == 0);
	}

	@Test
	public void testDeposit() throws AccountDoesNotExistException {
		SweBank.deposit("Ulrika", new Money(50000, SEK));
		assertEquals(50000, SweBank.getBalance("Ulrika"));
	}

	@Test
	public void testWithdraw() throws AccountDoesNotExistException {
		SweBank.withdraw("Ulrika", new Money(0, SEK));
		assertEquals(0, SweBank.getBalance("Ulrika"));
	}

	@Test
	public void testGetBalance() throws AccountDoesNotExistException {
		assertEquals(0, SweBank.getBalance("Bob"));
	}

	@Test
	public void testTransfer() throws AccountDoesNotExistException {
		SweBank.deposit("Bob", new Money(100000, SEK));
		SweBank.transfer("Bob", Nordea, "Bob", new Money(50000, SEK));
		assertEquals(50000, SweBank.getBalance("Bob"));
		assertEquals(50000, Nordea.getBalance("Bob"));
	}

	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		SweBank.addTimedPayment("Bob", "payment1", 2, 0, new Money(0, SEK), SweBank, "Ulrika");
		SweBank.tick();
		assertEquals(0, SweBank.getBalance("Bob"));
		assertEquals(0, SweBank.getBalance("Ulrika"));
	}
}