package Solution_1_41;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<String, String> test = (String arg) -> "this is result : " + arg;
		
		System.out.println(test.apply("input"));
		
		Function<Integer, Integer> inc = (Integer input) -> input+1;
		
		Function<Function, Function> doubleIt = (Function function) -> function.andThen(function);
		
		doubleIt.apply(doubleIt.apply(doubleIt)).apply(inc);
		
		System.out.println(doubleIt.apply(inc).apply(5));
		System.out.println(((Function<Integer, Integer>)doubleIt.apply(doubleIt.apply(doubleIt)).apply(inc)).apply(5));
	}

}
