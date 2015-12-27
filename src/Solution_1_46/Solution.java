package Solution_1_46;

import java.util.function.Function;

public class Solution {
	private IsCloseEnough isCloseEnough;
	private Function<Object, Object> getNext;
	
	public Object iteratvieImprovement(IsCloseEnough isCloseEnough, Function<Object, Object> getNext, Object initValue) {
		this.isCloseEnough = isCloseEnough;
		this.getNext = getNext;
		
		return this.iter(initValue);
	}
	
	private Object iter(Object value){
		Object next = this.getNext.apply(value);
		
		if(isCloseEnough.apply(next, value)){
			return next;
		}
		
		return iter(next);
	}
	
	@FunctionalInterface
	public interface IsCloseEnough{
		public Boolean apply(Object param1, Object param2);
	}
}
