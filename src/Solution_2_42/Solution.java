package Solution_2_42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Solution_2_Utils.EnumerateInterval;
import Solution_2_Utils.Filter;
import Solution_2_Utils.FlatMap;
import Solution_2_Utils.Map;

public class Solution {
	final private Coordinate emptyBoard = new Coordinate(0, 0);
	private int boardSize = 0;
	
	public List<List<Coordinate>> queens(int boardSize){
		this.boardSize = boardSize; 
		
		return queensCols(boardSize);
	}
	
	private List<List<Coordinate>> queensCols(int k){
		if(k == 0){
			return Arrays.asList(Collections.emptyList());
		}
		
		List<List<Coordinate>> enumerateList = FlatMap.apply(
				(restOfQueens)
					-> Map.apply((Integer newRow)
							-> this.adjoinPosition(newRow, k, restOfQueens),
					EnumerateInterval.apply(1, boardSize)),
				this.queensCols(k-1));

		List<List<Coordinate>> filteredList = Filter.apply((positions) -> this.isSafe(k, positions), enumerateList);
		
		return filteredList;
	}
	
	private Boolean isSafe(int k, List<Coordinate> positions){
		Coordinate kItem = positions.get(0);
		
		boolean result = true;
		for(int i = 1; i < positions.size(); i++){
			Coordinate item = positions.get(i);
			
			if(item == emptyBoard){
				break;
			}
			
			if(kItem.getY() == item.getY()){
				result = false;
				break;
				
			}else if(Math.abs(kItem.getX() - item.getX()) == Math.abs(kItem.getY() - item.getY())){
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	private List<Coordinate> adjoinPosition(int newRow, int k , List<Coordinate> restOfQueens){
		List<Coordinate> result = new ArrayList<Coordinate>();
		result.add(new Coordinate(k, newRow));
		
		result.addAll(restOfQueens);
		
		return result;
	}
	
	
}