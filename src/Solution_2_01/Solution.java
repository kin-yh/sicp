package Solution_2_01;

public class Solution {
	public static void makeRat(double n, double d){
		
	}
	
	public static void makeRat(Rat n, Rat d){
		
	}
	
	private static int getNumber(Rat rat){
		return rat.getNumber();
	}
	
	private static int getDenom(Rat rat){
		return rat.getDenom();
	}
	
	public static class Rat{
		private int number;
		private int denom;
		
		public Rat(int number, int denom) {
			this.number = number;
			this.denom = denom;
		}

		private int getNumber() {
			return number;
		}

		private int getDenom() {
			return denom;
		}
	}
}
