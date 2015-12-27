package Solution_1_36;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();

//		F f = getSqrt();
//		F f = getGoldenRate();
		Function<Double, Double> f = getLog();
		final double firstGuess = 10.0;

		double result = solution.fixedPoint(f, firstGuess);

		System.out.println("");
		System.out.println("--------------------------");
		System.out.println("");

		System.out.println("fixed point result : " + result);
	}

	private static Function<Double, Double> getSqrt() {
		final double x = 5.0;
		Function<Double, Double> f = (arg) -> ((x / arg) + arg) / 2;

		return f;
	}

	private static Function<Double, Double> getGoldenRate() {
		Function<Double, Double> f = (arg) -> 1 + 1 / arg; 
		
		return f;
	}
	
	private static Function<Double, Double> getLog(){
		Function<Double, Double> f = (arg) -> Math.log(1000) / Math.log(arg);
		
		return f;
	}

}
