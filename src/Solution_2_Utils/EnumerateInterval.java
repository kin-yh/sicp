package Solution_2_Utils;

import java.util.ArrayList;
import java.util.List;

public class EnumerateInterval {
	public static List<Integer> apply(int from, int to){
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = from; i <= to; i++){
			result.add(i);
		}
		
		return result;
	}
}
