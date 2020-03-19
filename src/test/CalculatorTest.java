package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;
import main.CalculatorImpl;

class CalculatorTest {

	private final Calculator calculator = new CalculatorImpl();

	/*
	 * Test de multiplication
	 */
	@Test
	void multipyPosPos() {
		int expected = 30;
		int actual = calculator.multiply(5, 6);
		assertEquals(expected, actual);
	}

	@Test
	void multipyA0() {
		int expected = 0;
		int actual = calculator.multiply(0, 5);
		assertEquals(expected, actual);
	}

	@Test
	void multipyB0() {
		int expected = 0;
		int actual = calculator.multiply(6, 0);
		assertEquals(expected, actual);
	}

	@Test
	void multipyPosNeg() {
		int expected = -30;
		int actual = calculator.multiply(6, -5);
		assertEquals(expected, actual);
	}

	@Test
	void multipyNegNeg() {
		int expected = 30;
		int actual = calculator.multiply(-6, -5);
		assertEquals(expected, actual);
	}

	/*
	 * Test de division
	 */
	@Test
	void divisionAGrandB() {
		int expected = 1;
		int actual = calculator.divide(6, 5);
		assertEquals(expected, actual);
	}

	@Test
	void divisionBGrandA() {
		int expected = 0;
		int actual = calculator.divide(5, 6);
		assertEquals(expected, actual);
	}

	@Test
	void divisionAEqualsB() {
		int expected = 1;
		int actual = calculator.divide(6, 6);
		assertEquals(expected, actual);
	}

	@Test
	void divisionB0() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(6, 0);
		});
	}

	@Test
	void divisionNegNeg() {
		int expected = 1;
		int actual = calculator.divide(-6, -5);
		assertEquals(expected, actual);
	}

	/*
	 * Test d'addition
	 */
	@Test
	void additionNormal() {
		int expected = 11;
		int actual = calculator.add(6, 5);
		assertEquals(expected, actual);
	}

	@Test
	void additionBNeg() {
		int expected = 1;
		int actual = calculator.add(6, -5);
		assertEquals(expected, actual);
	}

	@Test
	void additionANeg() {
		int expected = -1;
		int actual = calculator.add(-6, 5);
		assertEquals(expected, actual);
	}

	@Test
	void additionAnegBNeg() {
		int expected = -11;
		int actual = calculator.add(-6, -5);
		assertEquals(expected, actual);
	}

	/*
	 * Test de soustraction
	 */
	@Test
	void substructionNormal() {
		int expected = 1;
		int actual = calculator.substruct(6, 5);
		assertEquals(expected, actual);
	}

	@Test
	void substructionA0b0() {
		int expected = 0;
		int actual = calculator.substruct(0, 0);
		assertEquals(expected, actual);
	}

	@Test
	void substructionANeg() {
		int expected = -11;
		int actual = calculator.substruct(-6, 5);
		assertEquals(expected, actual);
	}

	@Test
	void substructionBNeg() {
		int expected = 11;
		int actual = calculator.substruct(6, -5);
		assertEquals(expected, actual);
	}

	@Test
	void substructionAnegBNeg() {
		int expected = -1;
		int actual = calculator.substruct(-6, -5);
		assertEquals(expected, actual);
	}

}
