package Solution_2_Utils;

import java.util.List;
import java.util.function.Function;

public class FlatMap {
	public static <T, R extends List> R apply(Function<T, R> proc, List<T> list){
		List<R> mapResult = Map.apply(proc, list);
		
		R result = null;
		
		for(R item: mapResult){
			if(result == null){
				result = item;
				continue;
			}
			
			result.addAll(item);
		}
		
		return result;
	}
}
