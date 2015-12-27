package Solution_1_43;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		Function<Integer, Integer> square = (Integer arg) -> arg * arg;
		
		square.andThen(square).andThen(square).andThen(square);
		System.out.println(solution.repeated(square, 4).apply(2));
	}

}
