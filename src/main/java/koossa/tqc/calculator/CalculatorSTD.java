package koossa.tqc.calculator;

public class CalculatorSTD {
	
	public static double getMeanValue(double[] values) {
		if (values == null) {
			return Double.NaN;
		} else if (values.length <= 0) {
			return 0;
		} else {
			return (CalculatorSTD.sum(values) / (double) values.length);
		}
	}
	
	public static double sum(double[] values) {
		if (values == null) {
			return Double.NaN;
		} else if (values.length <= 0) {
			return 0;
		} else {
			double sum = 0;
			for (int i = 0; i < values.length; i++) {
				sum += values[i];
			}
			return sum;
		}
	}
	
	public static double getDeviationFraction(double testValue, double targetValue) {
		double result = 0;
		result = (targetValue - testValue) / targetValue;
		return result;
	}
	
	public static double getDeviationPercentage(double testValue, double targetValue) {
		return getDeviationFraction(testValue, targetValue) * 100.00000;
	}
	
	public static double getAbsoluteDeviationFraction(double testValue, double targetValue) {
		return Math.abs(getDeviationFraction(testValue, targetValue));
	}
	
	public static double getAbsoluteDeviationPercentage(double testValue, double targetValue) {
		return getAbsoluteDeviationFraction(testValue, targetValue) * 100.00000;
	}

}
