package Solution_1_43;

import java.util.function.Function;

public class Solution {
	public Function repeated(Function function, int times){
		return repeatedIter(function, function, times);
//		return repeatedIter2(function, times);
	}
	
	private Function repeatedIter(Function function, Function resultFunction, int times){
		if(times == 1){
			return resultFunction;
		}else{
			Function nextFunction = resultFunction.andThen(function); 
			
			return this.repeatedIter(function, nextFunction, times-1);
		}
	}
	
	private Function repeatedIter2(Function function, int times){
		Function result = function;
		
		for(int i = 1; i < times; i++){
			result = result.andThen(function);
		}
		
		return result;
	}
}
