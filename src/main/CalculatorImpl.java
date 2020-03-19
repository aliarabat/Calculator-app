package main;

public class CalculatorImpl implements Calculator {

	@Override
	public int multiply(int a, int b) {
		int res = 0;
		int i = 0;
		while (i < Math.abs(a)) {
			for (int j = 0; j < Math.abs(b); j++) {
				res++;
			}
			i++;
		}
		int logb = b > 0 ? res : -res;
		res = a > 0 ? logb : -logb;
		return res;
	}

	@Override
	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		int loga = Math.abs(a);
		int logb = Math.abs(b);
		int res = 0;
		for (int i = logb; i <= loga; i = i + logb) {
			res++;
		}

		int res1 = b > 0 ? res : -res;
		return a > 0 ? res1 : -res1;
	}

	@Override
	public int add(int a, int b) {
		int res = a;
		if (b > 0) {
			for (int i = 0; i < b; i++) {
				res++;
			}
		} else {
			for (int i = 0; i < -b; i++) {
				res--;
			}
		}
		return res;
	}

	@Override
	public int substruct(int a, int b) {
		int res = a;
		if (b > 0) {
			for (int i = 0; i < b; i++) {
				res--;
			}
		} else {
			for (int i = 0; i < -b; i++) {
				res++;
			}
		}
		return res;
	}

}
