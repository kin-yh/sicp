package Solution_2_Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Filter {
	public static <T> List<T> apply(Function<T, Boolean> filtering, List<T> list){
		List<T> result = new ArrayList<T>();
		
		for(T item: list){
			if(filtering.apply(item)){
				result.add(item);
			}
		}
		
		return result;
	}
}