package Solution_2_42;

public class Coordinate {
	private final int x;
	private final int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("(x : " + x);
		sb.append(", y : " + y).append(")");
		
		return sb.toString();
	}
}
