package Solution_1_44;

import java.util.function.Function;

public class Solution {
	private static final double dx = 5;
	
	public Function<Double, Double> smooth(Function<Double, Double> function){
		return (Double x) -> (function.apply(x - dx) + function.apply(x) + function.apply(x + dx)) / 3;
	}
}
