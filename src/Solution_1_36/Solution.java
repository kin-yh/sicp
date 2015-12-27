package Solution_1_36;

import java.util.function.Function;

public class Solution {
	private static final double TOLERANCE = 0.00001;
	private Function<Double, Double> f = null;
	
	public double fixedPoint(Function<Double, Double> f, double firstGuess){
		this.f = f;
		
		return tryIt(firstGuess);
	}
	
	private double tryIt(double guess){
		System.out.println("guess : " + guess);
		
		double next = f.apply(guess);
		
		if(closeEnough(guess, next)){
			System.out.println(next);
			return next;
			
		}else{
			return tryIt(next);
		}
	}

	private boolean closeEnough(double arg1, double arg2){
		return Math.abs(arg1 - arg2) < TOLERANCE;
	}
}
