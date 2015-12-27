package Solution_1_46;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		double target = 137.0;
		Function<Object, Object> getNext = (guess) -> ((double)guess + (target / (double)guess)) / 2;
		
		Solution.IsCloseEnough isCloseEnough = (guess, value) -> (Math.abs((double)guess - (double)value) < 0.001);
		
		Solution solution = new Solution();
		Object result = solution.iteratvieImprovement(isCloseEnough, getNext, 1.0);
		
		System.out.println(result);
	}
}
