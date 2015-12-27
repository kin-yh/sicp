package Solution_1_39;

import static Solution_1_39.Solution.*;

public class Main {

	public static void main(String[] args) {
		int x = 10;
		
		F n = (double arg) -> (arg == 1)? x : Math.pow(x, 2);
		F d = (double arg) -> 2*arg-1;
		
		int k = 1100;
		
		Solution solution = new Solution();
		double result = solution.contFrac(n, d, k);

		System.out.println("result : " + result);
		
		System.out.println("Math.tan(x) : " + Math.tan(x));
	}

}
