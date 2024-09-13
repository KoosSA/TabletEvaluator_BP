package koossa.tcq.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import koossa.tqc.calculator.CalculatorSTD;

class CalculatorSTDTest {

	double[] values1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	double[] values2 = { 1.5, 10.5, 2.25, 3.9987, 100.8, 7.2586 };
	double[] values3 = { 0.125, 0.130, 0.127, 0.115, 0.120, 0.125, 0.125, 0.126, 0.124, 0.123, 0.127, 0.122, 0.128,
			0.129, 0.127, 0.124, 0.115, 0.119, 0.120, 0.123 };

	@Test
	void testSumArray1() {
		assertEquals(45.000000000000, CalculatorSTD.sum(values1));
	}

	@Test
	void testSumArray2() {
		assertEquals(126.3073, CalculatorSTD.sum(values2));
	}

	@Test
	void testAverageArray1() {
		assertEquals(5.000000000000, CalculatorSTD.getMeanValue(values1));
	}

	@Test
	void testAverageArray2() {
		assertEquals(21.05121667, CalculatorSTD.getMeanValue(values2), 0.001);
	}

	@Test
	void testDeviationPercentage() {
		assertEquals(1.051, CalculatorSTD.getAbsoluteDeviationPercentage(0.125, CalculatorSTD.getMeanValue(values3)), 0.001);
	}

}
