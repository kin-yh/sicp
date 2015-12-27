package Solution_1_45;

import java.util.function.Function;

public class Solution {
	public double getNthRoot(int number, int n) {
		Function<Function<Double, Double>, Function<Double, Double>> avgDamp = 
				(Function<Double, Double> function) -> ( (x) -> (x + function.apply(x)) / 2 );

		Function<Double, Double> next = (input) -> number / Math.pow(input, n - 1);
		Function repeated = this.repeat(avgDamp, getMaxDoublePower(n));

		Solution_1_36.Solution solution36 = new Solution_1_36.Solution();
		return solution36.fixedPoint((Function) repeated.apply(next), 1.0);
	}

	private Function repeat(Function function, int times) {
		return repeatIter(function, times, function);
	}

	private Function repeatIter(Function function, int times, Function result) {
		if (times == 1) {
			return result;

		} else {
			Function repeated = (input) -> function.apply(result.apply(input));

			return this.repeatIter(function, times - 1, repeated);
		}
	}

	private int getMaxDoublePower(int power) {
		int doublePowerCnt = 0;

		int resultPower = power;
		while (true) {
			resultPower = resultPower / 2;
			if (resultPower == 0) {
				break;
			}

			doublePowerCnt++;
		}

		return doublePowerCnt;
	}
}
