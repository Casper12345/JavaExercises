package exercise2;

import java.math.BigInteger;

public class Exercise2_3 {
	
	public static void main(String[] args){
		
		System.out.println(hannoiCal(64));
		
		
	}
	
	public static BigInteger hannoiCal(int n){
		
		int i = 0;
		BigInteger moves = BigInteger.ZERO;
		
		while(n > i){
			
			if(i == 1){
				moves = moves.add( BigInteger.ONE);
			}
			
			BigInteger temp = BigInteger.ZERO;
			temp = temp.add(moves);
			moves = moves.add(BigInteger.ONE);
			moves = moves.add(temp);
			moves = moves.add(temp);	
		
		
		i++;
		
		}
		return moves;
	}	
		

}