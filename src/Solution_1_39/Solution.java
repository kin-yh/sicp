package Solution_1_39;

public class Solution {
	private F n = null;
	private F d = null;
	
	public double contFrac(F n, F d, int k){
		this.n = n;
		this.d = d;
		
		return iter(k, 0);
	}
	
	public double iter(int i, double result){
		System.out.println("i : " + i + " // result : " + result);
		
		if(i == 0){
			return result;
		}else{
			return iter(i-1, n.run(i) / (d.run(i) - result));
		}
	}
	
	public interface F{
		double run (double arg);
	}
}
