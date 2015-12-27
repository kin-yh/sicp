package Solution_2_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Solution {

	public List<Integer> sameParity(int ...args){
		Function<Integer, Boolean> isEven = (input) -> input % 2 == 0;
		Function<Integer, Boolean> isOdd = (input) -> input % 2 == 1;
		
		Function<Integer, Boolean> isCorrect;
		if(isEven.apply(args[0])){
			isCorrect = isEven;
		}else{
			isCorrect = isOdd;
		}
		
		return iter(args, new ArrayList<Integer>(), isCorrect);
	}
	
	private List<Integer> iter(int[] args, List<Integer> result, Function<Integer, Boolean> isCorrect){
		if(args.length == 0){
			return result;
		}

		if(isCorrect.apply(args[0])){
			result.add(args[0]);
		}
		
		return this.iter(Arrays.copyOfRange(args, 1, args.length), result, isCorrect);
	}
}