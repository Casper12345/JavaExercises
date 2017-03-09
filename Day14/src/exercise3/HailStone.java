package exercise3;

import java.util.ArrayList;

public class HailStone{
	
	private ArrayList<Integer> listToReturn = new ArrayList<>();
	
	public ArrayList<Integer> getList(){
		return listToReturn;
	}
	
	public int hail(int n){
	    listToReturn.add(n);

		if(n == 1){
			return 1;
		}
		
		if(n%2 == 0){
			int aux = n/2;
			return hail(aux);
		
		}else{
			
			int aux2 = 3*n+1;
			return hail(aux2);
		}
		
	}
	
		
		
		//If the number n is even, the next number is n2
		//If the number is odd, the next number is 3n + 1

	
	
	
	
	
	
	
	
}