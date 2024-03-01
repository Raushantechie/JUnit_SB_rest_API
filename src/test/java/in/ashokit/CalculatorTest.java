package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.ashokit.beans.Calculator;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator c = new Calculator();
		int actualresultadd = c.add(10, 22);
		assertEquals(32, actualresultadd);

	}

	@Test
	public void mulTest() {
		Calculator c = new Calculator();
		int actualresultmul = c.mul(10, 10);
		assertEquals(100, actualresultmul);
	}

}
