package Solution_1_22;

import java.util.Date;

public class Solution {
	private int stopCount = 0;
	
	public void searchForPrimes(long startNumber, int stopCount){
		this.stopCount = stopCount;
		
		Date start = new Date();
		while(true){
			if(this.stopCount == 0){
				break;
			}
			
			timedPrimeTest(startNumber++);
		}
		
		System.out.println(new Date().getTime() - start.getTime());
	}
	
	private void timedPrimeTest(long n){
//		System.out.println("\n");
//		System.out.println(n);
		startPrimeTest(n);
	}
	
	private void startPrimeTest(long n){
		if(this.prime(n)){
			stopCount--;
			System.out.println("***");
			System.out.println(n);
		}
	}
	
	private boolean prime(long n){
		return n == new Solution_1_2_1.Solution().smallestDivisor(n);
	}
}
