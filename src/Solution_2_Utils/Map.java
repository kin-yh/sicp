package Solution_2_Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Map {
	public static <T, R> List<R> apply(Function<T, R> proc, List<T> list){
		List<R> result = new ArrayList<R>();
		
		for(T item: list){
			result.add(proc.apply(item));
		}
		
		return result;
	}
}
