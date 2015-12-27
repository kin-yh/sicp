package Solution_1_2_1;

public class Solution {
	public long smallestDivisor(long n){
		return findDivisor(n, 2);
	}
	
	private long findDivisor(long n, int testDivisor){
		if(testDivisor*testDivisor > n){
			return n;
			
		}else if(n % testDivisor == 0){
			return testDivisor;
			
		}else{
			return findDivisor(n, next(testDivisor));
		}
	}
	
	private int next(int testDivisor){
		if(testDivisor == 2){
			return 3;
		}else{
			return testDivisor + 2;
		}
	}
}
