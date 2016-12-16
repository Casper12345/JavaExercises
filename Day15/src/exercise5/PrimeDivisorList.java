package exercise5;

import java.util.*;

public class PrimeDivisorList {
	
	private List<Integer> primeList; 
	
	public PrimeDivisorList(){
		
		this.primeList = new ArrayList<Integer>();
	}
	
	public void add(Integer add){
		primeList.add(add);
		
	}
	
	public Integer get(int index){
		return primeList.get(index);
	}
	
	
}