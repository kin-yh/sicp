package Solution_1_44;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		Function<Double, Double> temp = (Double input) -> input * 1.1245213;
		
		Double result = solution.smooth(temp).apply(10.0);
		System.out.println(result);
		
		Solution_1_43.Solution solution43 = new Solution_1_43.Solution();
		Double result2 = (Double)solution43.repeated(solution.smooth(temp), 2).apply(10.0);
		System.out.println(result2);
	}
}
